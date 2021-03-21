package com.techelevator;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class FunctionReview
{
	
	public static void main(String[] args)
	{
		int x = 5;
		int y = 6;
		
		int sum = add(x,  y); // arguments are 5, 6
		
		System.out.println("The sum of " + x + " + " + y + " is " + sum);
	}
	
	
	
	
	public static int add( int first, int second ) // parameters are int, int
	{
		return first + second; //11
	}
	
	
	
	
	public static double divide( int numerator, int denominator )
	{
		return (double)numerator / denominator;
	}
	
	public static void multiply( int first, int second )
	{
		
	}

}
