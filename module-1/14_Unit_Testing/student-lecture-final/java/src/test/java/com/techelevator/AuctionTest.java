package com.techelevator;

import org.junit.Test;

import java.util.List;

import org.junit.After;  // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test;   // The @Test annotation is used to label methods that should be run as tests

public class AuctionTest {
	
	private Auction testAuction;
	
	@Before
	public void setup() {
		testAuction =  new Auction("thing");
	}
	
	//test getting the auction name
	@Test
	public void returns_item_for_sale() {
		Assert.assertEquals("thing", testAuction.getItemForSale());
	}
	
	//bidding zero is ignored
	@Test
	public void bid_zero_ignored() {
		testAuction.placeBid(new Bid("Dean",0));
		Assert.assertEquals("Bids of zero shouldn't count as the highest","", testAuction.getHighBid().getBidder());
		Assert.assertEquals("Bids of zero shouldn't be added to the list",0, testAuction.getAllBids().size());
	}

	
	@Test
	public void high_bid_starts_at_zero() {		
		int bidAmount = testAuction.getHighBid().getBidAmount();
		Assert.assertEquals(0, bidAmount);
	}
	
	@Test
	public void returns_all_bids() {
		//arrange
		testAuction.placeBid(new Bid("Paul",10));
		testAuction.placeBid(new Bid("Ethan",15));
		testAuction.placeBid(new Bid("Emma",5));
		
		//act
		List<Bid> bids= testAuction.getAllBids();
		
		//assert
		Assert.assertEquals("Paul", bids.get(0).getBidder());
		Assert.assertEquals(10, bids.get(0).getBidAmount());
		Assert.assertEquals("Ethan", bids.get(1).getBidder());
		Assert.assertEquals(15, bids.get(1).getBidAmount());
		Assert.assertEquals("Emma", bids.get(2).getBidder());
		Assert.assertEquals(5, bids.get(2).getBidAmount());
		
	}
	
	//our auction needs to return the highest bid correctly
	@Test
	public void return_the_highest_bid() {
		//arrange
		testAuction.placeBid(new Bid("Paul",10));
		testAuction.placeBid(new Bid("Ethan",15));
		testAuction.placeBid(new Bid("Emma",5));
		
		//act
		Bid highBid = testAuction.getHighBid();
		
		//assert
		Assert.assertEquals(15, highBid.getBidAmount());		
		
	}
	
	//if two people bid the same amount the first person should be he high bidder
	@Test
	public void first_high_bid_is_highest() {
		//arrange
		testAuction.placeBid(new Bid("Paul",10));
		testAuction.placeBid(new Bid("Ethan",5));
		testAuction.placeBid(new Bid("Emma",10));
		
		//act
		Bid highBid = testAuction.getHighBid();
		
		//assert
		Assert.assertEquals("Paul", highBid.getBidder());		
		
	}
	


}
