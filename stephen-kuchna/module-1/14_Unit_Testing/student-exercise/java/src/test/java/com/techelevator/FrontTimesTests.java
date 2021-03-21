package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;



public class FrontTimesTests {
	
	@Test
	
	public void iGuessIWillTryAndFigureOutHowToWriteAChocolateTwoTest() {
	
		FrontTimes eminenceFront = new FrontTimes();
			
			String putOn = "Chocolate";
			int flapFloop = 2;
			String argleBargle = "ChoCho";
			
			String floopFlap = eminenceFront.generateString(putOn, flapFloop);
			
			Assert.assertEquals(argleBargle, floopFlap);
		}
	
		@Test
		
		public void ChocolateThreeTest() {
			
			FrontTimes suckasBeFronting = new FrontTimes();
			
			String suckaMC = "Chocolate";
			int freshFor89 = 3;
			String youSuckas = "ChoChoCho";
			
			String pullinStunts = suckasBeFronting.generateString(suckaMC, freshFor89);
			
			Assert.assertEquals(youSuckas, pullinStunts);
			
		}


		@Test
		
		public void aBCToTheThree() {
			
			FrontTimes backToTheFront = new FrontTimes();
			
			String oneTwoThree = "Abc";
			int easyAs = 3;
			String doeRayMe = "AbcAbcAbc";
			
			String babyYouAndMeGirl = backToTheFront.generateString(oneTwoThree, easyAs);
			
			Assert.assertEquals(doeRayMe, babyYouAndMeGirl);
			
		}

		@Test
		
		public void lessThanThreeTimesFour() {
			
			FrontTimes beBadCrimes = new FrontTimes();
			
			String dopeRhymes = "Yo";
			int dropDimes = 3;
			String shotBy = "YoYoYo";
			
			String shyGuyWithTheGlassEye = beBadCrimes.generateString(dopeRhymes, dropDimes);
			
			Assert.assertEquals(shotBy, shyGuyWithTheGlassEye);
		}
}
	
