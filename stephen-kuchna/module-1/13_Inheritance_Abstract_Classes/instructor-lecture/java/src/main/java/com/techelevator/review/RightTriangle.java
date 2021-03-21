package com.techelevator.review;

public class RightTriangle
{

	private int base;
	private int height;
	
	public RightTriangle(int base, int height)
	{
		this.base = base;
		this.height = height;
	}
	
	public int getBase()
	{
		return base;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getLength()
	{
		int aSquare = (int)Math.pow(height, 2);
		int bSquare = (int)Math.pow(base, 2);
		
		int cSquare = aSquare + bSquare;
		
		int length = (int)Math.sqrt(cSquare);
		
		return length;
		
	}
}
