package com.techelevator.farm;

public class Pig extends FarmAnimal implements Sellable {
	
	public Pig() {
		super("Pig","oink",600);
	}
	
	@Override
	public String eat() {
		
		return "snort";
	}
	

}
