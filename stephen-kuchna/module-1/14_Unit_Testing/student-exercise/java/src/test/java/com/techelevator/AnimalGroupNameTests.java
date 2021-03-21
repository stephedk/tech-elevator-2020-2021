package com.techelevator;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class AnimalGroupNameTests {
	
	@Test
	
	public void lowercaseElephant_shouldBeAccepted() {
		
		AnimalGroupName animalGroup = new AnimalGroupName();
		
		String animalName = "elephant";
		
		String herdName = animalGroup.getHerd(animalName);
		
		assertEquals("Herd", herdName);
		
		
	}
	@Test
	
	public void upperCaseElephant_shouldBeAccepted() {
		
		AnimalGroupName animalGroup = new AnimalGroupName();
		
		String animalName = "ELEPHANT";
		
		String herdName = animalGroup.getHerd(animalName);
		
		assertEquals("Herd", herdName);
		
		
	}
	@Test
	
	public void anyRhino_shouldBeNull() {
		
		AnimalGroupName animalGroup = new AnimalGroupName();
		
		String animalName = "rhino";
		
		String herdName = animalGroup.getHerd(null);
		
		assertEquals("unknown", herdName);
	
	}
}
