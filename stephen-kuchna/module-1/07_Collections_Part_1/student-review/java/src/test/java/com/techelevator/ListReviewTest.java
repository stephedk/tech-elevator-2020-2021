package com.techelevator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListReviewTest
{

	@Test
	public void testNamesThatStartWithR()
	{
		// arrange
		List<String> names = new ArrayList<String>();
		names.add("Yvonne");
		names.add("Elsie");
		names.add("Kristin");
		names.add("Lonnie");
		names.add("Gerardo");
		names.add("Olaf");
		names.add("Vernon");
		names.add("Rolando");
		names.add("Raquel");
		names.add("Tommie");
		
		List<String> expected = new ArrayList<String>();
		expected.add("Rolando");
		expected.add("Raquel");
		
		//act
		List<String> actual = ListReview.namesThatStartWithR(names);

		//assert
		assertEquals(expected, actual);
	}

	@Test
	public void testNamesThatHaveO()
	{
		// arrange
		List<String> names = new ArrayList<String>();
		names.add("Yvonne");
		names.add("Elsie");
		names.add("Kristin");
		names.add("Lonnie");
		names.add("Gerardo");
		names.add("Olaf");
		names.add("Vernon");
		names.add("Rolando");
		names.add("Raquel");
		names.add("Tommie");
		
		List<String> expected = new ArrayList<String>();
		expected.add("Yvonne");
		expected.add("Lonnie");
		expected.add("Gerardo");
		expected.add("Olaf");
		expected.add("Vernon");
		expected.add("Rolando");
		expected.add("Tommie");
		
		//act
		List<String> actual = ListReview.namesThatHaveO(names);

		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWordsThatStartWith_T()
	{
		// arrange
		List<String> names = new ArrayList<String>();
		names.add("Yvonne");
		names.add("Elsie");
		names.add("Kristin");
		names.add("Lonnie");
		names.add("Gerardo");
		names.add("Olaf");
		names.add("Vernon");
		names.add("Rolando");
		names.add("Raquel");
		names.add("Tommie");
		
		List<String> expected = new ArrayList<String>();
		expected.add("Tommie");
		
		//act
		List<String> actual = ListReview.namesThatStartWith(names, "T");

		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWordsThatEndWith_getAllImage()
	{
		// arrange
		String[] extensions = new String[] {".jpg",".png"}; 
		
		List<String> files = new ArrayList<String>();
		files.add("expenses.xslx");
		files.add("logo.png");
		files.add("my-buddies.jpg");
		files.add("notes.txt");
		files.add("prices.csv");
		files.add("profile.jpg");
		files.add("proposals.docx");
		files.add("resume.docx");
		
		List<String> expected = new ArrayList<String>();
		expected.add("logo.png");
		expected.add("my-buddies.jpg");
		expected.add("profile.jpg");
		
		//act
		List<String> actual = ListReview.filesThatEndWith(files, extensions);

		//assert
		assertEquals(expected, actual);
	}

}
