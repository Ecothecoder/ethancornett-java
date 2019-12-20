package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner file = new Scanner(System.in);
		File aliceText = null;
		System.out.println("What file are we looking through?");
		String path = file.nextLine();
		aliceText = new File(path);
		System.out.print("What word we looking for?");
		String word = file.next();
		Scanner file3 = new Scanner(System.in);
		System.out.println("Is that case sensitive?Y/N");
		String input = file3.next();
		int count = 0;
		if (input.charAt(0) == 'Y' || input.charAt(0) == 'y') {
			try (Scanner fileScan = new Scanner(aliceText)) {
				while (fileScan.hasNextLine()) {
					String line = fileScan.nextLine();
					count++;
					if (line.contains(word)) {
						System.out.println(count + ") " + line);
					}
				}
			} catch (Exception e) {
				System.out.println("EVERYTHING IS BROKEN");
			}
		} else if (input.charAt(0) == 'N' || input.charAt(0) == 'n') {
			try (Scanner fileScan = new Scanner(aliceText)) {
				while (fileScan.hasNextLine()) {
					count++;
					String line = fileScan.nextLine();
					if (line.toLowerCase().contains(word.toLowerCase())) {
						System.out.println(count + ") " + line);
					}
				}
			} catch (Exception e) {
				System.out.println("EVERYTHING IS BROKEN");
			}
		}

	}
}