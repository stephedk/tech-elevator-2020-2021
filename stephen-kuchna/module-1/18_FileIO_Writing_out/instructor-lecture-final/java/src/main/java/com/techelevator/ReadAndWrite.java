package com.techelevator;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite
{
    public static void main(String[] args)
    {
    	Scanner userInput = new Scanner(System.in);

        String fileName = "files/names.txt";
        File file;

        file = new File(fileName);

        //createFile(file, "files/name_length.txt");
        sortNames(file, "files/names_sorted.txt");
        
        System.out.println("you're done!");
    }
    
    public static void createFile(File file, String newFileName)
    {
    	File outFile = new File(newFileName);
    	
    	try (
    			Scanner inStream = new Scanner(file);
    			PrintStream outStream = new PrintStream(outFile);
    		)
    	{
    		while(inStream.hasNextLine())
    		{
    			String name = inStream.nextLine();
    			int length = name.length();
    			
    			outStream.println(name + " " + length);
    		}
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}
    	
    }
    
    public static void sortNames(File file, String newFileName)
    {
    	File outFile = new File(newFileName);
    	
    	try (
    			Scanner inStream = new Scanner(file);
    			PrintStream outStream = new PrintStream(outFile);
    		)
    	{
    		// 1 - read all names - into a collection
    		List<String> names = new ArrayList<String>();
    		
    		while(inStream.hasNextLine())
    		{
    			String name = inStream.nextLine();
    			names.add(name);    			
    		}
    		
    		// 2 sort the list
    		names.sort(null);
    		
    		// 3 - write the names to the new file
    		for (String name : names)
			{
    			outStream.println(name);
			}
    		
    		
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}
    	
    }
}
