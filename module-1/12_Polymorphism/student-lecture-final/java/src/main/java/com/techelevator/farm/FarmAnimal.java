package com.techelevator.farm;

import java.math.BigDecimal;

public class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private BigDecimal price; 

	public FarmAnimal(String name, String sound, int price) {
		System.out.println("in FarmANimal Constructor");
		this.name = name;
		this.sound = sound;
		this.price = new BigDecimal( price);
	}
	
	public String getName( ) {
		return name;
	}
	public String getSound( ) {
		return sound;
	}
	public BigDecimal getPrice( ) {
		return price;
	}
	
}