package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);
		
		String fileName = getUserFileInput(inputScanner);
		File inputFile = new File(fileName);
		File copyFile = new File("copy_of_" + fileName);
		String userWord = getUserWord(inputScanner);
		String replacementWord = getReplacementWord(inputScanner);
		
		if (copyFile.exists()) {
			copyFile.delete();
		}
		
		try (Scanner fileData = new Scanner(inputFile.getAbsoluteFile())) {
			
			FileOutputStream fileStream = new FileOutputStream(copyFile, true);
			PrintStream fileWriter = new PrintStream(fileStream);

			while (fileData.hasNext()) {

				String lineOfData = fileData.nextLine();
				if (lineOfData.contains(userWord)) {
					lineOfData = lineOfData.replace(userWord, replacementWord);
					fileWriter.println(lineOfData);
				} else {
					fileWriter.println(lineOfData);
				}
			}
			
			fileWriter.flush();
			fileWriter.close();

		} catch (FileNotFoundException ex) {
			System.err.println("The file cannot be found, sorry!");
		}
		
		System.out.println("Your newly modified document awaits!");

	}

	public static String getUserFileInput(Scanner inputScanner) {

		System.out.print("What is the file that should be searched? ");
		String filePath = inputScanner.nextLine();

		return filePath;
	}

	public static String getUserWord(Scanner inputScanner) {

		System.out.print("What is the search word you are looking for? ");
		String searchWord = inputScanner.nextLine();

		return searchWord;
	}

	public static String getReplacementWord(Scanner inputScanner) {

		System.out.print("What word would you like to replace this word with? ");
		String wordUsedForReplacement = inputScanner.nextLine();

		return wordUsedForReplacement;
	}
}
