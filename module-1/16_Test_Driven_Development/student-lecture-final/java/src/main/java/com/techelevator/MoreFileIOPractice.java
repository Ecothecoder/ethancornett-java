package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MoreFileIOPractice {

	public static void main(String[] args) {
		
		//Test creating a file by writing.		
		testCreateFileByWriting(); // you can create a file, not a directory
		
		try {
			testScanOutsideOfTry();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String s = "one"; //pretend that s is user input
		int x = 0; 
		//while (true) {
			try {
				//s = prompt the user for the string again
				x = Integer.parseInt(s);
				//break;
			}
			catch (Exception e) {
				System.out.println(s + " is not an integer." + e.getMessage()); 
			}
		//}
		
		
		System.out.println("Done");
	
		

	}
	
	private static void fileSplitter(int maxLinesInFiles) {
		File f = new File("TestingFile.txt");
		
		try (Scanner fScan = new Scanner (f)) {
			
			int numLinesInCurrentFile = 0;
			int onFileNum = 1; 
			
			//PrintWriter pw = new PrintWriter(//that new file name)
			while (fScan.hasNextLine()) {
				String line = fScan.nextLine();
				
				//if the number of lines in the current file is less than maxLinesInFiles
				//just write it and increment numLinesInCurrentFile
				
				//otherwise
			       //create a new file that is named fileName-onFileNum.txt and create new object for pw to write to it
				   //write the line to that file
				   //and then reset numLinesInCurrentFile to be 1
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void testScanOutsideOfTry() throws FileNotFoundException {
		File f = new File("TestingFile.txt");
		Scanner fScan = new Scanner (f);
		
		//print everything from the file to the console
		while (fScan.hasNextLine()) {
			String line = fScan.nextLine();
			System.out.println(line);
		}
		
		fScan.close();
		
	}

	private static void testCreateFileByWriting() {
		File f = new File ("TestingFileB.txt");
		try (PrintWriter fPrinter = new PrintWriter(f)) {
			
			fPrinter.println("test");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error opening file for writing. "+e.getMessage());
		}
	}

}
