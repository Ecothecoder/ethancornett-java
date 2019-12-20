package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {

	@Test
	public void whichElementFirstOrLastIsBigger() {
		MaxEnd3 testMax = new MaxEnd3();
		int[] check = new int[] { 1, 3, 4 };
		int[] check2 = new int[] { 1, 3, 11 };
		int[] check3 = new int[] { 44, 5, 4 };
		int[] check4 = new int[] { 7, 3, 2 };
		int[] check5 = new int[] { 1, 5, 12 };
		int[] result = new int[] { 4, 4, 4 };
		int[] result2 = new int[] { 11, 11, 11 };
		int[] result3 = new int[] { 44, 44, 44 };
		int[] result4 = new int[] { 7, 7, 7 };
		int[] result5 = new int[] { 12, 12, 12 };

		Assert.assertArrayEquals(result, testMax.makeArray(check));
		Assert.assertArrayEquals(result2, testMax.makeArray(check2));
		Assert.assertArrayEquals(result3, testMax.makeArray(check3));
		Assert.assertArrayEquals(result4, testMax.makeArray(check4));
		Assert.assertArrayEquals(result5, testMax.makeArray(check5));

	}
	/*
	 * Given an array of ints length 3, figure out which is larger between the first
	 * and last elements in the array, and set all the other elements to be that
	 * value. Return the changed array. MakeArray([1, 2, 3]) → [3, 3, 3]
	 * MakeArray([11, 5, 9]) → [11, 11, 11] MakeArray([2, 11, 3]) → [3, 3, 3]
	 */
}
