package com.techelevator.company;

public class Company {
private String name;
private int numberOfEmployees;
private double revenue;
private double expenses;

public Company() {
	
}

public String getCompanySize() {
if (numberOfEmployees>250)
return "large";
else if (numberOfEmployees>50&&numberOfEmployees<251)
	return "medium";
return "small";
}

public double getProfit() {
	if (revenue>expenses)
		return revenue-expenses;
	else
		return expenses-revenue;
}

public void setNumberOfEmployees(int number) {
	numberOfEmployees=number;
}
public int getNumberOfEmployees() {
	return numberOfEmployees;
}

public double getRevenue() {
	return revenue;		
}

public double setRevenue (double number) {
	 revenue = number;		
	 return revenue;
}
public double getExpenses() {
	return expenses;		
}

public double setExpenses (double number) {
	 expenses = number;	
	 return expenses;
}

public String getName() {
	return name;		
}

public String setName (String name) {
	 this.name = name;	
	 return name;
}
	//
	// Write code here
	//
	
}
