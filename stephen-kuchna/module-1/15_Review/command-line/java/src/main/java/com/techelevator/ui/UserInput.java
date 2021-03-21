package com.techelevator.ui;

import java.util.Scanner;

public class UserInput 
{
    Scanner scanner = new Scanner(System.in);

    public int getMainMenuChoice()
    {
        System.out.println();
        System.out.println("Available options: ");
        System.out.println("------------------");
        System.out.println("[1] Add a chore: ");
        System.out.println("[2] Display chores: ");
        System.out.println("[3] Exit: ");
        System.out.println("------------------");
        System.out.print("Please make a selection: ");
        String input = scanner.nextLine();

        System.out.println();

        return Integer.parseInt(input);
    }

    public String getChoreName()
    {
        System.out.println();
        System.out.println("Enter the name of the chore: ");
        return scanner.nextLine();
    }

    public String getPersonName()
    {
        System.out.println();
        System.out.println("Enter the name of the person: ");
        return scanner.nextLine();
    }
    
}
