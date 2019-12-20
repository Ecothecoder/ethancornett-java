package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

	@Test
	public void areTheFirstAndLastTheSame() {
		SameFirstLast testSFL = new SameFirstLast();
		int[] check = new int[] { 3, 3, 3 };
		int[] check2 = new int[] { 1, 3, 11 };
		int[] check3 = new int[] { 44, 5, 4 };
		int[] check4 = new int[] { 7, 3, 7 };
		int[] check5 = new int[] { 1, 5, 1 };

		Assert.assertEquals(true, testSFL.isItTheSame(check));
		Assert.assertEquals(false, testSFL.isItTheSame(check2));
		Assert.assertEquals(false, testSFL.isItTheSame(check3));
		Assert.assertEquals(true, testSFL.isItTheSame(check4));
		Assert.assertEquals(true, testSFL.isItTheSame(check5));

	}

}
/*
 * Given an array of ints, return true if the array is length 1 or more, and the
 * first element and the last element are equal. IsItTheSame([1, 2, 3]) →
 * false IsItTheSame([1, 2, 3, 1]) → true IsItTheSame([1, 2, 1]) → true
 */