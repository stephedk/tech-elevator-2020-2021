package com.techelevator;

public class TriangleWall extends Wall {
	
	private int base;
	private int height;
	


	public int getBase() {
		
		return base;
		
	}
	
	public int getHeight() {
		
		return height;
	}

	public TriangleWall(String name, String color, int base, int height) {
		
		super(name, color);
		this.base = base;
		this.height = height;
	}
	
	public int getArea() {
		
		return (base * height)/2;
	}
	
	public String toString() {
		
		return getName()+" (" + getBase() + "x" + getHeight() + ") triangle";
		
		
	}
	
}



