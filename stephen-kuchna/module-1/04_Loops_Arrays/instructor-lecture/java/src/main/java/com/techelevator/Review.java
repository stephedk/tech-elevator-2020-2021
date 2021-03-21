package com.techelevator;

public class Review 
{

	// "main" is the ENTRY POINT of your application
	// put your start logic here
	public static void main(String[] args) 
	{
		// all logic code must be contained
		// WITHIN a function
	}
	
	// create a function to see if I can schedule a meeting
	// is everyone available?
	public static boolean canScheduleMeeting(boolean isGregorAvailable, boolean isStudentAvailable)
	{
		return isGregorAvailable && isStudentAvailable;
	}
	
	
	// create a function to see if anyone is available to 
	// answer a question
	public static boolean canAnyoneHelp(boolean isJeffAvailable
										, boolean isJoshuaAvailable
										, boolean isStevenAvailable
										, boolean isGregorAvailable)
	{
		return isJeffAvailable || isJoshuaAvailable || isStevenAvailable || isGregorAvailable;
	}
	
	
	// create a function to see which credit card
	// you want to receive (Amex, Visa, MasterCard)
	// only one is allowed
	public static boolean selectCreditCard(boolean selectedAmex
									, boolean selectedVisa
									, boolean selectedMasterCard)
	{
		int selectedCardCount = 0;

		if(selectedAmex) selectedCardCount++;
		if(selectedVisa) selectedCardCount++;
		if(selectedMasterCard) selectedCardCount++;
		
		return selectedCardCount == 1;
	}
	
	
	// create a function that determines the
	// price of an all you can eat buffet
	// based on age
	// child 12 and under 7.95
	// 13 - 18 12.95
	// 19 - 64 19.95
	// 65+ 9.95
	public static double getBuffetPrice(int age)
	{
		if(age <= 12)
		{
			return 7.95;
		}
		else if(age <= 18)
		{
			return 12.95;
		}
		else if(age <= 64)
		{
			return 19.95;
		}
		else
		{
			return 9.95;
		}
	}

}
