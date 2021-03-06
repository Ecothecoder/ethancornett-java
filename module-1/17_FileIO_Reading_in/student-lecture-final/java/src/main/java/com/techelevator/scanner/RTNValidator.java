package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RTNValidator {
	
	private static final int[] CHECKSUM_WEIGHTS = new int[] { 3, 7, 1, 3, 7, 1, 3, 7, 1 };

	public static void main(String[] args) throws FileNotFoundException {

		printApplicationBanner();
		
		int lineNumber = 1; 
		File inputFile = getInputFileFromUser();
		if (inputFile != null) {
			try(Scanner fileScanner = new Scanner(inputFile)) {
				while(fileScanner.hasNextLine()) {
					String line = fileScanner.nextLine();
					//String rtn = line.substring(0, 9);
					
					//if(checksumIsValid(rtn) == false) {
					//	System.out.println(line);
					//}
					//print everything to the console
					System.out.println(lineNumber++ + " " + line);
				}
			}
			catch (Exception e) {
				System.out.println("oops");
			}
		}
	}

	private static void printApplicationBanner() {
		System.out.println("******************");
		System.out.println("RTN Validator 9000");
		System.out.println("******************");
		System.out.println();
	}

	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		File inputFile = null;
		try  {
			
			System.out.print("Please enter path to input file >>> ");
			String path = userInput.nextLine();
		
			 inputFile = new File(path);
		    if(inputFile.exists() == false) { // checks for the existence of a file
				System.out.println(path+" does not exist");
				inputFile = null;
			} else if(inputFile.isFile() == false) {
				System.out.println(path+" is not a file");
				inputFile = null;
			}
		} finally {
		
			return inputFile;
		}
	}

	private static boolean checksumIsValid(String routingNumber) {
		int checksum = 0;
		for(int i = 0; i < 9; i++) {
			int digit = Integer.parseInt(routingNumber.substring(i, i+1));
			checksum += digit * CHECKSUM_WEIGHTS[i];
		}
		return checksum % 10 == 0;
	}
}
