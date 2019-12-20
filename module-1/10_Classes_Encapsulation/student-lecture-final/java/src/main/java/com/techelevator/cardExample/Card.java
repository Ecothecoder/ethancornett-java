package com.techelevator.cardExample;

import java.util.HashMap;
import java.util.Map;

public class Card {
	private static Map<String,String> convertSuit = new HashMap<>(); 
	
	public static char convertSuitToSymbol(String s) {
		if (s.equalsIgnoreCase(s)) {
			return '\u2664';
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
	
	public boolean isFaceUp() {
		return faceUp;
	}
	
	public void flip() {
		faceUp = !faceUp; 
	}
	
	@Override
	public String toString() {
		if (faceUp) {
			return value +  suit; 
		}

		return "##";

	}

}
