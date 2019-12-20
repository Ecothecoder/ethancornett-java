package com.techelevator;

import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		
				System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */
		//make life easy - name it hello 1 and hello 2
		
		//declare
		String hello1 ; 
		
		//instantiate
		hello1 = new String(); 
		
		//initialize
		hello1 = "Katie"; 
		
		String capsKatie = hello1.toUpperCase(); 
		
		String hello2 = "hello"; 
		
		if (hello1.equals(capsKatie)) {
			System.out.println("This should print;");
		}
		
		Scanner input = new Scanner(System.in); 

		/* create an new instance of String using a literal */

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();
		
	
		int helloLength = hello1.length(); 
		System.out.print("The length of "+hello1+" is " + helloLength);
		
		for (int i =0; i<hello1.length(); i++) {
			System.out.println("Character at "+i + " is " + hello1.charAt(i));
			 
		}
		
		//write my own indexOf
		int indexOfA  = -1; 
		for (int i =0; i<hello1.length(); i++) {
			if (hello1.charAt(i)=='a') {
				indexOfA = i;
				break;
			}
			 
		}
		
		String startOfHello = hello2.substring(1,3); 
		System.out.println(startOfHello); 
		
			
		// just make the first letter of Hello2 uppercase
		String newHello2 = hello2.substring(0,1).toUpperCase() + hello2.substring(1); 
		

		/* Other commonly used methods:
		 *
		 * charAt
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */


		boolean prefix = newHello2.startsWith("abc"); 
		newHello2.equals('c');
		
		
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();




		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		
		hello2 = "K"+"atie";
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

	}
}
