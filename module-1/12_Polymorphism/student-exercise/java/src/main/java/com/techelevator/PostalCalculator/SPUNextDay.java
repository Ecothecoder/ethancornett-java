package com.techelevator.PostalCalculator;

public class SPUNextDay implements DeliveryDriver {
	private double rate;

	private String name = "SPUNextDay";

	SPUNextDay() {

	}

	public double calculateRate(int distance, double weight) {
		rate = ((weight / 16) * 0.075) * distance;
		return rate;
	}

	public String getName() {
		return name;
	}
}
