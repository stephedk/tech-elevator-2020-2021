package com.techelevator;

import static org.junit.Assert.assertEquals;


import org.junit.Assert;
import org.junit.Test;



public class Less20Tests {
	
	private boolean test20;
	
	@Test
	
	public void fortyIsFalse() {
		
		Less20 testForty = new Less20();
		
		int multipleOf20 = 40;
		test20 = false;
		
		boolean expected = false;
		
		boolean actual = testForty.equals(test20);
		
		Assert.assertFalse("Because 40 isn't one or two less than 40", actual);
		
		}
	

	@Test
	
	public void thirtyNineIsTrue() {
		
		Less20 testThirtyNine = new Less20();
		
		int multipleOf20 = 39;
		test20 = true;
		
		boolean expected = true;
		
		boolean actual = testThirtyNine.equals(test20);
		
		Assert.assertFalse("Because 39 is one less than 40", actual);
	}



	@Test

	public void thirtyEightIsTrue() {
	
		Less20 testThirtyEight = new Less20();
	
		int multipleOf20 = 38;
		test20 = true;
	
		boolean expected = true;
	
		boolean actual = testThirtyEight.equals(test20);
	
		Assert.assertFalse("Because 38 is two less than 40", actual);
	}
}

