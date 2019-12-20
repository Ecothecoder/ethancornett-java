package com.techelevator;

import org.junit.After;  // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test;   // The @Test annotation is used to label methods that should be run as tests

public class ReserveAuctionTest {
	
	ReserveAuction theAuction;
	
	@Before
	public void setup() {
		theAuction = new ReserveAuction("thing",100);
	}
	
	//bid made below the reserve price is ignored
	@Test
	public void bid_made_below_the_reserve_price_is_ignored() {
		
		theAuction.placeBid(new Bid("Erica",50));
		
		//the high bid is still zero		
		Assert.assertEquals(0, theAuction.getHighBid().getBidAmount());
		//erica's bid is not in the list
		Assert.assertEquals("If no bids over the reserve, all bids is empty.",0,theAuction.getAllBids().size());
		
	}
	
	//bid bigger than the reserve counts
	@Test
	public void bid_bigger_than_the_reserve_counts() {
		theAuction.placeBid(new Bid("Erica",200));
		Assert.assertEquals(200, theAuction.getHighBid().getBidAmount());
		Assert.assertEquals("A bid higher than the reserve should be added to the list of bids",1, theAuction.getAllBids().size());
	}
	
	//bid equal to than the reserve counts
	@Test
	public void bid_equal_to_the_reserve_counts() {
		theAuction.placeBid(new Bid("Erica",100));
		Assert.assertEquals("If there's only one bid equal to the reserve, it should be the highest",100, theAuction.getHighBid().getBidAmount());
		Assert.assertEquals("A bid higher than the reserve should be added to the list of bids",1, theAuction.getAllBids().size());
	}
}
