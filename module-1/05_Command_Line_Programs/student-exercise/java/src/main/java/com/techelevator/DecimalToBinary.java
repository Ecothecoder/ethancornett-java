package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		int i;
		String binaryNumber ="";
		Scanner decimal=new Scanner(System.in);
		System.out.print("Enter the number we want to convert");
		int convertableDecimal = decimal.nextInt();
		while (convertableDecimal>0) {
			i=convertableDecimal%2;
			binaryNumber= i +"" +binaryNumber;
			convertableDecimal/=2;
			
		}
		System.out.print("Binary Number is: "+binaryNumber);
	}

}
