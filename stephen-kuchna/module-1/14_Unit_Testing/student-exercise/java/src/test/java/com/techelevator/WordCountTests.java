package com.techelevator;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class WordCountTests {
	
	@Test
	
	public void firstTestWithSheep() {
		
		WordCount dictionaryEntry = new WordCount();
		//Arrange
		Map<String, Integer> words = new HashMap<>();
				
		String[] word1 = {"ba", "ba", "black", "sheep"};
		
		Map<String, Integer> expected = new HashMap<String, Integer>() {{
				put("ba", 2);
				put("black", 1);
				put("sheep", 1);
			}};
				//Act
		Map<String, Integer> actual = dictionaryEntry.getCount(word1);
				//Assert
		Assert.assertEquals("New dictionary<string, int> will be", expected, actual);
	}

	@Test
	
	public void secondTestAbc() {
		
		WordCount someName = new WordCount();
		Map<String, Integer> spam = new HashMap<>();
		String[] bizzle = {"a", "b", "a", "c", "b"};
		
		Map<String, Integer> myAnswer = new HashMap<String, Integer>(){{
			put("a", 2);
			put("b", 2);
			put("c", 1);
		}};
		
		Map<String, Integer> yourAnswer = someName.getCount(bizzle);
		
		Assert.assertEquals(myAnswer, yourAnswer);
		
		}
	
	@Test
	
	public void thirdTestCba() {
		
		WordCount boomBap = new WordCount();
		Map<String, Integer> returnOfThe = new HashMap<>();
		String[] myNinja = {"c", "b", "a"};
		
		Map<String, Integer> krsOne = new HashMap<String, Integer>(){{
			put("c", 1);
			put("b", 1);
			put("a", 1);
		}};
		
		Map<String, Integer> scottLaRock = boomBap.getCount(myNinja);
		
		Assert.assertEquals(krsOne, scottLaRock);
		}
	
//	
//	@Test
//	
//	public void nullTest() {
//		
//		WordCount willThisWork = new WordCount();
//		Map<String, Integer> emptyMap = new HashMap<>();
//		String[] noIdea = {};
//		
//		Map<String, Integer> probablyNotWhyWouldIt = new HashMap<String, Integer>(){{
//			
//			put("", null);
//		}};
//	
//		Map<String, Integer> letsTryItAnyway = willThisWork.getCount(noIdea);
//		
//		Assert.assertEquals(probablyNotWhyWouldIt, letsTryItAnyway);
//		
//	}
}

		
		
		
		
		
	
	


