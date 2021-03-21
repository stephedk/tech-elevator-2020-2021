package com.techelevator;

import com.techelevator.models.cards.*;
import com.techelevator.models.cards.facecards.*;
import com.techelevator.models.cards.facecards.cards.*;
import com.techelevator.models.colors.ColorCodes;

public class SimpleDemos 
{

	public static void printCard(Card card)
	{
		if(card.isFaceUp())
		{
			System.out.print(card.getColorCode());
		}
		System.out.println(card);
		System.out.print(ColorCodes.RESET);
	}
	

	public static void printHand(Hand hand)
	{
		for (Card card : hand.getCards()) 
		{
			card.flip();
			printCard(card);
			card.flip();			
		}
	}

	public static void cardDemo()
	{
		Card card = new Ace(Suits.SPADES);
		Card card2 = new Ace(Suits.HEARTS);
		
		System.out.println();
		printCard(card);
		printCard(card2);

		System.out.println();
		card.flip();
		card2.flip();
		
		printCard(card);
		printCard(card2);
	}

	public static void deckDemo()
	{
		Deck deck = new FaceCardDeck();
		deck.shuffle();
		Card card = deck.deal();
		card.flip();
		printCard(card);
	}

	public static void handDemo()
	{		
		Deck deck = new FaceCardDeck();
		deck.shuffle();

		Hand hand1 = new Hand("Miranda");
		Hand hand2 = new Hand("Luis");

		for (int i = 0; i < 5; i++) 
		{
			Card card = deck.deal();
			hand1.deal(card);

			card = deck.deal();
			hand2.deal(card);
		}

		System.out.println();
		System.out.println(hand1.getPlayerName());
		System.out.println("Value: " + hand1.getValue());
		printHand(hand1);

		System.out.println();
		System.out.println(hand2.getPlayerName());
		System.out.println("Value: " + hand2.getValue());
		printHand(hand2);
	}
}
