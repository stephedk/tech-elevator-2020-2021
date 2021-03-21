package com.techelevator.review;

public class Calculator
{
	// overloading is creating multiple functions
	// with the same name, but different signatures
	
	public int add(int a, int b)
	{
		return a + b;
	}
	
	public double add(double a, double b)
	{
		return a + b;
	}
	
	public String add(String a, String b)
	{
		return a + " " + b;
	}
}
