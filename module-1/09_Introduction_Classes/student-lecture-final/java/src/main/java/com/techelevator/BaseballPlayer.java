package com.techelevator;

import java.util.Date;

public class BaseballPlayer {
	
	//variables/data
	private String firstName;
	private String lastName;
	private String teamName; 
	private int jerseyNumber;
	private Date dob; 
	boolean isLeftHanded; 
	
	private int timesAtBat;
	private int numHits;
	
	public BaseballPlayer() {		
		
	}
	
	public BaseballPlayer(String fName, String lName) {		
		firstName = fName;
		lastName = lName;	
	}
	

	//methods/behavior
	
	public boolean getIsLeftHanded() {
		return isLeftHanded;
	}
	
	public String getFirstName() {
		return firstName;		
	}
	
	public void setFirstName (String fName) {
		 firstName = fName;		
	}
	public String getLastName() {
		return lastName;		
	}
	
	public void setLastName (String name) {
		 lastName = name;		
	}
	
	public String getFullName() {
		return firstName+" "+lastName; 
	}
	
	public void setTimesAtBat(int timesAtBat) {
		this.timesAtBat = timesAtBat;		
	}
	
	public boolean setNumHits(int count) {
		if (count > timesAtBat) {
			return false;
		}
		numHits = count;	
		return true;
	}

	public double getBattingAverage() {
		return (double) numHits / timesAtBat; 
	}
	
	public String toString() {
		return "Name " + getFullName() + " Batting averge "+getBattingAverage();  
	}


}
