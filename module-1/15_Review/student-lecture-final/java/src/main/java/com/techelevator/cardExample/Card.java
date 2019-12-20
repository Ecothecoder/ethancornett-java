package com.techelevator.cardExample;

import java.util.HashMap;
import java.util.Map;

public class Card {
	private static Map<String,String> convertSuit = new HashMap<>(); 
	
	public static char convertSuitToSymbol(String s) {
		if (s.equalsIgnoreCase("s")) {
			return '\u2660';
		}
		if (s.equalsIgnoreCase("h")) {
			return '\u2764';
		}
		if (s.equalsIgnoreCase("c")) {
			return '\u2663';
		}
		if (s.equalsIgnoreCase("d")) {
			return '\u2666';
		}
		return s.charAt(0);
	}
	
	private String suit;
	private String value;
	private boolean faceUp;
	
	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;
		faceUp = false;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public String getValue() {
		return value;
	}
	
	public int getNumericValue() {
		if (getValue().charAt(0)>='2' && getValue().charAt(0) <= '9') {
			return Integer.parseInt(value);
		}
		else if (value.equals("A")) {
			return 1;
		}
		else {
			return 10;
		}

	}
	
	
	public boolean isFaceUp() {
		return faceUp;
	}
	
	public Card flip() {
		faceUp = !faceUp; 
		return this;
	}
	
	@Override
	public String toString() {
		if (faceUp) {
			return value +  convertSuitToSymbol(suit); 
		}

		return "##";

	}

}
