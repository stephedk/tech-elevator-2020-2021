package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount 
{

	public static void main(String[] args) 
	{
		/*
		 * 1 - specify file path (create a File) // prompt the user for the file name
		 * 2 - create a Scanner to read the FileStream
		 * 3 - loop through the stream - scanner.nextLine() or scanner.next()
		 * 4 - do something with the data on each line
		 */
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("What file do you want to read? ");
		String fileName = userInput.nextLine();
		// prompt for search term/phrase
		
		// prompt to see if search is case sensitive
		
		
		File file = new File(fileName);
		
		// don't even try to read the file
		// if it doesn't exist
		if(file.exists())
		{
			readFile(file);
			searchFile(file, "some search word", false);
		}
		else 
		{
			System.out.println("The file '" + fileName + "' does not exist.");
		}
	}
	
	public static void readFile(File file) 
	{
		// this is where I will read the file
		try
		{
			Scanner fileScanner = new Scanner(file);
			
			String line = "";
			int wordCount = 0;
			
//			while(fileScanner.hasNextLine())
//			{
//				line = fileScanner.nextLine();
////				String[] words = line.split(" ");
//				String[] words = line.split("\\s+"); // this splits on spaces - but still counts blank lines
//				wordCount += words.length;
//			}
//			System.out.println("Word Count from lines: " + wordCount);
			
			
			wordCount = 0;
			int sentenceCount = 0;
			while(fileScanner.hasNext()) 
			{
				String word = fileScanner.next();
				System.out.println(word);
				wordCount++;
				if(word.endsWith(".") || word.endsWith("!") || word.endsWith("?"))
				{
					sentenceCount++;
				}
			}
			System.out.println("Word Count from words: " + wordCount);
			System.out.println("Sentence Count from words: " + sentenceCount);
			
		} 
		catch (FileNotFoundException e)
		{
			// TODO: handle exception
		}
	}

	
	public static void searchFile(File file, String searchTerm, boolean isCaseSensitive)
	{
		try
		{
			Scanner fileScanner = new Scanner(file);
			
			String line = "";
			while(fileScanner.hasNextLine())
			{
				line = fileScanner.nextLine();
				// see if the searchTerm is in this line
				// if yes
					// print the line number and the line
			}
		}
		catch(Exception ex)
		{
			
		}
	}
}
