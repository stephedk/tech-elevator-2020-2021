package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/	
		
		// how to declare a variable
		// datatype variableName;
		// use camelCase convention for variable names
		int numberOfExercises;
		numberOfExercises = 26;	
		System.out.println("1. numberOfExercises = " + numberOfExercises);
		
		
		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		
		double half = 0.5;
		System.out.println("2. half = " + half);
		

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/

		String name = "TechElevator";
		System.out.println("3. name = " + name);

		
		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/

		byte seasonsOfFirefly = 1;
		System.out.println("4. seasonsOfFirefly = " + seasonsOfFirefly);

		
		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/

		String myFavoriteLanguage;
		myFavoriteLanguage = "Java";
		System.out.println("5. myFavoriteLanguage = " + myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/

		double pi = 3.1416;
		System.out.println("6. pi = " + pi);

		/*
		7. Create and set a variable that holds your name.
		*/
		
		String myName = "Gregor";
		System.out.println("7. myName = " + myName);
		
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		
		int numberOfButtonsOnMouse = 7;
		System.out.println("8. numberOfButtonsOnMouse = " + numberOfButtonsOnMouse);
		

		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		
		double percentBattery;
		percentBattery = .97;
		System.out.println("9. percentBattery = " + percentBattery);
		

		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/
		
		int initialInteger = 121;
		int integerToSubtract = 27;
		int difference = initialInteger - integerToSubtract;
		System.out.println("10. 121 - 27 = " + difference);

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		
		double initialDoubleValue = 12.3;
		double doubleToAdd = 32.1;
		double sumOfDoubles = initialDoubleValue + doubleToAdd;
		System.out.println("11. 12.3 + 32.1 = " + sumOfDoubles);
		

		/*
		12. Create a String that holds your full name.
		*/
		
		String fullName = "Gregor Dzierzon";
		System.out.println("12. " + fullName);

		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		
		String helloFullName = "Hello " + fullName;
		System.out.println("13. " + helloFullName);

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		
		// current 
		// fullName -> Gregor Dzierzon
		// goal
		// fullName -> Gregor Dzierzon Esquire
		fullName = fullName + " Esquire";
		System.out.println("14. " + fullName);

		/*
		15. Now do the same as exercise 14, but use the += operator.
		
		the + and the += are used to concatenate Strings.
		
		For numbers + and += are used to add 		
		Other arithmetic operators
		number += 1 -> number = number + 1
		number -= 1 -> number = number - 1
		number /= 2 -> number = number / 2
		number *= 2 -> number = number * 2
		number %= 2 -> number = number % 2	// remainder	
		
		*/
		
		// the following is the same as 
		// fullName = fullName + " Esquire";
		fullName += " Esquire";
		System.out.println("15. " + fullName);

		
		
		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		
		String movie = "Saw";
		movie += 2;
		System.out.println("16. " + movie);

		
		
		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		movie += 0;
		System.out.println("17. " + movie);

		
		
		/*
		18. What is 4.4 divided by 2.2?
		*/
		
		double numeratorDouble = 4.4;
		double denominatorDouble = 2.2;
		double quotientDouble = numeratorDouble / denominatorDouble;
		System.out.println("18. 4.4 / 2.2 = " + quotientDouble);

		
		
		/*
		19. What is 5.4 divided by 2?
		*/	
		//reuse the same variable	
		numeratorDouble = 5.4;
		int denominatorInteger = 2;
		quotientDouble = numeratorDouble / denominatorInteger;
		System.out.println("19. 5.4 / 2 = " + quotientDouble);

		/*
		20. What is 5 divided by 2?
		*/
		int numeratorInteger = 5;
		denominatorInteger = 2;
		//integer division truncates the remainder
		int quotientInteger = numeratorInteger / denominatorInteger;
		System.out.println("20. 5 / 2 = " + quotientInteger);

		/*
		21. What is 5.0 divided by 2?
		*/
		numeratorDouble = 5;
		denominatorInteger = 2;
		// if either the numerator or denominator are a double then this will be double division
		quotientDouble = numeratorDouble / denominatorInteger;
		System.out.println("21. 5.0 / 2 = " + quotientDouble);

		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
		
		numeratorDouble = 66.6;
		denominatorInteger = 100;
		quotientDouble = numeratorDouble  / denominatorInteger;
		System.out.println("22. " + quotientDouble);

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		
		numeratorInteger = 19;
		denominatorInteger = 4;
		quotientInteger = numeratorInteger / denominatorInteger;
		int remainderInteger = numeratorInteger % denominatorInteger; // % returns the remainder
		System.out.println("23. 19 / 4 =  " + quotientInteger + " R" + remainderInteger);

		/*
		24. What is 1,000,000,000 * 3?
		*/

		// // can determine the maximum value that an int can be
		// System.out.println(Integer.MAX_VALUE);
		// // adding 1 to the max value cycles to the min value of an int
		// System.out.println(Integer.MAX_VALUE + 1);
		
		int billion = 1000000000;
		long number = 3;
		long threeBillion = billion * number;
		System.out.println("24. Three Billion = " + threeBillion);

		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
		
		boolean doneWithExercises = false;
		System.out.println("25. doneWithExercises = " + doneWithExercises);

		/*
		26. Now set doneWithExercise to true.
		*/
			
		doneWithExercises = true;
		System.out.println("26. doneWithExercises = " + doneWithExercises);
		
	}

}
