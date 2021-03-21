package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WordSearch
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the file that should be searched? ");
		String input = scanner.nextLine();
		File filePath = new File(input);
		
		System.out.println("What is the search word you are looking for? ");
		String searchWord = scanner.nextLine();
		
		System.out.println("Should the search be case sensitive? (Y\\N) ");
		String yesNo = scanner.nextLine().toUpperCase();
		boolean isNotCaseSensitive = yesNo.equals("N");
		
		
		try
        {
            // 3. open the file as a file stream
            Scanner fileStream = new Scanner(filePath);
            int lineNumber = 1;
            // 4. process each word/line in the stream
            while(fileStream.hasNextLine())
            {
                String line = fileStream.nextLine();
                String lineLower = line.toLowerCase();
                String searchWordLower = searchWord.toLowerCase();
                if (isNotCaseSensitive && lineLower.contains(searchWordLower))
                {
                	System.out.println(lineNumber + ") " + line);
                }
                else if(line.contains(searchWord))
                {
                	System.out.println(lineNumber + ") " + line);
                }
                lineNumber++;
            }
            fileStream.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
	}
}
