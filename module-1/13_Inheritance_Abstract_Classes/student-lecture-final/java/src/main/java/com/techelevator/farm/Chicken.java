package com.techelevator.farm;

public class Chicken extends FarmAnimal implements Sellable {
	
	public Chicken() {
		super("Chicken", "cluck!",15);
	}
	
	public void layEgg() {
		System.out.println("Chicken laid an egg!");		
	}

	@Override
	public String eat() {
		
		return "cluck";
	}
	
	

}