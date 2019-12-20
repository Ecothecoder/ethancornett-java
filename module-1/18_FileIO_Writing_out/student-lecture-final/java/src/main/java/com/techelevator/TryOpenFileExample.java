package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class TryOpenFileExample {
	
	public static void main(String []args) {
		Scanner input = new Scanner (System.in);

		//open this file for reading and print the contents
		try (Scanner fileInput = new Scanner(new File("MyTestFiles/KatieTest.txt"))){
		//try (Scanner fileInput = new Scanner(new File("C:\\Users\\Katie Dwyer\\Documents\\Cohort5\\test.txt"))){	
			while(fileInput.hasNextLine()) {
				String theLine = fileInput.nextLine();
				String theNextLine = fileInput.nextLine(); //there might not be a nextLine here
				System.out.println(theLine + "||" + theNextLine);
				
			}
			
		}
		catch (Exception e) {
			System.out.println("what did you do? " + e.getMessage());
		}
		
		try 
		{
		
			System.out.println("Enter an int: ");
			int x = Integer.parseInt(input.nextLine());
			
		}
		catch (Exception e) {
			System.out.println("what did you do? " + e.getClass() + e.getMessage());
		}
	}

}
