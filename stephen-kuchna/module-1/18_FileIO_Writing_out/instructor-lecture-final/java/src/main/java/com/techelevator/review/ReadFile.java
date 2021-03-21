package com.techelevator.review;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadFile
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        String fileName;
        File file;

        // 1. specify the file path (user input)
        System.out.print("Enter the name of a file >>> ");
        fileName = userInput.nextLine();

        // 2. create a File object from the path
        file = new File(fileName);

        getFileStatistics(file);

//        if(file.exists())
//        {
//            getFileStatistics(file);
//        }
//        else
//        {
//            System.out.println("The file '" + file + "' does not exist.' ");
//        }

    }

    public static void getFileStatistics(File file)
    {    	

        // write to file called "stats.txt"
        // create the resource
        File outFile = new File("stats.txt");
        
        

    	// try-with-resource
        try (
        		Scanner fileStream = new Scanner(file);
        		FileOutputStream out = new FileOutputStream(outFile, true);
                PrintStream outStream = new PrintStream(out);
        )
        {
            // 3. open the file as a file stream
        	// creates a lock on the file
           // fileStream = new Scanner(file);

            int wordCount = 0;
            int sentenceCount = 0;
            // 4. process each word/line in the stream
            while(fileStream.hasNext())
            {
                String word = fileStream.next();
                // do something with the file
                wordCount++;
                
                if(word.endsWith(".") || word.endsWith("?") || word.endsWith("!")) 
                {
                	sentenceCount++;
                }
            }
            
            // write to the file
            outStream.println("File Name: " + file.getName());
            outStream.println("File Size: " + file.getTotalSpace());
            outStream.println("Words: " + wordCount);
            outStream.println("Sentences: " + sentenceCount);
            outStream.println();
            
            
        }
        catch (Exception ex)
        {
        	// runs if there is an exception
            System.out.println(ex.getMessage());
        }
//        finally 
//        {
//        	// this always runs whether or not there is an exception
//        	// clean up code
//
//        	if(fileStream != null)
//        	{
//	            // close the file to release the lock
//	            fileStream.close();
//        	}
//        	
//		}
        
    }
}
