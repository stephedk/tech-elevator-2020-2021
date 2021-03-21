package com.techelevator.ui;

import java.util.Scanner;

public class UserInput 
{
    Scanner scanner = new Scanner(System.in);
    
    public int hitOrStay()
    {
        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println("[1] Hit");
        System.out.println("[2] Stay");
        System.out.println();
        System.out.print("Select an option: ");

        String input = scanner.nextLine();

        return Integer.parseInt(input);

    }

	public String getPlayerName()
	{
        System.out.println();
        System.out.print("Please enter your name: ");

        return scanner.nextLine();
	}
}
