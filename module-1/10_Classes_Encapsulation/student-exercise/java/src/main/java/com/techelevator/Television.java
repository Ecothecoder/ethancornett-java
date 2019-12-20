package com.techelevator;

public class Television {
private boolean isOn;
private int currentChannel;
private int currentVolume;
public Television () {	
	isOn=false;
	currentChannel=3;
	currentVolume=2;
}
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
	isOn=false;
}
public void turnOn() {
	isOn=true;
	currentChannel=3;
	currentVolume=2;
}
public void changeChannel(int channel) {
	if (isOn==true&&currentChannel>=3&&currentChannel<=18)
	currentChannel=channel;
}
public void channelUp() {
	if (isOn==true)
		if (currentChannel==18)
			currentChannel=3;
		else
			currentChannel+=1;
}
public void channelDown() {
	if (isOn==true)
		if (currentChannel==3)
			currentChannel=18;
		else
			currentChannel-=1;

	}
public void raiseVolume() {
	if (isOn==true)
		if (currentVolume==10)
			currentVolume=currentVolume;
		else 
			currentVolume+=1;
}
public void lowerVolume() {
	if (isOn==true)
		if (currentVolume==0)
			currentVolume=currentVolume;
		else
			currentVolume-=1;
}










}
