package com.techelevator;

public class InputValidator
{
	public static boolean validate(String input, String expected)
	{
		return input.trim().toLowerCase().equals(expected);
	}

}
