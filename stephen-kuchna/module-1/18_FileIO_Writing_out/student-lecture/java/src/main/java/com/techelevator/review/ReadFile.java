package com.techelevator.review;

import java.io.File;
import java.io.FileNotFoundException;
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


        if(file.exists())
        {
            getFileStatistics(file);
        }
        else
        {
            System.out.println("The file '" + file + "' does not exist.' ");
        }

    }

    public static void getFileStatistics(File file)
    {
        try
        {
            // 3. open the file as a file stream
            Scanner fileStream = new Scanner(file);

            // 4. process each word/line in the stream
            while(fileStream.hasNext())
            {
                String word = fileStream.next();
                // do something with the file
            }

            fileStream.close();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
