package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What are we converting from: F or C?");
		String temp = input.next();
		System.out.println("What is the temperature?");
		
		if ("f".equals(temp)||"F".equals(temp)) {
			double ftemp= input.nextDouble();
			double temper= ((ftemp - 32) / 1.8);
			System.out.printf("It's %.02f degrees in Celsius!", temper);
			}
			double cTemp = input.nextDouble();
			double temper= (cTemp * 1.8 + 32);
			System.out.printf("It's %.02f degrees in Fahrenheit!", temper);
		
		
	}

}
