package com.techelevator.models.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Deck 
{
    protected List<Card> cards;

    public Deck()
    {
        cards = new ArrayList<Card>();
    }

    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    public int countCards()
    {
        return cards.size();
    }

    public Card deal()
    {
        Card card = null;

        if(cards.size() > 0)
        {
            card = cards.get(0);
            cards.remove(0);
        }

        return card;
    }
    
}
