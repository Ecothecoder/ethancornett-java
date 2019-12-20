package com.techelevator;

import java.util.Date;

public class BaseballPlayer {
	
	String firstName;
	String lastName;
	String teamName;
	int jerseyNumber;
	Date dob;
	
	int timesAtBat;
	int numHits;
	public BaseballPlayer() { //name of constructor is the same as the class, public or private
		
		
	}
	
	public BaseballPlayer(String fName, String lName) {
		firstName = fName;
		lastName = lName;
		
	}

}
