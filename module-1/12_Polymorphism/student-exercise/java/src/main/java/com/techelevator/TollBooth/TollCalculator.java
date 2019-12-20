package com.techelevator.TollBooth;

import java.util.ArrayList;
import java.util.List;

public class TollCalculator {
	public static void main(String[] args) {
		List<Vehicle> Toll = new ArrayList<>();
		int totalMiles = 0;
		double totalPrice = 0;
		Vehicle car = new Car(true);
		String nameish = "";
		Toll.add(car);
		Toll.add(new Car(false));
		Toll.add(new Truck(4));
		Toll.add(new Truck(6));
		Toll.add(new Truck(8));
		Toll.add(new Tank());

		System.out.printf("%-20s%-20s%s\n", "Vehicle", "Distance Traveled", "Toll $");
		for (int i = 0; i < 46; i++) {
			System.out.print("-");
		}
		System.out.println();

		for (Vehicle machine : Toll) {
			nameish = "";
			int random = (int) (Math.random() * 231 + 10);
			String.valueOf(machine.calculateToll(random));
			totalMiles += random;
			totalPrice += machine.calculateToll(random);
			if (machine instanceof Car) {
				nameish += "Car";
				if (((Car) machine).isHasTrailer()) {
					nameish += " (with trailer)";
				}
			}
			if (machine instanceof Truck) {
				nameish += "Truck";
				if (((Truck) machine).getNumberOfAxels() == 4) {
					nameish += " (4 Axels)";
				} else if (((Truck) machine).getNumberOfAxels() == 6) {
					nameish += " (6 Axels)";
				} else if (((Truck) machine).getNumberOfAxels() == 8) {
					nameish += " (8 Axels)";
				}
			}
			if (machine instanceof Tank) {
				nameish += "Tank";
			}

			System.out.printf("%-20s%-20d$%.2f\n", nameish, random, machine.calculateToll(random));
		}
		System.out.println();
		System.out.println();
		System.out.println("Total Miles Traveled: " + totalMiles);
		System.out.printf("Total Tollbooth Revenue: $%.2f", totalPrice);

	}
}