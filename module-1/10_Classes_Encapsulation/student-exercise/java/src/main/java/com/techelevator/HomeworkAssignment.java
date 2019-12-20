package com.techelevator;

public class HomeworkAssignment {
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks=possibleMarks;
	}
	public String getLetterGrade () {
		double letterGrade = ((double)earnedMarks/(double)possibleMarks)*100;
		String letter ="";
		if (letterGrade>=90)
			letter = "A";
		else if (letterGrade>=80&&letterGrade<=89)
			letter ="B";
		else if (letterGrade>=70&&letterGrade<=79)
			letter = "C";
		else if (letterGrade>=60&&letterGrade<=69)
			letter ="D";
		else
			letter ="F";
		
		return letter;
	}
	public int  getPossibleMarks() {
		return possibleMarks;
	}
	
	public int getEarnedMarks() {
		return earnedMarks;
	}
	public void setEarnedMarks(int marks) {
		earnedMarks=marks;
	}

	public String getSubmitterName () {
		return submitterName;
	}
	public void setSubmitterName (String name) {
		submitterName = name;}
}
