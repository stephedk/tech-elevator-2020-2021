package com.techelevator;

public class Demo {

	// entry point
	public static void main(String[] args) {
		
		introToArrays();
	
		System.out.println("end of program");

	}
	
	public static void introToArrays() {
		
//		// the need for arrays
//		int score1 = 99;
//		int score2 = 87;
//		int score3 = 92;
//		
//		// average
//		int averageScore = (score1 + score2 + score3)/ 3;
//		
		
		int[] scores;
		scores = new int[3];
		
		scores[0] = 99;
		scores[1] = 87;
		scores[2] = 92;
		
		// print the second score
		System.out.println(scores[1]);
		
		// print how many scores
		System.out.println(scores.length);
		System.out.println();
		
		
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
			System.out.println(scores[i]);
		}
		
		System.out.println();
		
		System.out.println("sum of scores: " + sum);
		
		double averageScore = (double)sum/scores.length;
		System.out.println("average score: " + averageScore);
		
	}
	
	public static void whileLoops()
	{
		int counter = 0;
		
		while(counter < 5)
		{
			System.out.println(counter);
			
			counter++;
		}		
	}
	
	public static void forLoops() {

		for(
				int count = 1; 
				count <= 15; 
				count = count + 2
			)
		{
			System.out.println(count);
		}
		
	}

}
