package com.techelevator.cardExample;

public class MainProgram {

	public static void main(String[] args) {
		
		
		Card aceOfSpades = new Card("spades", "Ace");

		System.out.println(aceOfSpades);

		aceOfSpades.flip();

		System.out.println(aceOfSpades);
		

		Card twoOfHearts = new Card("h", "2");
		twoOfHearts.flip();
		
		System.out.println(twoOfHearts);
		
		char symbolForSpade = Card.convertSuitToSymbol("s");
		System.out.println(symbolForSpade);

		Deck deckOfCards = new Deck();
		deckOfCards.flipAll();

		System.out.println(deckOfCards);

		deckOfCards.shuffle(10);
		

		System.out.println(deckOfCards);
		

		Card topCard = deckOfCards.dealOneCard();
		//topCard.flip();

		System.out.println(topCard);
		System.out.println(deckOfCards);
		
		deckOfCards.reset();
		deckOfCards.flipAll();
		System.out.println(deckOfCards);
		
	}

}
