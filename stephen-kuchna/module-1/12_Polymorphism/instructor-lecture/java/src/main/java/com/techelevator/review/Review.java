package com.techelevator.review;

public class Review
{
	public static void main(String[] args)
	{
		// calculate here
		
		// can't create a calculator because the 
		// constructor is private
		//Calculator calculator = new Calculator();
		
		int answer = Calculator.add(4, 5);
		double doubleAnswer = Calculator.add(1.2, 5.6);
		
		//Math myMath = new Math();
		Math.round(12.3546);
	}
}
