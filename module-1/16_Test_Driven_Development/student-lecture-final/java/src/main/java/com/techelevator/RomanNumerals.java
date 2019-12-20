package com.techelevator;

public class RomanNumerals {

	public String convert(int i) {
		
		String romanString = "";
		
		while (i>=100) {
			romanString += "C";
			i -=100;
		}
		
		if (i >= 90 && i<100) {
			romanString += "XC";
			i -= 90;
		}
		
		while(i>=50 && i<90) {
			romanString += "L";
			i -= 50; 
		}
		
		if (i >= 40 && i<50) {
			romanString += "XL";
			i -= 40;
		}
		
		while (i>=10 && i<40) {
			romanString += "X"; 
			i -= 10;
		}
		
		romanString += appendLastDigit(i);
		
		return romanString;
				
	}

	private String appendLastDigit(int i) {
		String romanString = "";
		if (i%10==9) {
			romanString +=  "IX";
		}		 
		if ( i >= 5 && i<9)
		{
			romanString += "V";
		}	
		
		if (i%5==1) {
			romanString += "I";
		}
		else if (i%5==2) {
			romanString+= "II";
		}
		else if (i%5==3) {
			romanString+= "III";
		}
		else if (i%5==4 && i<5) {
			romanString += "IV";
		}
		return romanString;
	}

}
