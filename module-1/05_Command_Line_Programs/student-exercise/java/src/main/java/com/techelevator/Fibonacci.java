package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What number are we testing today?");
		int inputFibo = input.nextInt();
		if (inputFibo > 1) {
			System.out.print("0, 1, 1, ");
			int Fibo2=1;
			int Fibonachi=1;
			for (int i=1; i+Fibo2<inputFibo;) {
				Fibonachi = i+Fibo2;
				i=Fibo2;
				Fibo2=Fibonachi;
				System.out.print(Fibonachi+", ");
				
			}
				System.out.println("There are no more numbers less then "+inputFibo+" in the series, have a great day!");
		}
	}

}
