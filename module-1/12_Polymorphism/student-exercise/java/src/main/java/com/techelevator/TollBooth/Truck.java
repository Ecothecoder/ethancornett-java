package com.techelevator.TollBooth;

public class Truck implements Vehicle {

	private int numberOfAxles;
	private double toll;

	public Truck(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	public double calculateToll(int distance) {
		if (numberOfAxles == 4)
			toll = 0.040 * distance;
		else if (numberOfAxles == 6)
			toll = 0.045 * distance;
		toll = 0.048 * distance;
		return toll;
	}

	public int getNumberOfAxels() {
		return numberOfAxles;
	}

}
