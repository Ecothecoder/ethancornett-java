package com.techelevator.exceptions;

public class Example6 {
	
	//demonstrate throwing another one

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main");
		try {
		method1();
		}
		catch (Exception e) {
			System.out.println("Method 1 had a problem " + e.getMessage());
		}

	}
	
	public static void method1() throws Exception {
		System.out.println("in mehtod 1");
		try {
			method2();
		}
		catch (Exception e) {
			System.out.println("Method 2 had a problem " + e.getMessage());
			throw new Exception("example of rethrowing"); 
		}
		
	}
	
	public static void method2() throws Exception {
		System.out.println("in mehtod 2");
		throw new Exception("method 2 problems");
	}

}
