package com.techelevator;

public class Elevator {
private int currentFloor;
private int numberOfFloors;
private boolean doorOpen;


public Elevator(int total) {
	numberOfFloors=total;
	currentFloor=1;
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
	doorOpen=true;
}
public void closeDoor() {
	doorOpen=false;
}
public void goUp(int floors) {
	if (doorOpen==false&&currentFloor<numberOfFloors) {
	currentFloor=floors;
	}
}
public void goDown(int floors) {
	if (doorOpen==false&&currentFloor >1) {
	currentFloor=floors;
	}
}








}
