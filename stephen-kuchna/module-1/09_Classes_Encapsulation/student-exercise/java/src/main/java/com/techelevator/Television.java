package com.techelevator;

public class Television {

	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
//
//- `turnOff()` turns off the TV.
//- `turnOn()` turns the TV on and also resets the channel to three and the volume level to two.
//- `changeChannel(int newChannel)` changes the current channel—only if it's on—to the value of `newChannel` as long as it's between 3 and 18.
//- `channelUp()` increases the current channel by one, only if it's on. If the value goes past 18, then the current channel should be set to three.
//- `channelDown()` decreases the current channel by one, only if it's on. If the value goes below three, then the current channel should be set to 18.
//- `raiseVolume()` increases the volume by one, only if it's on. The limit is 10.
//- `lowerVolume()` decreases the volume by one, only if it's on. The limit is zero.
//
//	 */
	
	public boolean isOn() {
		
		return isOn;
	}
	
	public int getCurrentChannel() {
		
		return currentChannel;
	}
	
	public int getCurrentVolume() {
		
		return currentVolume;
	}
	
	
	public void turnOff() {
		
		this.isOn = false;
		
	}
	
	public void turnOn() {
		
		this.isOn = true;
		this.currentChannel = 3;
		this.currentVolume = 2;
		
	}
	
	public void changeChannel(int newChannel) {
		
		if(isOn && currentChannel >= 3 && currentChannel <=18) {
			
			currentChannel = newChannel;
		}
		
	}
	
	public void channelUp() {
		
		if(isOn && currentChannel < 18) {
			
			currentChannel++;
			
		}
		else if(isOn){
			currentChannel = 3;
		}
	}
			
	
	public void channelDown() {
		
		if(isOn && currentChannel > 3) {
					
			currentChannel--;
					
		}
		
		else if(isOn){
			currentChannel = 18;
		}
	}
	
	public void raiseVolume() {
		
		if(isOn && currentVolume < 10) {
			
			currentVolume++;
		}
	
	}
	
	
	public void lowerVolume() {
		
		if(isOn && currentVolume > 0) {
			
			currentVolume--;
		}
	}
}


