package com.techelevator.models.cards.facecards.cards;

import com.techelevator.models.cards.facecards.FaceCard;

public class Ace extends FaceCard
{
    private boolean useLowValue = false;
    private int lowValue = 1;

    public Ace(String suit)
    {
        super(suit, 11, "A");
    }

    public int getLowValue()
    {
        return lowValue;
    }

    public boolean useLowValue()
    {
        return useLowValue;
    }

    public void flipValue()
    {
        useLowValue = !useLowValue;
    }

    @Override
    public int getPointValue()
    {
        if(useLowValue)
        {
            return lowValue;
        }

        return super.getPointValue();
    }
    
}
