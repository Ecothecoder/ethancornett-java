package com.techelevator.PostalCalculator;

public class PostalService3rdClass implements DeliveryDriver {
	private double rate;
	private double weightInOunces;
	private String name = "PS3rdClass";

	public PostalService3rdClass() {

	}

	public double calculateRate(int distance, double weight) {
		if (weightInOunces <= 2)
			rate = distance * .0035;
		else if (weightInOunces <= 8)
			rate = distance * .0040;
		else if (weightInOunces <= 15)
			rate = distance * .0047;
		else if (weightInOunces <= 16)
			rate = distance * .0195;
		else if (weightInOunces <= 128)
			rate = distance * .0450;
		else if (weightInOunces > 128)
			rate = distance * .0170;
		return rate;
	}

	public String getName() {
		return name;
	}

}
