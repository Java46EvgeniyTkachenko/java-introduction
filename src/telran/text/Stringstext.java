package telran.text;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

public class Stringstext {
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
}