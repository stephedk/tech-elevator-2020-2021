package com.techelevator.cardexample;

public class MainProgram
{

	public static void main(String[] args)
	{
		handDemo();
	}

	public static void cardDemo()
	{
		Card card = new Card("Diamonds", 6);
		Card card2 = new Card("Spades", 14);
		
		System.out.println();
		card.flip();
		card2.flip();
		
		System.out.println(card.getCardFace());
		System.out.println(card2.getCardFace());
	}

	public static void deckDemo()
	{
		Deck deck = new Deck();
		deck.shuffle();
		deck.showAllCards();
	}

	public static void handDemo()
	{
		Deck deck = new Deck();
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
		hand1.showHand();

		System.out.println();
		System.out.println(hand2.getPlayerName());
		System.out.println("Value: " + hand2.getValue());
		hand2.showHand();
	}

}
