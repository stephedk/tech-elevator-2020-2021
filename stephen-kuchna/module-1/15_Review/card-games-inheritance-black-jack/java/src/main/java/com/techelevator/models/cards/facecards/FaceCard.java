package com.techelevator.models.cards.facecards;

import com.techelevator.models.cards.Card;
import com.techelevator.models.colors.ColorCodes;
import com.techelevator.models.colors.ColorNames;

public class FaceCard extends Card
{
    private String suit;
    private String faceValue;

    public FaceCard(String suit, int pointValue, String faceValue)
    {
        super(pointValue);

        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getSuit()
    {
        return suit;
    }

    public String getFaceValue()
    {
        return faceValue;
    }

    @Override
    public String getColor()
    {
        if(suit.equals(Suits.SPADES) || suit.equals(Suits.CLUBS))
        {
            return ColorNames.BLACK;
        }
        else
        {
            return ColorNames.RED;    
        }
    }

    @Override
    public String getColorCode()
    {
        if(suit.equals(Suits.SPADES) || suit.equals(Suits.CLUBS))
        {
            return ColorCodes.RESET;
        }
        else
        {
            return ColorCodes.RED;    
        }
    }

    public char getSymbol()
    {
        if(suit.equals(Suits.SPADES))
        {
            return Symbols.SPADES;
        }
        else if(suit.equals(Suits.CLUBS))
        {
            return Symbols.CLUBS;  
        }
        else if(suit.equals(Suits.HEARTS))
        {
            return Symbols.HEARTS; 
        }
        else
        {
            return Symbols.DIAMONDS;
        }
    }

    @Override
	public String getCardFace()
	{
        StringBuilder builder = new StringBuilder();
        
        String top = faceValue.length() == 1 
        			 ? faceValue + " " 
        			 : faceValue;
        
        String bottom = faceValue.length() == 1
                        ? " " + faceValue
                        : faceValue;
        
        String suit = getSuit();
        if(suit.equals(Suits.HEARTS) || suit.equals(Suits.SPADES))
        {
        	suit = " " + suit + " ";
        }
        else if(suit.equals(Suits.CLUBS))
        {
        	suit = " " + suit + "  ";
        }
        

		builder.append(" ---------- \n");
		builder.append("| " + top + "       |\n");
		builder.append("|          |\n");
		builder.append("|          |\n");
		builder.append("| " + suit + " |\n");
		builder.append("|          |\n");
		builder.append("|          |\n");
		builder.append("|       " + bottom + " |\n");
		builder.append(" ---------- \n");

		return builder.toString();

	}
    
}
