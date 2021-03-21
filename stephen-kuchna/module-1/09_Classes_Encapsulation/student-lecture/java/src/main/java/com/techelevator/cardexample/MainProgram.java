package com.techelevator.cardexample;

public class MainProgram
{

	
	public static void main(String[] args)
	{
		//creating an object template
		
		String name = new String("Bilge"); 
		
		Card myCard = new Card();
		myCard.setSuit("Spades");
		
		System.out.println(myCard.getSuit());
		
		
	}

}
