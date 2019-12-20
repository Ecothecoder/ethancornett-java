package com.techelevator.TollBooth;

public class Car implements Vehicle {
	private boolean hasTrailer;
	private double toll;

	public Car(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}

	public double calculateToll(int distance) {
		toll = distance * 0.020;
		if (hasTrailer) {
			toll = toll + 1.00;
		}
		return toll;
	}

	public boolean isHasTrailer() {
		return hasTrailer;
	}

}
