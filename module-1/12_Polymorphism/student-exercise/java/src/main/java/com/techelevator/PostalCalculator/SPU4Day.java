package com.techelevator.PostalCalculator;

public class SPU4Day implements DeliveryDriver {
	private double rate;

	private String name = "SPU4Day";

	SPU4Day() {

	}

	public double calculateRate(int distance, double weight) {
		rate = ((weight / 16) * 0.0050) * distance;
		return rate;
	}

	public String getName() {
		return name;
	}

}
