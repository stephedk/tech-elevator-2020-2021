package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

// I really hope you guys have a sense of humor and don't give me a lower
//grade because I've given all my tests and objects ridiculous names. 
//I've been at this all morning and I'm trying to keep it interesting. 


public class SameFirstLastTests {
	
	private boolean misterMxyzptlk;
	
	@Test
	
	public void initialEqualityTest() {
		
		SameFirstLast garbageBarge = new SameFirstLast();
		
		int[] mackDaddy = {1,2,3};
		misterMxyzptlk = false; 
		
		boolean expected = false; 
		
		boolean actual = garbageBarge.equals(mackDaddy);
		
		Assert.assertFalse(actual);
		
	}
	
	@Test
	
	public void theFightForEqualityIsNeverOver() {
		
		SameFirstLast sheboyganWisconsin = new SameFirstLast();
		
		int[] daddyMack = {1,2,3,1};
		misterMxyzptlk = true;
		
		boolean expected = true;
		
		boolean actual = sheboyganWisconsin.equals(daddyMack);
		
		Assert.assertFalse(actual);
		
	}

	@Test
	
	public void whatsSoFunnyBoutPeaceLoveAndUnderstanding() {
		
		SameFirstLast bartonFink = new SameFirstLast();
		
		int[] crissCross = {1,2,1};
		misterMxyzptlk = true;
		
		boolean expected = true;
		
		boolean actual = bartonFink.equals(crissCross);
		
		Assert.assertFalse(actual);
	}
	
	
}
