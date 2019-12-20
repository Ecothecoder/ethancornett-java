package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {
	@Test
	public void isThereAThreeAndAOne() {
		Lucky13 testTheLuck = new Lucky13();
		int[] check = new int[] { 1, 3, 4 };
		int[] check2 = new int[] { 1, 3, 0 };
		int[] check3 = new int[] { 6, 5, 4 };
		int[] check4 = new int[] { 7, 3, 4 };
		int[] check5 = new int[] { 1, 5, 4 };
		Assert.assertEquals(false, testTheLuck.getLucky(check));
		Assert.assertEquals(false, testTheLuck.getLucky(check2));
		Assert.assertEquals(true, testTheLuck.getLucky(check3));
		Assert.assertEquals(false, testTheLuck.getLucky(check4));
		Assert.assertEquals(false, testTheLuck.getLucky(check5));
	}
}