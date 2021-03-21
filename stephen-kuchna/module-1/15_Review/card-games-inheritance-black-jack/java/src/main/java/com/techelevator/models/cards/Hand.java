package com.techelevator.models.cards;

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
    }
    
    public int countCards()
    {
        return cards.size();
    }

    public Card[] getCards()
    {
        return cards.toArray(new Card[cards.size()]);
    }
    
    public int getValue()
    {
    	int value = 0;
    	
    	for (Card card : cards)
		{
			value += card.getPointValue();
		}
    	
    	return value;
    }
}
