package com.techelevator.farm;

import java.math.BigDecimal;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private BigDecimal price; 
	private boolean sleeping; 

	public FarmAnimal(String name, String sound, int price) {
		//System.out.println("in FarmANimal Constructor");
		this.name = name;
		this.sound = sound;
		this.price = new BigDecimal( price);
		sleeping = false;
	}
	
	public String getName( ) {
		return name;
	}
	public final String getSound( ) {
		if (sleeping) {
			return "zzzzz"; 
		}
		return sound;
	}
	public BigDecimal getPrice( ) {
		return price;
	}
	
	public boolean isSleeping() {
		return sleeping;
	}
	
	public void goToSleep() {
		sleeping = true;
	}
	public void wakeUp() {
		sleeping = false;
	}
	
	public abstract String eat();
}