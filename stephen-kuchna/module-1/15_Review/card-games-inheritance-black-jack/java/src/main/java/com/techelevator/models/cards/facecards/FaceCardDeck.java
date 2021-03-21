package com.techelevator.models.cards.facecards;

import com.techelevator.models.cards.Deck;
import com.techelevator.models.cards.facecards.enumerations.*;

public class FaceCardDeck extends Deck
{
    public FaceCardDeck()
    {
        super.cards.addAll(Cards.getSpades());
        super.cards.addAll(Cards.getHearts());
        super.cards.addAll(Cards.getClubs());
        super.cards.addAll(Cards.getDiamonds());
    }
}
