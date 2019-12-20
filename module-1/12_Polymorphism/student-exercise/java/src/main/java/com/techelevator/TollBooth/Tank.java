package com.techelevator.TollBooth;

public class Tank implements Vehicle {
	private double toll;

	public Tank() {

	}

	public double calculateToll(int distance) {
		toll = distance * 0;
		return toll;
	}

}
