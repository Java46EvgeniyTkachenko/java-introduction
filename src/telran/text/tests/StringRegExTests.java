package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;
import static telran.text.Strings.*;

import org.junit.jupiter.api.Test;
class StringRegExTests {

	@Test
	void javaVariableTrue() {
		
		assertTrue(isJavaVariable("__"));
		assertTrue(isJavaVariable("$"));
		assertTrue(isJavaVariable("$_"));
		assertTrue(isJavaVariable("a"));
		assertTrue(isJavaVariable("abc100"));
		assertTrue(isJavaVariable("$2"));
		assertTrue(isJavaVariable("_2"));
		
	}
	@Test
	void javaVariableFalse() {
		assertFalse(isJavaVariable("2_"));
		assertFalse(isJavaVariable("_"));
		assertFalse(isJavaVariable("a 2"));
		
	}
	@Test
	void ipV4True() {
		assertTrue(isIPv4("0.0.0.0"));
		assertTrue(isIPv4("250.0.199.200"));
		assertTrue(isIPv4("250.0.199.249"));
		assertTrue(isIPv4("001.0.2.0"));
		assertTrue(isIPv4("255.255.255.255"));
	}
	@Test
	void ipV4False() {
		assertFalse(isIPv4("0.0.0.0.0"));
		assertFalse(isIPv4("0.*.10.0"));
		assertFalse(isIPv4("-10.0.0.0"));
		assertFalse(isIPv4("100..10.1.1"));
		assertFalse(isIPv4("100.10.1.256"));
		assertFalse(isIPv4("a.10.1.1"));
		
	}
	@Test
	void CheckArithmeticExpressionTrue() {
	assertTrue(isArithmeticExpression("( a + 2)+(c*1234.234)"));
	assertTrue(isArithmeticExpression("( R_d / 15.2)*(1234.234-y)"));
	
	}
	@Test
	void CheckArithmeticExpressionFalse() {
	assertFalse(isArithmeticExpression("( a + 2)+(b*2))"));
	assertFalse(isArithmeticExpression("( -5 / 15.2)*(4-y)"));
	assertFalse(isArithmeticExpression("( 5 / 15.2)(4-y)"));
	
	}
}
