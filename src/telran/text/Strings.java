package telran.text;


import static telran.text.RegularExpressions.*;

import java.util.Arrays;


public class Strings {
/**
 * 
 * @param str1 ascii string with no repeated symbols
 * @param str2 ascii string with no repeated symbols
 * @return array with two numbers
 *    first - number of the symbols of the str2 that exist in str1 at the same indexes
 *    second - number of the symbols of the str2 that exist in str1 at different indexes
 */
	public static int[] deepNoRepeatedCompare(String str1, String str2) {
	int Ares [] = {0, 0};
	for(int i = 1; i <= str2.length(); i++) {
		int pInd = str1.indexOf(str2.substring(i-1, i));
		if ((pInd > - 1) && (pInd == i-1)) {
			Ares[0]++;
		      }
			else {
				if (pInd > - 1) Ares[1]++;
			}
	}

		//Two implementation hints
		//   first: additional helper array such that array['a'] 
		//          is an index of the symbol 'a' in str1 or -1
		//          example, str1 - "ctab" then array['a'] = 2;
		// ************************************************
		//   second: implementation based on the method indexOf

	return Ares;
}
	/**
	 * 
	 * @param str1 English letters (may have repeats)
	 * @param str2 English letters (may have repeats)
	 * @return true if :
	 *     (1) str2 has the same as str1 length
	 *     (2) str2 comprises of all letters from str1
	 */
	public static boolean isAnagram(String str1, String str2) {

			char[] ResStr1 = str1.toCharArray();		
			char[] ResStr2 = str2.toCharArray();
			
			Arrays.sort(ResStr1);
		 	Arrays.sort(ResStr2);
		 	
		// additional helper array such that array['a'] is the number of 'a' occurrences in str1
		//str1 = "hello", array['l'] = 2; array['w'] = 0;
		return   Arrays.equals(ResStr1, ResStr2);
		
	
}
	static public String join(String[] array, String delimiter) {
		//STring "+" operator based solution
		return stringPluseSolution(array, delimiter);
		//StringBuilder attend based solution
		//return stringBuilderSolution(array, delimiter);
	}
	static private String stringBuilderSolution(String[] array, String delimiter) {
		StringBuilder strBuilder = new StringBuilder(array[0]);
		for(int i = 1; i < array.length; i++) {
			strBuilder.append(delimiter).append(array[i]);
		}
		return strBuilder.toString();
	}
	static private String stringPluseSolution(String[] array, String delimiter) {
		String res = array[0]; //assumption: there is at least one string
		for(int i = 1; i < array.length; i++) {
			res += delimiter + array[i] ;
		}
		return res;
	}
	/**
	 * 
	 * @param name1 -  first name 
	 * @param name2 - second name
	 * @return either "match" or "no match" in accordance to the comments (see TODO)
	 */
	static public String matches(String name1, String name2) {
		
		if (name1.compareToIgnoreCase(name2) == 0) return "match";
		
		String res  = "0";
        String[] nameA = name1.split(" ");
        String[] nameB = name2.split(" "); 
       
        //sit1
        if (nameA.length == 1 && nameB.length == 1) res  = "no match";
        
        //Sit2
        if (nameA.length == 2 && nameB.length == 2) {
        	if (nameA[0].compareToIgnoreCase(nameB[0]) == 0) {
        		if (nameA[1].charAt(0) == nameB[1].charAt(0)) {
        			res ="match";        			
        		}
        		else res = "no match";
        	}
        }
        
        //sit3
        if (nameA.length == 3 && nameB.length == 2) {
        	
        	if (nameA[2].compareToIgnoreCase(nameB[1]) == 0) {
        	
        		if (nameA[1].equalsIgnoreCase(nameB[0]) || (nameA[0].equalsIgnoreCase(nameB[0]))){
        			res = "match";
        		}
        		else res = "no match";
        	}
            	
        }
        
        //sit4
        if (nameA.length == 3 && nameB.length == 3) res  = "no match";
  
        
//      String matches(String name1, String name2)
//      Names match under the following conditions, after breaking each one into "name parts" on whitespace :
//      - Two name parts match if they are the same (case insensitive) or one is a single letter initial and the other is longer but starts with the same letter.
//      - A name part in  the name1 may be missing from the name2
//      - Name parts in one name must not contradict name parts in the other
//      - Name parts that match must be in the same order in both names
		return res;
	}
	/**
	 * sorts array of strings
	 * @param strNumbers array of strings containing the positive integer numbers
	 * length of each string can not be more than three symbols
	 * String containing "123" should be greater than string containing "23" as the number 123 greater than
	 * number 23
	 */
	static public int[] sortStringsAsNumbers(String[] strNumbers) {
//Algorithm complexity should be O[N]
//Implementation hint: additional helper array such that ar[10] - count of occurrences
//of number 10 in the given array
//find out how to get number from a string and how to convert number to string
		int[] matrix;
		matrix = new int[999]; 
		int numStr = strNumbers.length;
		int[] res;
		res = new int[numStr];
		int numMax = 0;
		int numTek;
		
			for(int i = 0; i < numStr ; i++) {
			numTek = Integer.parseInt(strNumbers[i]);
			
				if (numTek > numMax) numMax = numTek;
				matrix[numTek]++;
			}
		int j = 0;
		
			for(int i = numMax; i > 0 ; i--) {
				if (matrix[i] > 0) {
						res[j] = i;
						j++;
				}
			}
				
		return res;
	}
public static boolean isIPv4(String ipV4str) {
		
		return ipV4str.matches(ipV4Regex());
	}
	
	public static boolean isJavaVariable(String javaVariable) {
		
		return javaVariable.matches(javaVariableRegex());
	}
	
	
	public static boolean isArithmeticExpression(String expression) {
		if (!checkParentheses(expression)) {

			return false;
		}

		expression = removeSpacesAndParentheses(expression);

		return expression.matches(arithmeticExpression());
	}
	/**
	 * 
	 * @param expression
	 * returns string with no parentheses and no spaces
	 */
	private static String removeSpacesAndParentheses(String expression) {

		String Str = expression;
		Str = Str.replace("(", "");
		Str = Str.replace(")", "");
		Str = Str.replace(" ", "");

		return Str;

	}
	/**
	 * 
	 * @param expression
	 * @return true if for each '(' there is ')'
	 * examples: (ab)(dg(g)) - true
	 * (ab))((cd) - false
	 */
	private static boolean checkParentheses(String expression) {

		// Hint: count with ++ for '(' and -- ')'.

		if (expression.contains(")("))
			return false;
		int count = 0;

		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '(')
				count++;
			if (expression.charAt(i) == ')')
				count--;
			if (count == -1)
				return false;

		}
		if (count != 0)
			return false;

		return true;
	}

}