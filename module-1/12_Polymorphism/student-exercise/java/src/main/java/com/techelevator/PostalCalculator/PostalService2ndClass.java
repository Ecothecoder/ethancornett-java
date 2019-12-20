package com.techelevator.PostalCalculator;

public class PostalService2ndClass implements DeliveryDriver {
	private double rate;
	private String name = "PS2ndClass";
	private double weightInOunces;

	public PostalService2ndClass() {

	}

	public double calculateRate(int distance, double weight) {
		if (weightInOunces <= 2)
			rate = distance * .0020;
		else if (weightInOunces <= 8)
			rate = distance * .0022;
		else if (weightInOunces <= 15)
			rate = distance * .0024;
		else if (weightInOunces <= 16)
			rate = distance * .0150;
		else if (weightInOunces <= 128)
			rate = distance * .0160;
		else if (weightInOunces > 128)
			rate = distance * .0500;
		return rate;
	}

	public String getName() {
		return name;
	}

}
