package com.techelevator.product;

public class Product {
	private String name;
	private double price;
	private double weightInOunces;
	public Product() {
		
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		this.name=name;
		return name;
	}public double getPrice() {
		return price;
	}
	public double setPrice(double name) {
		price=name;
		return price;
	}public double getWeightInOunces() {
		return weightInOunces;
	}
	public double setWeightInOunces(double name) {
		weightInOunces=name;
		return weightInOunces;
	}
	
}
