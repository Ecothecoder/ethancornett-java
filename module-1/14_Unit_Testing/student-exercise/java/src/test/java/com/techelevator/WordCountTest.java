package com.techelevator;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {

	@Test
	public void returnEveryOtherCharacter() {
		WordCount testTheWords = new WordCount();
		Map<String, Integer> whereAmI = new HashMap<String, Integer>();
		whereAmI.put("ba", 2);
		whereAmI.put("black", 1);
		whereAmI.put("sheep", 1);

		Map<String, Integer> whereAreYou = new HashMap<String, Integer>();
		whereAreYou.put("a", 2);
		whereAreYou.put("b", 2);
		whereAreYou.put("c", 1);

		Map<String, Integer> whereIsHe = new HashMap<String, Integer>();

		String[] word = new String[] { "ba", "ba", "black", "sheep" };

		String[] word2 = new String[] { "a", "b", "a", "c", "b" };

		String[] word3 = new String[] {};

		Assert.assertEquals(whereAmI, testTheWords.getCount(word));
		Assert.assertEquals(whereAreYou, testTheWords.getCount(word2));
		Assert.assertEquals(whereIsHe, testTheWords.getCount(word3));
	}
}
