package com.techelevator.farm;

public class Cow extends FarmAnimal implements Sellable {

	public Cow() {
		
		super("Cow", "moo!",500);
		//System.out.println("In cow constructor");
	}
	
	public Cow(String name, String sound, int price) {
		
		super(name,sound,price);
		//System.out.println("In cow constructor");
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "mmmm";
	}


}