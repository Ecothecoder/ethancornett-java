package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CigarPartyTest {
	private CigarParty cigars;

	@Before
	public void setUp() {
		cigars = new CigarParty();
	}

	@Test
	public void makeSureWeCanParty() {
		boolean canParty = cigars.haveParty(40, true);
		boolean canParty2 = cigars.haveParty(34, true);
		boolean canParty4 = cigars.haveParty(23, false);
		boolean canParty3 = cigars.haveParty(98, true);
		Assert.assertEquals(true, canParty);
		Assert.assertEquals(false, canParty2);
		Assert.assertEquals(false, canParty4);
		Assert.assertEquals(true, canParty3);
	}

}
