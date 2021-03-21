package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class DateFashionTests {
	
	@Test
	
	public void aDateThatScoresOneShouldNotBeAccepted() {
		
		DateFashion badDate = new DateFashion();
		
		int getTable = 0;
		
		int tableResult = badDate.getATable(1, 1);
		
		Assert.assertTrue(getTable == tableResult);
		
	}

	@Test

	public void aDateThatScoresEightShouldBeAccepted() {
	
		DateFashion goodDate = new DateFashion();
	
		int getTable = 2;
	
		int tableResult = goodDate.getATable(8, 3);
	
		Assert.assertTrue(getTable == tableResult);
	}

	@Test

	public void aDateThatScoresSevenShouldReturnOne() {

		DateFashion sevenDate = new DateFashion();

		int getTable = 1;

		int tableResult = sevenDate.getATable(7, 3);

		Assert.assertTrue(getTable == tableResult);
	}


	@Test

	public void aDateThatScoresOneOverridesADateThatScoresEight() {

		DateFashion wackDate = new DateFashion();

		int getTable = 0;

		int tableResult = wackDate.getATable(8, 1);

		Assert.assertTrue(getTable == tableResult);
	}


	@Test

	public void testForDateScoreOfTwo() {

		DateFashion twoDate = new DateFashion();

		int getTable = 0;

		int tableResult = twoDate.getATable(8, 2);

		Assert.assertTrue(getTable == tableResult);
	}
}

		
		
	


