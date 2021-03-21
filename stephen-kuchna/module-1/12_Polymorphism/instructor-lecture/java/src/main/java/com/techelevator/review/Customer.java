package com.techelevator.review;

public class Customer
{
	public String searchByName(String name)
	{
		// some logic to search for customer
		return "";
	}

	public String search(String lastName, String firstName)
	{
		if(lastName != null && firstName != null)
		{
			// search by first AND last
		}
		else if(lastName != null)
		{
			// search just by last
		}
		else if(firstName != null)
		{
			// search just by first
		}
		else 
		{
			// deal with the error
		}
		
		
		return "";
	}

	public String search(int customerId)
	{
		// some logic to search for customer
		return "";
	}
	
	public String search(String phoneNumber)
	{
		// some logic to search for customer
		return "";
	}
}
