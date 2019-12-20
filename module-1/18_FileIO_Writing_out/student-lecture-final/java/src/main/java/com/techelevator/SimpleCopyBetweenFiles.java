package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleCopyBetweenFiles {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		 //prompt the user for the file to copy from
		System.out.println("Enter the file to copy from: ");
		String sourceFileName = userInput.nextLine();
		File sourceFile = new File(sourceFileName);
		
		if (sourceFile.exists() && sourceFile.isFile()) {
						
			//prompt the user for the file to copy to
			System.out.println("Enter the file to copy to: ");
			String destFileName = userInput.nextLine();
			File destFile = new File(destFileName);
			
			if (destFile.exists()) {
				System.out.println("can't copy, destination exists!");
			}
			else {
				try (Scanner sourceScanner = new Scanner(sourceFile)) {
					 if (destFile.createNewFile()) {
						 try (PrintWriter destWriter = new PrintWriter(destFile)){
							 int lineCount = 1; 
							while(sourceScanner.hasNextLine()) {
								String nextLine =  sourceScanner.nextLine(); 
								destWriter.println(lineCount++ + " "+ nextLine); 
							}
							System.out.println("copy finished"); 
							
						 }
					 }
					 else {
						 System.out.println("Could not create destination file. Ending"); 
					 }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Error" + e.getMessage());
				}
				
				
				}
		}
		else {
			System.out.println(" can't copy that!"); 
		}

	}

}
