package com.techelevator;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


	public class TestLucky13 {
	
	private boolean getLucky;

	@Test 
	
	public void containsThrees() {
		
		Lucky13 firstTest = new Lucky13();
		
		int nums = 3;
		getLucky = false;
		
		boolean expected = false;
		
		boolean actual = firstTest.equals(getLucky);
		
		Assert.assertFalse("Because 3 isn't lucky", actual);
		
	}
		
	@Test 
	
	public void containsOnes() {
		
		Lucky13 secondTest = new Lucky13();
		
		int nums = 1;
		getLucky = false;
		
		boolean expected = false;
		
		boolean actual = secondTest.equals(getLucky);
		
		Assert.assertFalse("Because 1 isn't lucky", actual);
		
	}
}
			
		

	
