package com.techelevator;

import org.junit.Test;

import junit.framework.Assert;

public class FrontTimesTest {
	@Test
	public void makeSureTheStringIsRepeating() {
		FrontTimes testMe = new FrontTimes();
		String repeat = testMe.generateString("Chocolate", 3);
		String repeat2 = testMe.generateString("Ethan", 4);
		String repeat3 = testMe.generateString("Zombie", 1);
		String repeat4 = testMe.generateString("Ca", 2);
		String repeat5 = testMe.generateString("AllIwantforChristmasisyou", 3);
		Assert.assertEquals("ChoChoCho", repeat);
		Assert.assertEquals("EthEthEthEth", repeat2);
		Assert.assertEquals("Zom", repeat3);
		Assert.assertEquals("CaCa", repeat4);
		Assert.assertEquals("AllAllAll", repeat5);
	}
}