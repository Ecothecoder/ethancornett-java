package com.techelevator;

import org.junit.Test;

import org.junit.Assert;

public class NonStartTest {

	@Test
	public void cutOffTheFirstLetterOfString() {
		NonStart testStart = new NonStart();
		String test = testStart.getPartialString("", "There");
		String test2 = testStart.getPartialString("How", "");
		String test3 = testStart.getPartialString("Funny", "Business");
		String test4 = testStart.getPartialString("Party", "Truck");
		String test5 = testStart.getPartialString("Eat", "Shorts");
		String test6 = testStart.getPartialString("Animal", "Crossing");
		Assert.assertEquals("here", test);
		Assert.assertEquals("ow", test2);
		Assert.assertEquals("unnyusiness", test3);
		Assert.assertEquals("artyruck", test4);
		Assert.assertEquals("athorts", test5);
		Assert.assertEquals("nimalrossing", test6);

	}
}