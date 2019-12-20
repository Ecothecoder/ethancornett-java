package com.techelevator.cardExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		
		//reviewPrimRefLoops();


		//play blackjack
		Deck deckOfCards = new Deck();
		deckOfCards.shuffle(10);
		

		//lets start out simple. Say there's a dealer and one player
		List<Card> player1 = new ArrayList<Card>();
		List<Card> dealer = new ArrayList<Card>();
		
		//start the deal - Player, Dealer, Player FU, Dealer FU
		player1.add(deckOfCards.dealOneCard());
		dealer.add(deckOfCards.dealOneCard());		
		player1.add(deckOfCards.dealOneCard().flip());
		dealer.add(deckOfCards.dealOneCard().flip());

		System.out.println("Player 1 hand: ");
		printHand(player1);
		
		System.out.println("Dealer hand: ");
		printHand(dealer);
		
		Scanner input = new Scanner(System.in); 	
				
		
		while (!hasBusted(player1)) {
			System.out.println("Would you like a hit? Type H for hit or D to display your hand face up. Enter anything else to be finished"); 
			char choice = input.nextLine().toLowerCase().charAt(0); 
			if (choice =='d' ) {
				showAllCardsInHand(player1);
				continue;
			}
			else if (choice == 'h') {
				player1.add(deckOfCards.dealOneCard().flip());
				printHand(player1);
			}
			else {
				break;
			}			
		}
		
		if (hasBusted(player1)) {
			System.out.println("Game over. Player 1 loses!");
		}
		else {
			//if the dealer has < 17 then they take a hit
			while (shouldHit(dealer) ) {
				dealer.add(deckOfCards.dealOneCard());
			}
			
			System.out.print("Game over.");
			int player1HighScore = getHandHighScore(player1);
			int dealerHighScore = getHandHighScore(dealer);
			if (player1HighScore> dealerHighScore) {
				System.out.println("You win!");
			}
			else {
				System.out.println("You lose!"); 
			}
		}
		
		System.out.println("Player1: ");
		showAllCardsInHand(player1);
		System.out.println("Dealer: ");
		showAllCardsInHand(dealer);
		
	}

	/**
	 * @param hand
	 * @return
	 */
	private static int getHandHighScore(List<Card> hand) {
		int highScore =getHandTotalCountAceAsOne(hand);
		if (getHandTotalCountAceAsEleven(hand) <=21)
			highScore = getHandTotalCountAceAsEleven(hand);
		return highScore;
	}
	
	public static boolean shouldHit(List<Card> hand) {
		
		//if the total is >= 17, don't hit
		if (getHandTotalCountAceAsOne(hand) >= 17 || getHandTotalCountAceAsEleven(hand) >=17)
		{
			return false;
		}
		return true;
	}
	
	public static void printHand(List<Card> hand) {
		for(Card c: hand) {
			System.out.println(c);
		}
	}
	
	
	public static boolean hasBusted(List<Card> hand) {
		return getHandTotalCountAceAsOne(hand) > 21;
		
	}

	/**
	 * @param hand
	 * @param handTotal
	 * @return
	 */
	private static int getHandTotalCountAceAsOne(List<Card> hand) {
		int handTotal = 0;
		for(Card c: hand) {
			handTotal += c.getNumericValue();
		}
		return handTotal;
	}
	
	private static int getHandTotalCountAceAsEleven(List<Card> hand) {
		int addForAce = 0;
		for(Card c: hand) {
			if (c.getValue().equals("A")) {
				addForAce = 10; 
			}
		}
		return getHandTotalCountAceAsOne(hand) + addForAce;
	}
	
	
	public static void showAllCardsInHand(List<Card> hand) {
		for(Card c: hand) {
			if (!c.isFaceUp()) {
				System.out.println(c.flip()); 
				c.flip(); 
			}
			else {
				System.out.println(c);
			
			}
		}
	}

	/**
	 * 
	 */
	private static void reviewPrimRefLoops() {
		int a = 1; 
		int b = 2;
		System.out.println("a is "+a+" b is "+b);
		swap(a,b);
		System.out.println("a is "+a+" b is "+b);
		
	
		int [] myArray = {1,2,3,4,5,5};
		printArray(myArray);
		printArrayWithForEach(myArray); 

		int [] newONe = swap(myArray); 
		printArray(myArray);
		printArray(newONe);
	}
	
	public static void swap(int x,int y) {
		int temp = x;
		x = y;
		y = temp;
	}

	//swap the first two items in an array
	public static int[] swap(int[] ar) {
		int [] newArray = new int [ar.length];
		for (int i=0; i<ar.length;i++) {
			newArray[i] = ar[i];		}
		
		int temp = newArray[0];
		newArray[0] = newArray[1] ;
		newArray[1] = temp;
		
		return newArray;
	}
	
	public static void printArray(int [] myAr) {
		for (int i=0; i<myAr.length;i++) {
			System.out.println("Element at index " + i + " is " + myAr[i]);
		}
	}
	
	public static void printArrayWithForEach(int [] myAr) {
		for (int item : myAr) {
			System.out.printf("%-5d",item);
		}
		System.out.println();
	}
}
