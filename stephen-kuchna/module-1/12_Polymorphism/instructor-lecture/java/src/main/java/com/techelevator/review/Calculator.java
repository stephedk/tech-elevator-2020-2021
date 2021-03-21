package com.techelevator.review;

public class Calculator
{
	private Calculator()
	{
		
	}
	// overloading is creating multiple functions
	// with the same name, but different signatures

	// the signature is the function name and the input parameters types
	// add(int, int)
	// add(double, double)
	// add(String, String)

	// the return type is NOT part of the signature
	
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	public static int add(int a, int b, int c)
	{
		return b + a + c;
	}
	
	public static double add(double a, double b)
	{
		return a + b;
	}
	
	public static String add(String a, String b)
	{
		return a + " " + b;
	}
	
	public static void doIt()
	{
	
	}
	
	public static void doIt(int i)
	{
		
	}
	
	public static void doIt(int i, int j)
	{
		
	}
}
