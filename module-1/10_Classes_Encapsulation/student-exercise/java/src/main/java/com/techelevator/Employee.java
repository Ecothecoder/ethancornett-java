package com.techelevator;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;

	public Employee (int employeeId, String firstName, String lastName, double salary){
		this.employeeId =employeeId;
		this.firstName =firstName;
		this.lastName = lastName;
		annualSalary= salary;
	}
	public String getFullName() {
		String fullName = (lastName+", "+firstName);
		return fullName;
		}
	public void raiseSalary (double percent) {
		annualSalary+=(percent/100)*annualSalary;
		//annualSalary+=annual;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String name) {
		lastName=name;
	}
	public String getDepartment () {
		return department;
	}
	public void setDepartment(String place) {
		department=place;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}




















}

