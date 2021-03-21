package com.techelevator.cardexample;

import java.util.HashMap;
import java.util.Map;

public class Card
{
	private Map<Integer, String> valueMap = new HashMap<Integer, String>()
	{
		{
			put(2, "2");
			put(3, "3");
			put(4, "4");
			put(5, "5");
			put(6, "6");
			put(7, "7");
			put(8, "8");
			put(9, "9");
			put(10, "10");
			put(11, "J");
			put(12, "Q");
			put(13, "K");
			put(14, "A");
		}
	};
	
	// what does it know?
	// should ALWAYS be private
	private String suit;
	private int value;
	private boolean isFaceUp;
	
	// getters return the values
	// that are stored in private variables
	public String getSuit()
	{
		return suit;
	}	
	
	public int getValue()
	{
		return value;
	}
	
	public boolean isFaceUp()
	{
		return isFaceUp;
	}

	// dervied property
	// does NOT have a backing variable
	// the return is calculated based on 
	// other varaibles
	public String getFaceValue()
	{
		return valueMap.get(value);
	}
	
	public String getColor()
	{
		if(suit.equals("Spades") || suit.equals("Clubs"))
		{
			return "Black";
		}
		else 
		{
			return "Red";
		}
	}
	
	public String getCardInfo()
	{
		if(isFaceUp)
		{
			return getFaceValue() + " " + suit + "(" + getColor() + ")";
		}
		else 
		{
			return "##";
		}
	}
	
	// setters change/set the value
	// of the private variables
	public void setSuit(String newSuit)
	{
		suit = newSuit;
	}
	
	// constructors give us control
	// over HOW to create the object
	// - this is called on -> new Card()
	public Card(String theSuit, int theValue)
	{
		suit = theSuit;
		value = theValue;
		isFaceUp = false; // default value
	}
	
	public void flip()
	{
		isFaceUp = !isFaceUp;
	}
	

}
