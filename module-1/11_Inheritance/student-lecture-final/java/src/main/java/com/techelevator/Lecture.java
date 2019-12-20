package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		//Auction sellTheRollzAuction = new BuyoutAuction("Jay's Rolls Royce",42255); 
		Auction sellTheRollzAuction = new ReserveAuction("Jays Rolls Royce",30000);
					
		/*POLYMORPHISM*/
		List<Auction> myEstateSale = new ArrayList<Auction>(); 
		myEstateSale.add(sellTheRollzAuction);
		myEstateSale.add(new BuyoutAuction("lamp",300)); 
		
		Scanner input = new Scanner(System.in); 
		
		for (Auction sale : myEstateSale) {
			runTheAuction(sale, input);
		}
		
		BigDecimal a = new BigDecimal(34.5);
		BigDecimal b = new BigDecimal(25.5); 
		b  = b.add(a); 

	}

	/**
	 * @param theAuction
	 * @param input
	 */
	private static void runTheAuction(Auction theAuction, Scanner input) {
		System.out.println("Place bid on "+theAuction.getItemForSale());
		boolean keepBidding = true;			
		
		while (keepBidding  &&  !theAuction.isAuctionOver()) {
			Bid b = getBid(input);			
			theAuction.placeBid(b); 
			System.out.println("Keep bidding? Enter y to continue or anything else to exit");
			String strKeepGoing = input.nextLine(); //use nextLine -> Eclipse was readign the new 
			keepBidding = strKeepGoing.toLowerCase().charAt(0)=='y'; 
			
			/* NOT POLYMORPHISM
			if (sellTheRollzAuction instanceof BuyoutAuction) {
				buyoutNotExistOrNotMet = ((BuyoutAuction)sellTheRollzAuction).hasMetBuyout();
			}
			*/
		}
		
		printAllBids(theAuction);
		
		System.out.println("High bid for " + theAuction.getItemForSale()+" is "+theAuction.getHighBid());
	}

	/**
	 * @param input
	 * @return
	 */
	private static Bid getBid(Scanner input) {
		System.out.println("Enter your name: ");
		String name = input.nextLine(); 
		System.out.println("Enter your bid (in dollars): ");
		String strBid = input.nextLine(); 
		int bid = Integer.parseInt(strBid);
		Bid b = new Bid( name,bid);
		return b;
		//input.
	}

	/**
	 * @param myAuction
	 */
	private static void printAllBids(Auction myAuction) {
		System.out.println("Bids for "+myAuction.getItemForSale()); 
		//print the list of bids for the auction
		for (Bid theBid : myAuction.getAllBids()) {
			System.out.println(theBid.toString());
		}
	}

}
