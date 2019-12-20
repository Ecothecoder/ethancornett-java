package com.techelevator.farm;

public class Dog extends FarmAnimal{
	
	public Dog() {
		super("Dog","woof",100); 
	}
	
	@Override
	public String eat() {
		
		return "thankyou";
	}
	

}
