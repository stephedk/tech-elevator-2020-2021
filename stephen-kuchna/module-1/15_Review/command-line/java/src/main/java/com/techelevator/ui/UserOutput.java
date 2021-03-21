package com.techelevator.ui;

public class UserOutput 
{
    public void displayWelcomeScreen()
    {
        System.out.println();
        System.out.println("**********************");
        System.out.println("    Chores Galore");
        System.out.println("**********************");
        System.out.println();
    }

    public void displayGoodbye()
    {
        System.out.println();
        System.out.println("**********************");
        System.out.println("     Come Again!");
        System.out.println("**********************");
        System.out.println();
    }

    public void displayMessage(String message)
    {
        System.out.println();
        System.out.println(message);
    }
    
}
