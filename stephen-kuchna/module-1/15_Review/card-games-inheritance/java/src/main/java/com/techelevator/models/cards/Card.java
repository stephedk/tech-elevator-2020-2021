package com.techelevator.models.cards;

import com.techelevator.models.colors.ColorCodes;

public abstract class Card
{	
	// private variables
	private int pointValue;
	private boolean isFaceUp;
	
	// constructors
	protected Card(int pointValue)
	{
		this.pointValue = pointValue;
	}
		
	//setters
	protected void setPointValue(int pointValue)
	{
		this.pointValue = pointValue;
	}

	//getters
	public int getPointValue()
	{
		return pointValue;
	}
	
	public boolean isFaceUp()
	{
		return isFaceUp;
	}
	
	public abstract String getColor();

	public String getColorCode()
	{
		return ColorCodes.RESET;
	}
	public abstract String getCardFace();

	public String getCardBack()
	{
		StringBuilder builder = new StringBuilder();

		builder.append(" --------- \n");
		builder.append("|.........|\n");
		builder.append("|.........|\n");
		builder.append("|.........|\n");
		builder.append("|.........|\n");
		builder.append("|.........|\n");
		builder.append("|.........|\n");
		builder.append("|.........|\n");
		builder.append("|.........|\n");
		builder.append(" ---------\n");

		return builder.toString();

	}
		
	//methods
	public void flip()
	{
		isFaceUp = !isFaceUp;
	}
	
	@Override
	public String toString()
	{
		if(isFaceUp)
		{
			return getCardFace(); 
		}
		else 
		{
			return getCardBack();
		}
	}


}
