package com.techelevator;

import org.junit.After;  // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test;   // The @Test annotation is used to label methods that should be run as tests

public class BidTest {
	
	//test bidder
	@Test
	public void getBidder_returns_name_correctly() {
		
		//arrange
		String nameToUse = "Katie";
		Bid b = new Bid(nameToUse,100);
		
		//act
		String name = b.getBidder();
		
		//assert
		Assert.assertEquals(nameToUse, name);
	}
	
	//test bid amount
	
	@Test
	public void getBidAmount_returns_amount_of_bid() {
		int testAmount = 250;
		Bid b = new Bid("Katie",testAmount);
		int bidAmount = b.getBidAmount();
		Assert.assertEquals(testAmount, bidAmount);
	}
	

}
