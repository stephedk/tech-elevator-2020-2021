package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class ListReview
{
	public static void main(String[] args)
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	

	public static List<String> namesThatStartWithR(List<String> names)
	{
		//create the list to return
		List<String> rNames = new ArrayList<String>();
		
		// do the work to add the names to the return list
		for(String currentName: names)
		{
			if(currentName.charAt(0) == 'R')
			//if(currentName.startsWith("R"))
			{
				rNames.add(currentName);
			}
		}		
		
		// return the list
		return rNames;
	}
	
	
	
	
	
	
	
	
	

	public static List<String> namesThatHaveO(List<String> names)
	{
		return null;
	}	

	public static List<String> namesThatStartWith(List<String> words, String firstLetter)
	{
		return null;
	}

	public static List<String> filesThatEndWith(List<String> words, String[] extensions)
	{
		return null;
	}
}
