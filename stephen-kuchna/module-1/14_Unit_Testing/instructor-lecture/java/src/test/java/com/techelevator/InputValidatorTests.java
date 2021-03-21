package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class InputValidatorTests
{
	
	@Test
	public void validate_shouldReturnTrue_forC()
	{
		// arrange
		String userInput = "C";
		String validationString = "c";
		
		boolean expected = true;
		
		// act
		boolean actual = InputValidator.validate(userInput, validationString);
		
		
		// assert
		Assert.assertEquals("Because user input should not be case sensitive", expected, actual);
		
	}
	
	@Test
	public void validate_shouldReturnTrue_forC_withWhiteSpace()
	{
		// arrange
		String userInput = " C ";
		String validationString = "c";
		
		boolean expected = true;
		
		// act
		boolean actual = InputValidator.validate(userInput, validationString);
		
		
		// assert
		Assert.assertEquals("Because user input should be trimmed of white space", expected, actual);
		
	}

}
