package com.techelevator.regex;

public class SimpleRegExpDemo {
	public static void main (String [] args) {
		
		String s = "10+20-30 40";
		String y = "11|12|13|455;"; 
		
		// | => or also, \\ escape
		//split s on + - or space
		String [] strAr = y.split("\\|"); //s.split("\\+|-| "); 
		
		for (String current : strAr) {
			System.out.print(" "+current);
		}
		
	}

}
