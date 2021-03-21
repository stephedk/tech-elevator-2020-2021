package com.techelevator;

import com.techelevator.models.cards.*;
import com.techelevator.models.cards.facecards.*;
import com.techelevator.models.cards.facecards.cards.*;
import com.techelevator.models.cards.facecards.enumerations.Cards;
import com.techelevator.models.colors.ColorCodes;

public class SimpleDemos 
{

	public static void printCard(Card card)
	{
		System.out.println(card);
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
		// There are 3 ways to create a card
		Card card = new FaceCard("Hearts", 10, "Q"); // create the FaceCard and pass in all constructor values
		Card card2 = new Queen(Suits.HEARTS); // create a Queen and pass in the suit only
		Card card3 = Cards.QUEEN_DIAMONDS; // Use a pre-define variable that is a queen of hearts

		
		System.out.println();
		printCard(card);
		printCard(card2);
		printCard(card3);

		System.out.println();
		card.flip();
		card2.flip();
		card3.flip();
		
		printCard(card);
		printCard(card2);
		printCard(card3);
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
