package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DemoTests
{
	@Test
	public void integerDivision_shouldTruncate_whenThereIsARemainder()
	{
		// arrange
		// -- setup variables for THIS test
		int numerator = 5;
		int denominator = 2;
		
		int expected = 2;
		
		
		// act
		// -- the ONE action that I am testing
		int actual = numerator / denominator;
		
		
		// assert
		// -- did it work
		// TEST ONLY 1 THING - 1 assert statement
		Assert.assertEquals("Because integer division truncates the remainder",expected, actual);
		
	}

}
