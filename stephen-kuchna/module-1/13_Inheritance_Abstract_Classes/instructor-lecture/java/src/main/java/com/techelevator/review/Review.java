package com.techelevator.review;

public class Review
{
	public static void main(String[] args)
	{
		RightTriangle triangle = new RightTriangle(12, 16);
		System.out.println(triangle.getBase() + "-" + triangle.getHeight() + "-" + triangle.getLength());
	}
	
	
	public static void sayHello(String name)
	{
		System.out.println("Hello " + name);
	}
	
	public static void sayHello(String firstName, String lastName)
	{
		System.out.println("Hello " + firstName + " " + lastName);
	}

}
