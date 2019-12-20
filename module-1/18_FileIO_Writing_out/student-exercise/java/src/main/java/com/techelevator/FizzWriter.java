package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {
		String FB = "FizzBuzz.txt";
		File fizzBuzz = new File(FB);
		try (PrintWriter fizzWriter = new PrintWriter(FB)) {
			for (int i = 1; i < 301; i++) {
				String iString = Integer.toString(i);
				if (i % 3 == 0 && i % 5 == 0)
					fizzWriter.println(i + " FizzBuzz");
				else if (i % 3 == 0 || iString.contains("3"))
					fizzWriter.println(i + " Fizz");
				else if (i % 5 == 0 || iString.contains("5"))
					fizzWriter.println(i + " Buzz");

				else

					fizzWriter.println(i);

			}
			System.out.println("FizzBuzz.txt has been created.");

		} catch (FileNotFoundException e) {
			System.out.print("ERRERERERERERERE!!!" + e.getMessage());
		}
	}
}