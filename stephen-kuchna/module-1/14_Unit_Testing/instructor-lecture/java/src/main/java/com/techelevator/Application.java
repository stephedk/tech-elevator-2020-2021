package com.techelevator;

import java.util.Scanner;

public class Application
{
	private Scanner scanner = new Scanner(System.in);
	
	public void run()
	{
		while(true)
		{
			System.out.println("What do you want to do next?");
			System.out.print("[C]ontinue or [Q]uit: ");
			String input = scanner.nextLine();
			
			if(InputValidator.validate(input, "c"))
			{
				System.out.println("Welcome back - continuing");
			}
			else if(InputValidator.validate(input, "q"))
			{
				System.out.println("Goodbye");
				break;
			}
			else 
			{
				System.out.println("Please select C or Q only.");
			}
			
		}
		
	}

}
