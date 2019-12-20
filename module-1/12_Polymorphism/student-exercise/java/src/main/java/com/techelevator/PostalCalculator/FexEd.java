package com.techelevator.PostalCalculator;

public class FexEd implements DeliveryDriver {
	private double rate;

	private String name = "FexEd";

	public double calculateRate(int distance, double weight) {
		rate = 20.00;
		if (distance >= 500)
			rate += 5.00;
		if (weight >= 48)
			rate += 3.00;
		return rate;
	}

	public String getName() {
		return name;
	}
}
