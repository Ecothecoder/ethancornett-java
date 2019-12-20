package com.techelevator;

import org.junit.After;  // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test;   // The @Test annotation is used to label methods that should be run as tests

public class BuyoutAuctionTest {
	//test the buyout price gets set
	@Test
	public void test_set_buyout_price() {
		BuyoutAuction theAuction = new BuyoutAuction("thing",200); 
		int buyoutPrice = theAuction.getBuyoutPrice();
		Assert.assertEquals(200, buyoutPrice);
	}
	
	//If a user places a bid over the buyout price, the auction ends and further bids are ignored
	@Test
	public void test_buyout_price_ends_auction() {

		BuyoutAuction theAuction = new BuyoutAuction("thing",200); 
		theAuction.placeBid(new Bid("Alex",1000));
		theAuction.placeBid(new Bid("Jay",215));
		theAuction.placeBid(new Bid("Katie",2000));
		Assert.assertEquals("Alex", theAuction.getHighBid().getBidder());		
		
	}
	
	@Test
	public void test_bids_greater_than_buyout_are_reduced_to_buyout() {

		BuyoutAuction theAuction = new BuyoutAuction("thing",200); 
		theAuction.placeBid(new Bid("Alex",1000));
		theAuction.placeBid(new Bid("Jay",215));
		theAuction.placeBid(new Bid("Katie",2000));
		Assert.assertEquals(200, theAuction.getHighBid().getBidAmount());		
		
	}
	
	
	//make sure high bidder wins if we don't hit the buyout price
	@Test
	public void test_high_bidder_wins_if_buyout_not_hit() {
		BuyoutAuction theAuction = new BuyoutAuction("thing",2000000); 
		theAuction.placeBid(new Bid("Alex",1000));
		theAuction.placeBid(new Bid("Jay",215));
		theAuction.placeBid(new Bid("Katie",2000));
		Assert.assertEquals("Katie", theAuction.getHighBid().getBidder());	
	}

}
