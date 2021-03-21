package com.techelevator;

public abstract class Wall {

	private String name;
	private String color;
	
	public Wall(String name, String color) {	
		
		this.name = name;
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract int getArea();}
	

