package com.techelevator;

public class Car {

	private int year;
	private String make;
	private boolean isClassicCar;
	private int age;
	
	public Car(int year, String make, boolean isClassicCar) {
		
		this.year = year;
		this.make = make;
		this.isClassicCar = isClassicCar;
		
		if (year > 25) {
			
			isClassicCar = true;
		}
		
	}
	
	public int getAge() {
	
		return age;
	}
	
	public int getYear() {
		
		return year;
	}
	
	public String getMake() {
		
		return make;
	}
	
	public boolean isClassic() {
		
		return isClassicCar;
	}
}
