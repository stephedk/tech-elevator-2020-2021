package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class CigarPartyTests {

	@Test
	public void haveParty_shouldReturnFalse_whenFewerThan30CigarsOnWeekday()
	{
		
		//arrange
		CigarParty party = new CigarParty(); //object under test
		
		int numberOfCigars = 30;
		boolean isWeekend = false;
		
		boolean expected = false;
		
		
		//act
		//call the function of the object under test
		boolean actual = party.haveParty(numberOfCigars, isWeekend);
		
		
		//assert
		Assert.assertFalse("Because parties with < 40 cigars suck", actual);

	}
	
	@Test
	public void haveParty2_shouldReturnFalse_whenFewerThan39CigarsOnWeekend()
	{
		
		CigarParty party2 = new CigarParty();
		
		int minCigarsWknd = 39;
		boolean isWeekend2 = false;
		
		boolean expected = false;
		
		boolean actual = party2.haveParty(minCigarsWknd, isWeekend2);
		
		Assert.assertFalse("recurring occurance of too few cigars maaaan", actual);
	}
	
}
