package com.techelevator.PostalCalculator;

import java.util.Scanner;

public class PostalCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How heavy is your box?");
		int weightInOunces = input.nextInt();
		System.out.println("How far we going?");
		int distance = input.nextInt();
		System.out.println("Delivery Method       $ cost");
		System.out.println("-----------------------------");

		System.out.printf("%-20s $%.2f\n", new FexEd().getName(), new FexEd().calculateRate(distance, weightInOunces));
		System.out.printf("%-20s $%.2f\n", new PostalService1stClass().getName(),
				new PostalService1stClass().calculateRate(distance, weightInOunces));
		System.out.printf("%-20s $%.2f\n", new PostalService2ndClass().getName(),
				new PostalService2ndClass().calculateRate(distance, weightInOunces));
		System.out.printf("%-20s $%.2f\n", new PostalService3rdClass().getName(),
				new PostalService3rdClass().calculateRate(distance, weightInOunces));
		System.out.printf("%-20s $%.2f\n", new SPUNextDay().getName(),
				new SPUNextDay().calculateRate(distance, weightInOunces));
		System.out.printf("%-20s $%.2f\n", new SPU2Day().getName(),
				new SPU2Day().calculateRate(distance, weightInOunces));
		System.out.printf("%-20s $%.2f\n", new SPU4Day().getName(),
				new SPU4Day().calculateRate(distance, weightInOunces));

	}
}