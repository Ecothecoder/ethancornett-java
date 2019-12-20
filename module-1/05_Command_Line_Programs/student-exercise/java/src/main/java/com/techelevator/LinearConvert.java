package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What are we converting from: F or M?");
		String Length = input.next();
		System.out.println("What is the length we are testing?");
		
		if ("f".equals(Length)||"F".equals(Length)) {
			double fLength= input.nextDouble();
			double finalFeet= (fLength *  0.3048 );
			System.out.printf(fLength+"F = %.02f in meters!", finalFeet);
			}
			double mLength = input.nextDouble();
			double finalMeters= (mLength * 3.2808399);
			System.out.printf(mLength+"M = %.02f in feet!", finalMeters);
		
	}

}
