package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class MaxEnd3Tests {
	
	@Test
	
	public void lookManWhatDoYouWantFromMe() {
		
		MaxEnd3 firstTestAttempt = new MaxEnd3();
		
		int[] maxPower = {3,3,3};
		int[] inputVariable = {1,2,3};
		
		int[] willThisWorkPlease = firstTestAttempt.makeArray(inputVariable);
		
		Assert.assertArrayEquals(maxPower, willThisWorkPlease);
		
	}



	@Test
	
	public void secondTest() {
		
			MaxEnd3 threeElevens = new MaxEnd3();
			
			int[] maxSteele = {11,11,11};
			int[] roboForce = {11,5,9};
			
			int[] wheeledWarriors = threeElevens.makeArray(roboForce);
			
			Assert.assertArrayEquals(maxSteele, wheeledWarriors);
		
	}

	
	@Test
	
	public void thisNameShouldDescribeWhatImTestingButImSickOfThinkingOfTitles() {
		
		MaxEnd3 twoElevenThree = new MaxEnd3();
		
		int[] numbersToReturn = {3,3,3};
		int[] numbersGiven = {2,11,3};	
		
		int[] actualFactual = twoElevenThree.makeArray(numbersGiven);
		
		Assert.assertArrayEquals(numbersToReturn, actualFactual);
	}
}