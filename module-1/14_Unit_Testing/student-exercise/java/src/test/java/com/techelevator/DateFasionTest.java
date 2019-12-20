package com.techelevator;

import org.junit.Test;

import junit.framework.Assert;

public class DateFasionTest {

	@Test
	public void areYouGoingToGetATable() {

		DateFashion testOfFasion = new DateFashion();
		int tryIt = testOfFasion.getATable(2, 6);
		int tryIt2 = testOfFasion.getATable(6, 6);
		int tryIt3 = testOfFasion.getATable(1, 1);
		int tryIt4 = testOfFasion.getATable(10, 4);
		int tryIt5 = testOfFasion.getATable(10, 10);
		Assert.assertEquals(0, tryIt);
		Assert.assertEquals(1, tryIt2);
		Assert.assertEquals(0, tryIt3);
		Assert.assertEquals(2, tryIt4);
		Assert.assertEquals(2, tryIt5);
	}

}