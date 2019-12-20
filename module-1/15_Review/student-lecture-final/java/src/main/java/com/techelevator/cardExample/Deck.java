package com.techelevator.cardExample;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	private List<Card> listOfCards = new ArrayList<Card>(); 
	final int numTimesToShuffle = 3; 
	final int numCardsInDeck = 52; 
	
	public Deck() {
		//add every combination of suits and values
		reset();
		/*
		String[]suits = {"s", "h", "c", "d"};
		String[]values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K" }; 
		for (String suit : suits) {
			for (String value : values) {
				Card currentCard = new Card(suit,value);
				listOfCards.add(currentCard);
			}
		}*/
	}
	
	public void reset() {
		listOfCards.clear();
		
		//this is duplicate code as the constructor. that's bad. how should we fix it?
		String[]suits = {"s", "h", "c", "d"};
		String[]values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K" }; 
		for (String suit : suits) {
			for (String value : values) {
				Card currentCard = new Card(suit,value);
				listOfCards.add(currentCard);
			}
		}
	}
	
	public void shuffle() {
		shuffle(numTimesToShuffle); 
	}
	
	//This is an example of overloading - we have two public shuffle methods, but with different parameters
	public void shuffle(int numTimes) {
		
		for (int i = 0; i<numTimes;i++) {
			shuffleOnce();
		}					
	}
	
	public Card dealOneCard() {
		if (listOfCards.size()>0) {
			return listOfCards.remove(0);
			
		}
		return null;
	}
	
	private void shuffleOnce() {
		//cut the deck in half
		List<Card> topHalf = new ArrayList<Card>();
		int count = 0;
		while (count< listOfCards.size()/2) {
			topHalf.add(listOfCards.get(count++));			
		}
			
		List<Card> bottomHalf = new ArrayList<Card>(); 
		while (count<listOfCards.size()) {
			bottomHalf.add(listOfCards.get(count++));
		}
		
		listOfCards.clear();
		
		/* This does the same thing as clear. When we remove, the index of the remaining items all change
		while (listOfCards.size()>0) {
			listOfCards.remove(0);
		}
		*/		
		
		//loop through and take 1-5 cards from each side interweaving them until we're done
		count=0;
		int topHalfIndex = 0;
		int bottomHalfIndex = 0;
		while (topHalfIndex < topHalf.size() || bottomHalfIndex < bottomHalf.size()) {
			
			double r1 = Math.random(); //0.0 to <1
			int numCardsToTakeFromTopHalf = (int)(r1 * 6); 
			//take numCardsToTakeFromTopHalf cards from the top half
			for (int i =0; i<numCardsToTakeFromTopHalf && topHalfIndex < topHalf.size();i++) {			
				Card c =  topHalf.get(topHalfIndex++);
				listOfCards.add(c);	
			}
			double r2 = Math.random(); //0.0 to <1
			int numCardsToTakeFromBottomHalf = (int)(r2 * 6); 
			//take numCardsToTakeFromBottomHalf cards from the bottom half
			for (int i =0; i<numCardsToTakeFromBottomHalf && bottomHalfIndex < bottomHalf.size();i++) {
				Card c =  bottomHalf.get(bottomHalfIndex++);
				listOfCards.add(c);
			}
			
		}
		
		
	}
	
	public void flipAll() {
		for(Card c : listOfCards) {
			c.flip();
		}
	}
	
	@Override
	public String toString() {
		String theString="";
		for(Card c : listOfCards) {
			theString += c+" ";
		}
		return theString; 
	}
	

}
