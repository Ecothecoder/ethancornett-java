package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {
		
		BabyCow mork = new BabyCow(2);
		
		List<Singable> farmThings = new ArrayList<Singable>();
		farmThings.add(new Cow());
		farmThings.add(mork); 
		farmThings.add(new Tractor());
		farmThings.add(new Chicken());
		farmThings.add(new Pig()); 
		farmThings.add(new Dog()); 
		farmThings.add(new Cow());

		
		for(Singable singAbout : farmThings) {
			String name = singAbout.getName();
			String sound = singAbout.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a "+name+", ee, ay, ee, ay, oh!");
			System.out.println("With a "+sound+" "+sound+" here");
			System.out.println("And a "+sound+" "+sound+" there");
			System.out.println("Here a "+sound+" there a "+sound+" everywhere a "+sound+" "+sound);
			System.out.println();
		}
		
		for(Singable animal : farmThings) {
			if (animal instanceof Sellable) {
				System.out.println("The price of a "+animal.getName()+" is "+ ((FarmAnimal)animal).getPrice());
			}
		}
		
		//just the cows
		for(Singable animal : farmThings) {
			if (animal instanceof Sellable && animal instanceof Singable) {
				System.out.println(animal.getName() + " is a cow");
			}
		}

	}
}