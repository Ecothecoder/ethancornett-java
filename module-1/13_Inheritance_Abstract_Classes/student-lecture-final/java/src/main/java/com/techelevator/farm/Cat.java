package com.techelevator.farm;

public class Cat extends FarmAnimal{
	
	public Cat() {		
		super("Cat", "meow!",10);
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "chew";
	}
	

}
