package com.techelevator;

public class Elevator {

	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;
	
	public Elevator(int numberOfLevels) {
		
		this.numberOfFloors = numberOfLevels;
	}
	
	
	public boolean doorOpen() {
		
		return doorOpen;
	}
	
	public int getCurrentFloor() {
		
		return currentFloor;
	}
	
	public int getNumberOfFloors() {
		
		return numberOfFloors;
	}
	
	public boolean isDoorOpen() {
		
		return doorOpen;
	}
	
	public void openDoor() {
		
		doorOpen = true;
	}
	
	
	public void closeDoor() {
		
		doorOpen = false;
	}
	

	public void goUp(int desiredFloor) {
		if (doorOpen != true){
			if (desiredFloor <= numberOfFloors) {
				if (desiredFloor > currentFloor) {
				currentFloor = desiredFloor;
				}
			}
		}
	}
	public void goDown(int desiredFloor) {
		if (doorOpen != true) {
			if (desiredFloor >=1 ) {
				if (desiredFloor < currentFloor){
				currentFloor = desiredFloor;
				}
			}
		}
	}
}
		