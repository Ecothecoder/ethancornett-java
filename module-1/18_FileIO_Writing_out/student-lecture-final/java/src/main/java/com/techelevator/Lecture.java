package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {
		
		Scanner userInput = new Scanner(System.in);
		
		/* 
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and 
		 * modify file system objects.
		 * 
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 * 
		 * A new instance of File can be created from a String that contains a file system path 
		 */
		
		System.out.print("Enter the path of a file or directory >>> ");
		String path = userInput.nextLine();
		File f = new File(path);

		/* 
		 * The File class allows us to inspect various attributes of a file system object 
		 */
		 
		/* ***************************
		 * INSPECTING THE FILESYSTEM 
		 * ***************************/
		
		if (f.exists()) {
			System.out.println(f.getAbsolutePath() + " exists.");
			if (f.isDirectory()) {
				System.out.println("type: directory");
			}
			else if (f.isFile()){
				System.out.println("type: file;  length: "+ f.length() +" bytes");
				
			}
		}
		else {
			System.out.println(f.getAbsolutePath() + " does not exist");
		}
		
		
		/* 
		 * The File class also allows us to manipulate file system objects 
		 * */
		 
		/* ************************
		 * CREATING A DIRECTORY 
		 * ************************/
		
		System.out.println("Enter path for new directory: ");
		path = userInput.nextLine();
		File newDirectory = new File(path); 
		
		if (newDirectory.exists()) {
			System.out.println(newDirectory.getAbsolutePath() + " already exists ");
		}
		else {
			if (newDirectory.mkdir()) {
				System.out.println(" new directory created: " + newDirectory.getAbsolutePath());
			}
			else {
				System.out.println("Unable to create directory");
			}
				
		}
		 
		/* ************************
		 * CREATING A FILE 
		 * ************************/
		
		System.out.println("Enter a new file name to be placed in the new directory: ");
		String fileName = userInput.nextLine();
		File newFile = new File(newDirectory,fileName); 
		
		if (newFile.createNewFile()) {
			System.out.println("new file created");
		}
		else {
			System.out.println("new file not created");
		}
		
		
		
		 
		/* ************************
		 * WRITING TO A FILE 
		 * ************************/
		System.out.println("enter content to write to file");
		String message = userInput.nextLine(); 
		
		try (PrintWriter writer = new PrintWriter(newFile)){
			for(int i =0; i<100; i++) {
				writer.println(message); 
			}
		}
		
		
	}

}
