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
	
	

}
