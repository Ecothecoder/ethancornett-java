package com.techelevator;

import org.junit.Test;

import junit.framework.Assert;

public class Less20Test {

	@Test
	public void isNumberCloseToTwenty() {
		Less20 testLess = new Less20();
		int num = 1;
		int num1 = 18;
		int num2 = 22;
		int num3 = 39;
		int num4 = 32456789;
		int num5 = 20;
		int num6 = -32;
		Assert.assertEquals(false, testLess.isLessThanMultipleOf20(num));
		Assert.assertEquals(true, testLess.isLessThanMultipleOf20(num1));
		Assert.assertEquals(false, testLess.isLessThanMultipleOf20(num2));
		Assert.assertEquals(true, testLess.isLessThanMultipleOf20(num3));
		Assert.assertEquals(false, testLess.isLessThanMultipleOf20(num4));
		Assert.assertEquals(false, testLess.isLessThanMultipleOf20(num5));
		Assert.assertEquals(false, testLess.isLessThanMultipleOf20(num6));

	}

}

/*
 * Return true if the given non-negative number is 1 or 2 less than a multiple
 * of 20. So for example 38 and 39 return true, but 40 returns false. (Hint:
 * Think "mod".) less20(18) → true less20(19) → true less20(20) → false
 */