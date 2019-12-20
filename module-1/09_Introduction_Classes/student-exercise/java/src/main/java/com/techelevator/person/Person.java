package com.techelevator.person;

public class Person {
private String firstName;
private String lastName;
private int age;
public Person() {
	
}

public boolean isAdult() {
	if (age>=18)
		return true;
	return false;
}
public String getFullName(){
	return firstName+" "+lastName;
}
public String getFirstName() {
	return firstName;
}
public String setFirstName(String name) {
	firstName=name;
	return firstName;
}
public String getLastName() {
	return lastName;
}
	public String setLastName(String name) {
		lastName=name;
		return lastName;

	}
	public int getAge() {
		return age;
	}
	public int setAge(int years) {
		age=years;
		return age;

		}
}
