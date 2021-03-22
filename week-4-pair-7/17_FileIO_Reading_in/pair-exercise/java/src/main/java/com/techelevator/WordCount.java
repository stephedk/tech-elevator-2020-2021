package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class WordCount {

	public static void main(String[] args) {

		String fileName = "alices_adventures_in_wonderland.txt";
		File inputFile = new File(fileName);

		try {
			Scanner fileScanner = new Scanner(inputFile.getAbsoluteFile());

			int wordCount = 0;
			wordCount = 0;
			int sentenceCount = 0;

			while (fileScanner.hasNext()) {
				String word = fileScanner.next();

				wordCount++;

				if (word.endsWith(".") || word.endsWith("!") || word.endsWith("?")) {
					sentenceCount++;
				}
			}

			System.out.println("Word Count from words: " + wordCount);
			System.out.println("Sentence Count from words: " + sentenceCount);

		} catch (FileNotFoundException e) {
			System.err.println("error");
		}
	}
}
