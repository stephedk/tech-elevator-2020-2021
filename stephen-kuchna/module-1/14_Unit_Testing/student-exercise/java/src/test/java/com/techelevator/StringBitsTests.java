package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

public class StringBitsTests {

	@Test 
	
	public void fromHiToH() {
		
		StringBits firstTest = new StringBits();
		
		String frillDoe = "Hi";
		String nawSyke = "H";
		
		String dogDogDog = firstTest.getBits(nawSyke);
		
		Assert.assertEquals(nawSyke, dogDogDog);
	
	}

	@Test
	
	public void fromHelloToHlo() {
		
		StringBits secondTest = new StringBits();
		
		String fatAlbert = "Hello";
		String whatYouLookinAt = "Hlo";
		
		String willis = secondTest.getBits(fatAlbert);
		
		Assert.assertEquals(whatYouLookinAt, willis);
	}

	@Test
	
	public void fromHeeololeoToHello() {
		
		StringBits jabberWocky = new StringBits();
		
		String gyreGimble = "Heeololeo";
		String vorpalBlade = "Hello";
		
		String snickerSnackt = jabberWocky.getBits(gyreGimble);
		
		Assert.assertEquals(vorpalBlade, snickerSnackt);
	}
	
	
}

