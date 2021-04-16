package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeValidatorTest {
	
	PalindromeValidator validator = new PalindromeValidator();

	@Test
	void Given_SingleLetterString_WhenValidatingPalindrome_ThenTrue() {
		//Given
		String string = "a";
		//When
		boolean actualResult = validator.validate(string);
		boolean expectedResult = true;
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_2DifferentLetterString_WhenValidatingPalindrome_ThenFalse() {
		//Given
		String string = "ab";
		//When
		boolean actualResult = validator.validate(string);
		boolean expectedResult = false;
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_2DifferentLetterString_WhenValidatingPalindrome_ThenTrue() {
		//Given
		String string = "aa";
		//When
		boolean actualResult = validator.validate(string);
		boolean expectedResult = true;
		//Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_3DifferentLetterString_WhenValidatingPalindrome_ThenTrue() {
		//Given
		String string = "aaa";
		//When
		boolean actualResult = validator.validate(string);
		boolean expectedResult = true;
		//Then
		assertEquals(expectedResult, actualResult);
	}

}
