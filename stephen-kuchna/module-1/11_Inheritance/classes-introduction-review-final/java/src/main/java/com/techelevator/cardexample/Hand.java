package com.techelevator.cardexample;

import java.util.ArrayList;
import java.util.List;

public class Hand 
{
    private List<Card> cards;

    private String playerName;

    public String getPlayerName()
    {
        return playerName;
    }

    public Hand(String playerName)
    {
        cards = new ArrayList<Card>();
        this.playerName = playerName;
    }

    public void deal(Card card)
    {
        cards.add(card);
        // no return statement - because it's void
    }
    
    public int countCards()
    {
    	// I must return an int
        return cards.size();
    }

    public void showHand()
    {
        for (Card card : cards) 
        {
            card.flip();
            System.out.println(card.getCardFace());
            card.flip();
        }
    }
    
    public int getValue()
    {
    	int value = 0;
    	
    	for (Card card : cards)
		{
			value += card.getValue();
		}
    	
    	return value;
    }
}
