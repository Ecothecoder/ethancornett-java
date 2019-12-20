package com.techelevator.calculator;

public class Calculator {
public Calculator() {
	
}
private int result;

public int getResult() {
	return result;}

public void reset() {
	result =0;
}

public int add (int added) {
	result +=added;
	return result;
}
public int multiply(int multiplier) {
	result *= multiplier;
	return result;
}
public int power(int exponent) {
	result = (int) Math.pow(result,exponent);
	return result;
}
public int subtract(int subtract) {
	result-=subtract;
	return result;
}












	
}
