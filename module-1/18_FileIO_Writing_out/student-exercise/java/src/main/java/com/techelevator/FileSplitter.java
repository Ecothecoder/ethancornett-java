package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSplitter {
	public static void main(String[] args) throws IOException {
		System.out.println("Where is your input file?");
		Scanner input = new Scanner(System.in);
		String file = input.next();
		File userInput = new File(file);
		int count = 1;
		Path path = Paths.get(file);
		long lineCount = Files.lines(path).count();
		System.out.println("How many lines (MAX) are we going to put in the splits with?");
		int splits = input.nextInt();
		int divide = (int) (lineCount / splits) + 1;
		System.out.println("You've got " + lineCount + " lines! We are making " + divide + " new files!");
		System.out.println("**GENERATING NEW FILES!**");
		if (userInput.exists() && userInput.isFile()) {
			try (Scanner fileScan = new Scanner(userInput)) {
				while (fileScan.hasNextLine()) {
					for (int j = 0; j < divide; j++) {
						File inputCopy = new File("input-" + count++ + ".txt");
						System.out.println("Generating " + inputCopy);
						try (PrintWriter copyWriter = new PrintWriter(inputCopy)) {
							for (int i = 0; i < splits; i++) {
								if (fileScan.hasNextLine()) {
									String line = fileScan.nextLine();
									copyWriter.println(line);
								}
							}
						}
					}

				}

			}

			catch (FileNotFoundException e) {
				System.out.print("OH GOD!?! " + e.getMessage());
			}

		}

	}

}
