package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {
	@Test
	public void returnEveryOtherCharacter() {
		StringBits testTheBits = new StringBits();

		String test = testTheBits.getBits("Hello");
		String test2 = testTheBits.getBits("Animal");
		String test3 = testTheBits.getBits("Crossing");
		String test4 = testTheBits.getBits("is");
		String test5 = testTheBits.getBits("My");
		String test6 = testTheBits.getBits("Favorite");
		String test7 = testTheBits.getBits("Game");

		Assert.assertEquals("Hlo", test);
		Assert.assertEquals("Aia", test2);
		Assert.assertEquals("Cosn", test3);
		Assert.assertEquals("i", test4);
		Assert.assertEquals("M", test5);
		Assert.assertEquals("Fvrt", test6);
		Assert.assertEquals("Gm", test7);

	}

}