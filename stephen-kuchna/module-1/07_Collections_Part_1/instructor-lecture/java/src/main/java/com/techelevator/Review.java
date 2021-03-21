package com.techelevator;

public class Review
{

	public static void main(String[] args)
	{
			
		
		int[] nums;
		nums = new int[] {12, 97, 13, 12, 8, 12};
		
		nums[0] = 67; // change the first number
		
		int searchNumber = 12;
		int position = -1;
		
		for(int i =0; i < nums.length; i++)
		{
			if(nums[i] == searchNumber)
			{
				position = i;
				break; // breaks out of the current loop
			}
		}
		
		System.out.println(searchNumber + " was found at position " + position);
		
		String name = "Joey";
		
		for(int i = 0; i < name.length(); i++)
		{
			
		}
		
		String lastLetter = name.substring(2,3);
		
		System.out.println(lastLetter);
		
	}
}
