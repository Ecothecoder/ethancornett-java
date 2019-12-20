package com.techelevator.PostalCalculator;

public class PostalService1stClass implements DeliveryDriver {
	private double rate;
	private String name = "PS1ndClass";
	private double weightInOunces;

	public PostalService1stClass() {

	}

	public double calculateRate(int distance, double weight) {
		weightInOunces = weight;
		if (weightInOunces <= 2)
			rate = distance * .035;
		else if (weightInOunces <= 8)
			rate = distance * .040;
		else if (weightInOunces <= 15)
			rate = distance * .047;
		else if (weightInOunces <= 16)
			rate = distance * .195;
		else if (weightInOunces <= 128)
			rate = distance * .450;
		else if (weightInOunces > 128)
			rate = distance * .500;
		return rate;
	}

	public String getName() {
		return name;
	}

}
