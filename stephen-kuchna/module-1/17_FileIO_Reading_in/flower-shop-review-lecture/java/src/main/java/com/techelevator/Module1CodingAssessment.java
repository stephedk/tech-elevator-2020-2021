package com.techelevator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) 
	{
		readFullFLowerOrderCsvFile();
	}
	
	public static void workingWithFiles()
	{
		String filePath = "data-files";
		File theFile = new File(filePath);
		
		System.out.println(theFile.toString());
		System.out.println(theFile.getAbsolutePath());
		System.out.println(theFile.exists());
		System.out.println("Directory: " + theFile.isDirectory());
		System.out.println("File: " + theFile.isFile());
	}
	
	public static void readZipCodeFile() 
	{
		// read all zip codes in the file
		
		// path
		// fileName - this is a fully qualified path (absolute)
		String filePath = "zipcodes.txt";
		File zipCodeFile = new File(filePath);
		
		// open the file
		Scanner scanner;
		try
		{
			// this is the manual way to create the file stream
//			FileInputStream in = new FileInputStream(zipCodeFile);
//			InputStreamReader reader = new InputStreamReader(in);
//			scanner = new Scanner(reader);
			
			scanner = new Scanner(zipCodeFile);
			
			// process all lines
			//for (int i = 0; i < 10; i++) // for loop not  a good idea because we don't know how many lines there are
			while(scanner.hasNextLine()) // when should we stop looping? when there are no more lines
			{
				String zipCode = scanner.nextLine();
				//System.out.println(zipCode);
				
				displayOrder("demo order", 0, false, zipCode);
				
			}
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("File: " + filePath + " was not found.");
		}
		
	}

	public static void readZipAndSameDayFile() 
	{
		// read all zip codes in the file
		
		// path
		// fileName - this is a fully qualified path (absolute)
		String filePath = "zip_and_sameday.txt";
		File zipCodeFile = new File(filePath);
		
		// open the file
		Scanner scanner;
		try
		{
			scanner = new Scanner(zipCodeFile.getAbsoluteFile());
			
			// process all lines
			//for (int i = 0; i < 10; i++) // for loop not  a good idea because we don't know how many lines there are
			while(scanner.hasNextLine()) // when should we stop looping? when there are no more lines
			{
				String line = scanner.nextLine();
				System.out.println(line);
				
				// split the text line into different parts
				String[] parts = line.split("\\|"); // the pipe | is a special character in regex patterns
				
				// convert the string parts into the correct data type
				String zipCode = parts[0];
				boolean isSameDay = Boolean.parseBoolean(parts[1]);
				
				displayOrder("demo 2", 12, isSameDay, zipCode);
				
			}
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("File: " + filePath + " was not found.");
		}
		
	}

	public static void readFullFLowerOrderCsvFile() 
	{
		// read all zip codes in the file
		
		// path
		// fileName - this is a fully qualified path (absolute)
		String filePath = "data-files/FlowerInput.csv";
		File zipCodeFile = new File(filePath);
		
		// open the file
		Scanner scanner;
		try
		{
			scanner = new Scanner(zipCodeFile.getAbsoluteFile());
			
			// process all lines
			//for (int i = 0; i < 10; i++) // for loop not  a good idea because we don't know how many lines there are
			while(scanner.hasNextLine()) // when should we stop looping? when there are no more lines
			{
				String line = scanner.nextLine();
				System.out.println(line);
				
				// split the text line into different parts
				String[] parts = line.split(","); 
				
				// convert the string parts into the correct data type
				String bouquetName = parts[0];
				int numberOfRoses = Integer.parseInt(parts[1]);
				boolean isSameDay = Boolean.parseBoolean(parts[2]);
				String zipCode = parts[3];
				
				displayOrder(bouquetName, numberOfRoses, isSameDay, zipCode);
				
			}
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("File: " + filePath + " was not found.");
		}
		
	}
	
	public static void displayOrder(String bouquet, int numberOfRoses, boolean sameDayShipping, String zipCode)
	{
		FlowerShopOrder order = new FlowerShopOrder(bouquet, numberOfRoses);
		BigDecimal subTotal = order.getSubTotal();
		BigDecimal shipping = order.calculateDelivery(sameDayShipping, zipCode);
		BigDecimal total = subTotal.add(shipping);
		
		System.out.println();

		System.out.println("************************");
		System.out.println(order.toString());
		System.out.println("Zip Code: " + zipCode);
		System.out.println("Same Day: " + sameDayShipping);
		System.out.println("------------------------");
		System.out.println("Sub-Total: " + subTotal);
		System.out.println("Shipping: " + shipping);
		System.out.println("------------------------");
		System.out.println("Total: " + total);
		System.out.println("************************");
		System.out.println();
		
		
	}
	
	public static void flowerShopOrderDemo()
	{
		// TODO Auto-generated method stub
		FlowerShopOrder order = new FlowerShopOrder("Apology", 48);
		
		System.out.println(order.toString());	
		
		BigDecimal delivery = order.calculateDelivery(false, "2999a");
		System.out.println(delivery);
		
		int numerator = 10;
		int denominator = 0;
		
		if(denominator != 0)
		{
			int answer = numerator / denominator;
			System.out.println(answer);
		}
		
		try
		{
			// some code that could cause an error
			
		} 
		catch (Exception e)
		{
			// here's what I do if there is a problem
			// TODO: handle exception
		}
		finally 
		{
			// clean up code
		}

	}

}
