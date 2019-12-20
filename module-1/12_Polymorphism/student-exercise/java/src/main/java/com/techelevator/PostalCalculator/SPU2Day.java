package com.techelevator.PostalCalculator;

public class SPU2Day implements DeliveryDriver {
	private double rate;

	private String name = "SPU2Day";

	SPU2Day() {

	}

	public double calculateRate(int distance, double weight) {
		rate = ((weight / 16) * 0.050) * distance;
		return rate;
	}

	public String getName() {
		return name;
	}
}
