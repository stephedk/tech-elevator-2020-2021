package com.techelevator.cardexample;

public class MainProgram
{

	public static void main(String[] args)
	{
		// creating an object template
		// new calls the constructor
		Card myCard = new Card("Diamonds", 6);
		
		//myCard.setSuit("Spades");
		
		System.out.println("Suit: " + myCard.getSuit());
		System.out.println("Face Value: " + myCard.getFaceValue());
		System.out.println("Value: " + myCard.getValue());
		System.out.println("Face Up: " + myCard.isFaceUp());
		System.out.println("Color: " + myCard.getColor());
		
		System.out.println();
		System.out.println(myCard.getCardInfo());
		
		System.out.println();
		System.out.println("Flipping card");
		myCard.flip();

		System.out.println();
		System.out.println(myCard.getCardInfo());
		
		System.out.println();
		System.out.println("Flipping card");
		myCard.flip();

		System.out.println();
		System.out.println(myCard.getCardInfo());
		
	}

}
