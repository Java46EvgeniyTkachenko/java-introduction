package telran.text.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.text.Strings;

class StringsClassTests {
	private static final int N_RUNS = 1;
	private static final int N_STRINGS = 1;

	@Test
	void deepCompareTest() {
		String str1 = "123,tT89";
		String str2 = "123,tT89";
		String str3 = "19";
		String str5 = "98Tt,321";
		String str4 ="kugy";
		int expected1[] = {8, 0};
		int expected2[] = {1, 1};
		int expected3[] = {0, 8};
		int expected4[] = {0, 0};
		assertArrayEquals(expected1, Strings.deepNoRepeatedCompare(str1, str2));
		assertArrayEquals(expected2, Strings.deepNoRepeatedCompare(str1, str3));
		assertArrayEquals(expected3, Strings.deepNoRepeatedCompare(str1, str5));
		assertArrayEquals(expected4, Strings.deepNoRepeatedCompare(str1, str4));
	}
	
	@Test
	void isAnagramTests() {
		String str1 = "Hello";
		String str2 = "Helll";
		String str3 = "eloHl";
		String str4 = "Helo";
		assertTrue(Strings.isAnagram(str1, str3));
		assertFalse(Strings.isAnagram(str1, str2));
		assertFalse(Strings.isAnagram(str1, str4));
		assertTrue(Strings.isAnagram(str1, str1));
	}
	@Test
	void joinTest() {
		String array[] = {"Hello", "Vasya"};
		String expected = "Hello Vasya";
		assertEquals(expected, Strings.join(array, " "));
	}
	@Test
	void joinPerformanceTest() {
		String array[] = getBigArray();
		for(int i = 0; i < N_RUNS; i++) {
			Strings.join(array, " ");
		}
	}

	private String[] getBigArray() {
		String res[] = new String[N_STRINGS];
		for (int i = 0; i < res.length; i++) {
			res[i] = "Hello";
		}
		return res;
	}
	@Test
	void matchesTest() {
		//TODO
		//        Examples:
//	        - David vs. david: match
//	        - John F vs. John Fitzgerald: match
//	        - John K vs. John Fitzgerald: no match
//	        - Anna Maria Magdalena vs. Anna Magdalena: match
//	        - Anna Maria Magdalena vs. Maria Magdalena: match
//	        - Anna Maria Magdalena vs. Anna Maria Roberta: no match
//	        - Anna Maria Magdalena vs. Anna Magdalena Roberta: no match
//	        - Anna Maria Magdalena vs. Anna Magdalena Maria: no match
		String str1 = "David";
		String str2 = "david";
		String str3 = "John F";
		String str4 = "John Fitzgerald";
		String str5 = "John K";
		String str6 = "Anna Maria Magdalena";
		String str7 = "Anna Magdalena";
		String str8 = "Maria Magdalena";
		String str9 = "Anna Maria Roberta";
		String str10 = "Anna Magdalena Roberta";
		String str11 = "Anna Magdalena Maria";
		String expectedY = "match";
		String expectedN = "no match";
		assertEquals(expectedY, Strings.matches(str1, str2));   
		assertEquals(expectedY, Strings.matches(str3, str4)); 
		assertEquals(expectedN, Strings.matches(str5, str4)); 
		assertEquals(expectedY, Strings.matches(str6, str7)); 
		assertEquals(expectedY, Strings.matches(str6, str8)); 
		assertEquals(expectedN, Strings.matches(str6, str9)); 
		assertEquals(expectedN, Strings.matches(str6, str10)); 
		assertEquals(expectedN, Strings.matches(str6, str11)); 
			
	}
	@Test
	void sortStringsAsNumbersTest() {
		String str[] = {"123", "254", "23", "547", "11"};
		int expected[] = {547, 254, 123, 23, 11};
		
		assertArrayEquals(expected, Strings.sortStringsAsNumbers(str));
	}


}