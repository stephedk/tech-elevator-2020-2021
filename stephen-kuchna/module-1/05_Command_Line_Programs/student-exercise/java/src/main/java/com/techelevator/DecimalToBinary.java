package com.techelevator;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Decimal to other numeric bases converter.");
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		String decimal = scanner.nextLine();
		System.out.println();
		
		String arrayOfDecimals[] = decimal.split(" ");
		
		for (int i = 0; i < arrayOfDecimals.length; i++)
		{
			int numberIn = Integer.parseInt(arrayOfDecimals[i]);
			System.out.println(" ");
			System.out.println(arrayOfDecimals[i] + " in binary is " + Integer.toBinaryString(numberIn) + ".");
			String hexString = Integer.toHexString(numberIn);
			System.out.println(arrayOfDecimals[i] + " in hexadecimal is " + hexString + ".");
			
			String octalString = Integer.toOctalString(numberIn);
		    System.out.println(arrayOfDecimals[i] + " in octal is " + octalString + ".");
		}
	}
}
