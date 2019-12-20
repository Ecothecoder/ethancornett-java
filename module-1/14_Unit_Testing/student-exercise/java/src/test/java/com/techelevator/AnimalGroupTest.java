package com.techelevator;

import org.junit.After; // The @After annotation is used to execute a method after every test
import org.junit.Assert; // The Assert class has static assertion methods for validating test results
import org.junit.Before; // The @Before annotation is used to execute a method before every test
import org.junit.Test; // The @Test annotation is used to label methods that should be run as tests

public class AnimalGroupTest {

	private AnimalGroupName AnimalGroupTest;

	@Test
	public void theAnimalReturnsTheCorrectGroupName() {
		AnimalGroupName testName = new AnimalGroupName();
		String attempt = testName.getHerd("Elephant");
		String attempt2 = testName.getHerd("RHINO");
		String attempt3 = testName.getHerd("giraffe");
		String attempt4 = testName.getHerd("crow");
		String attempt5 = testName.getHerd("lIoN");
		String attempt6 = testName.getHerd("PigeON");
		String attempt7 = testName.getHerd("flamingo");
		String attempt8 = testName.getHerd("dEEr");
		String attempt9 = testName.getHerd("DOG");
		String attempt10 = testName.getHerd("Crocodile");
		Assert.assertEquals("Herd", attempt);
		Assert.assertEquals("Tower", attempt3);
		Assert.assertEquals("Crash", attempt2);
		Assert.assertEquals("Herd", attempt5);
		Assert.assertEquals("Murder", attempt4);
		Assert.assertEquals("Kit", attempt6);
		Assert.assertEquals("Pat", attempt7);
		Assert.assertEquals("Herd", attempt8);
		Assert.assertEquals("Pack", attempt9);
		Assert.assertEquals("Float", attempt10);
	}

	@Test
	public void theAnimalReturnsUnknownGroupName() {
		AnimalGroupName testName = new AnimalGroupName();
		String attempt = testName.getHerd("BANANANANNANANANA");
		Assert.assertEquals("unknown", attempt);
	}

}