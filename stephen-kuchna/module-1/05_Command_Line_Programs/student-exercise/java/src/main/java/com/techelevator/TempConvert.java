package com.techelevator;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

//The Fahrenheit to Celsius conversion formula is:
//Tc = (Tf - 32) / 1.8
//
//where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit.
//
//The Celsius to Fahrenheit conversion formula is:
//Tf = Tc * 1.8 + 32
//
//Write a command line program which prompts a user to enter a temperature, 
//and whether it's in degrees (C)elsius or (F)ahrenheit. 
//Convert the temperature to the opposite degrees, and display the old and new 
//temperatures to the console.
//Please enter the temperature: 58
//Is the temperature in (C)elsius, or (F)ahrenheit? F
//58F is 14C.


public class TempConvert {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the temperature: ");
		
		int tempEnter = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?");
		
		String fahrenheitOrCelsius = scanner.nextLine();
		
		System.out.println(tempEnter + fahrenheitOrCelsius + " is " + tempConversion(tempEnter, fahrenheitOrCelsius) +
				(fahrenheitOrCelsius.startsWith("F") ? "C" : "F"));
		
		scanner.close();
	}
	
	public static int tempConversion(int tempEnter, String fahrenheitOrCelsius)
	{
		if(fahrenheitOrCelsius.startsWith("F"))
		{
			int resultCelsius = (int)((tempEnter - 32) /1.8);
			return resultCelsius;
		}
		else
		{
			int resultFahrenheit = (int) ((tempEnter * 1.8) + 32);
			return resultFahrenheit;
		}
	}
}
		
		
		
		
		
		