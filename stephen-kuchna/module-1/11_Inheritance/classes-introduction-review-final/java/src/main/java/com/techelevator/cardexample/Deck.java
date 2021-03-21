package com.techelevator.cardexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck 
{
    private List<Card> cards;

    private String[] suits = new String[]{"Spades", "Diamonds", "Clubs", "Hearts"};
    private int[] values = new int[]{ 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

    public Deck()
    {
        cards = new ArrayList<Card>();
        for (String suit: suits) 
        {
            for (int value: values) {
                cards.add(new Card(suit, value));
            }
        }
    }

    public void showAllCards()
    {
        for (Card card : cards) {
            card.flip();
            System.out.println(card.getCardFace());
            card.flip();
        }
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
