package com.techelevator.cardexample;

import java.util.HashMap;
import java.util.Map;

public class Card
{
	private static Map<Integer, String> valueMap = new HashMap<Integer, String>()
	{
		{
			put(2, "Two");
			put(3, "Three");
			put(4, "Four");
			put(5, "Five");
			put(6, "Six");
			put(7, "Seven");
			put(8, "Eight");
			put(9, "Nine");
			put(10, "Ten");
			put(11, "Jack");
			put(12, "Queen");
			put(13, "King");
			put(14, "Ace");
		}
	};

	private static Map<String, Character> symbols = new HashMap<String, Character>()
	{
		{
			put("Spades", '\u2660');
			put("Diamonds", '\u2666');
			put("Clubs", '\u2663');
			put("Hearts", '\u2665');
		}
	};

	private static Map<String, String> colors = new HashMap<String, String>()
	{
		{
			put("Reset", "\u001B[0m");
			put("Black", "\u001B[30m");
			put("Red", "\u001B[31m");
			put("Green", "\u001B[32m");
			put("Yellow", "\u001B[33m");
			put("Blue", "\u001B[34m");
			put("Purple", "\u001B[35m");
			put("Cyan", "\u001B[36m");
			put("White", "\u001B[37m");
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

	public char getSymbol()
	{
		return symbols.get(suit);
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
	
	public String getColorName()
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

	public String getColor()
	{
		String color = getColorName();
		if(color.equals("Black")) color = "Reset";

		return colors.get(color);
	}
	
	public String getCardFace()
	{
		if(isFaceUp)
		{
			//String cardFace = getSymbol() + " " + getFaceValue() + " of " + suit;
			String cardFace = String.format("%s %s of %s", getSymbol(), getFaceValue(), suit);
			return cardFace; 
		}
		else 
		{
			return "##";
		}
	}
	
	// setters change/set the value
	// of the private variables
	public void setSuit(String suit)
	{
		this.suit = suit;
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
