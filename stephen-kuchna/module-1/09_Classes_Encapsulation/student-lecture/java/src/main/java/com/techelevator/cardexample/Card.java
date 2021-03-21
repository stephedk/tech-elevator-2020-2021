package com.techelevator.cardexample;

public class Card 
{
	// what does it know?
	//anything it knows should always be private
	private String suit;
	private String faceValue;
	private int value;
	private boolean isFaceUp;
	
	
	//getters return the value
	//that are stored in the private variables
	public String getSuit()
	{
	return suit;
	}
	
	//setters change or set the value
	//of the private variables
	public void setSuit(String newSuit)
	{
		suit = newSuit;
	}
}
