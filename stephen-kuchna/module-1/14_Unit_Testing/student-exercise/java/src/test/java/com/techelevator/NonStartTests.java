package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;



public class NonStartTests {
	
	@Test
	
	public void firstNonStartTestElloHere(){
		
		NonStart andyCapp = new NonStart();
		
		String flip = "Hello ";
		String flop = "There";
		String fry = "ello here";
		
		String elloGuv = andyCapp.getPartialString(flip, flop);
		
		Assert.assertEquals(fry, elloGuv);
		
		
	}

	@Test
	
	public void testingWithPhraseJavaCode(){
	
		NonStart snakeAndBacon = new NonStart();
		
		String clickwhirr = "java";
		String hoboBindle = "code";
		String beetleBoop = "avaode";
		
		String clubSandwich = snakeAndBacon.getPartialString(clickwhirr, hoboBindle);
		
		Assert.assertEquals(beetleBoop, clubSandwich);
		
	}

	@Test
	
	public void newTestHotMess(){
		
		NonStart westernSizzlin = new NonStart();
		
		String arbys = "shotl";
		String rax = "java";
		String burgerChef = "hotlava";
		
		String lordBurger = westernSizzlin.getPartialString(arbys, rax);
		
		Assert.assertEquals(burgerChef, lordBurger);
		
	}
}		
		

