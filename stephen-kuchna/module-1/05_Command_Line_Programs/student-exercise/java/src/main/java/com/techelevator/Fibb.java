package com.techelevator;

import java.util.Scanner;

public class Fibb
{
	public static void main(String[] args)
	{		
		// variables
		int maxValue;
		String fibonacciSequence = "";
		
		// get user input
		maxValue = getUserIntput();
		
		// perform the calculations
		fibonacciSequence = calculateFibonacciSequence(maxValue);
		
		// display the output
		displayOutput(fibonacciSequence, maxValue);
		
	}
	
	public static int getUserIntput()
	{
		Scanner scanner = new Scanner(System.in);
		
		// variables
		String input;
		int maxValue;

		System.out.print("What is the max fibonacci number you want? ");
		input = scanner.nextLine();
		maxValue = Integer.parseInt(input);
		
		return maxValue;
	}
	
	public static String calculateFibonacciSequence(int maxValue)
	{
		String sequence = "0 ";
		int first = 0;//1 1 2
		int second = 1;//1 2 3 5 8 13
		
		while(second <= maxValue)
		{
			sequence += second + " ";
			
			int temp = first + second;
			first = second;
			second = temp;
		}		
		
		return sequence;
	}
	
	public static void displayOutput(String fibonacciSequence, int maxValue) 
	{
		System.out.println();
		System.out.println("The fibonacci sequence for " + maxValue + " is:");
		System.out.println(fibonacciSequence);
	}

}
