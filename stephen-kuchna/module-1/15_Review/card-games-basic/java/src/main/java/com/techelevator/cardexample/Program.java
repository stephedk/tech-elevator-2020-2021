package com.techelevator.cardexample;

import java.util.ArrayList;
import java.util.List;

public class Program
{

	public static void main(String[] args)
	{
		String card1Suit = "Diamonds";
		int card1Value = 14;
		String card1FaceValue = "Ace";
		boolean card1IsFaceUp = false;
		String card1Color = "Red";
		
		card1IsFaceUp = !card1IsFaceUp;
		card1Suit = "Spades";
		
		if(card1IsFaceUp)
		{
			//String message = card1FaceValue + " of " + card1Suit;			
			String message = String.format("%s of %s", card1FaceValue, card1Suit);
			System.out.println(message);
		}
		else 
		{
			System.out.println("##");
		}
		
		

		Card card1 = new Card("Diamonds", 14);
		card1.setSuit("Spades");
		card1.flip();
		System.out.println(card1.getCardFace());
		
		
//		List<String> cardSuits = new ArrayList<String>();
//		List<Integer> cardValues = new ArrayList<Integer>();
//		List<String> cardFaceValues = new ArrayList<String>();
//		List<Boolean> cardsAreFaceUp = new ArrayList<Boolean>();
//		List<String> cardColors = new ArrayList<String>();
//		
//		
//		cardsAreFaceUp.set(13, !cardsAreFaceUp.get(13));
		
		
	}
}
