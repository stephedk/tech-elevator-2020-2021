package com.techelevator;

import java.util.Scanner;

//Write a program that converts meters to feet and vice-versa.
//
//The foot to meter conversion formula is:
//m = f * 0.3048
//
//The meter to foot conversion formula is:
//f = m * 3.2808399
//
//Write a command line program which prompts a user to enter a length, 
//and whether the measurement is in (m)eters or (f)eet. Convert the length to the opposite measurement, 
//and display the old and new measurements to the console.
////Please enter the length: 58
//Is the measurement in (m)eter, or (f)eet? f
//58f is 17m.



public class LinearConvert {

	public static void main(String[] args) 
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please enter a length ");
			
			double lengthEnter = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.println("Is the length in (m)eters of (f)eet?");
			
			String metersOrFeet = scanner.nextLine();
			
			System.out.println(lengthEnter + metersOrFeet + " is " + lengthConverter(lengthEnter, metersOrFeet) +
					(metersOrFeet.startsWith("m") ? "f" : "m"));
			
			scanner.close();
		}
		
		public static double lengthConverter(double lengthEnter, String metersOrFeet)
		{
			if(metersOrFeet.startsWith("m"))
			{
				double resultFeet = (double)(lengthEnter *  3.2808399);
				return resultFeet;
			}
			else
			{
				double resultMeters = (double)(lengthEnter * 0.3048 );
				return resultMeters;
			}
		}
	
	}


