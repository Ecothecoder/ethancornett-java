package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class RomanNumeralsTest {
	
	private RomanNumerals converter; 
	
	@Before
	public void setup() {
		converter = new RomanNumerals();
	}
	
	@Test
	public void test_convert_singe_digits() {
		String romanNumeral  = converter.convert(1);
		Assert.assertEquals("I", romanNumeral);
		romanNumeral  = converter.convert(2);
		Assert.assertEquals("II", romanNumeral);
		romanNumeral  = converter.convert(3);
		Assert.assertEquals("III", romanNumeral);
	}
	
	@Test
	public void test_convert_number_four() {
		String romanNumeral  = converter.convert(4);
		Assert.assertEquals("IV", romanNumeral);

	}
	
	@Test
	public void test_convert_number_five() {
		String romanNumeral  = converter.convert(5);
		Assert.assertEquals("V", romanNumeral);

	}
	
	@Test
	public void test_convert_number_six_thru_eight() {
		String romanNumeral  = converter.convert(6);
		Assert.assertEquals("VI", romanNumeral);
		romanNumeral  = converter.convert(7);
		Assert.assertEquals("VII", romanNumeral);
		romanNumeral  = converter.convert(8);
		Assert.assertEquals("VIII", romanNumeral);
	}
	@Test
	public void test_convert_nine() {
		String romanNumeral  = converter.convert(9);
		Assert.assertEquals("IX", romanNumeral);
	
	}
	
	@Test
	public void test_convert_ten() {
		String romanNumeral  = converter.convert(10);
		Assert.assertEquals("X", romanNumeral);
	
	}
	
	@Test
	public void test_convert_eleven_thru_thirteen() {
		String romanNumeral  = converter.convert(11);
		Assert.assertEquals("XI", romanNumeral);
		romanNumeral  = converter.convert(12);
		Assert.assertEquals("XII", romanNumeral);
		romanNumeral  = converter.convert(13);
		Assert.assertEquals("XIII", romanNumeral);
	
	}
	
	@Test
	public void test_convert_fourteen() {
		String romanNumeral  = converter.convert(14);
		Assert.assertEquals("XIV", romanNumeral);
	
	}
	
	@Test
	public void test_convert_fifteen() {
		String romanNumeral  = converter.convert(15);
		Assert.assertEquals("XV", romanNumeral);
	
	}
	
	@Test
	public void test_convert_sixteen_thru_nineteen() {
		String romanNumeral  = converter.convert(16);
		Assert.assertEquals("XVI", romanNumeral);
		romanNumeral  = converter.convert(17);
		Assert.assertEquals("XVII", romanNumeral);
		romanNumeral  = converter.convert(18);
		Assert.assertEquals("XVIII", romanNumeral);
		romanNumeral  = converter.convert(19);
		Assert.assertEquals("XIX", romanNumeral);	
	}

	@Test
	public void test_convert_twenty() {
		String romanNumeral  = converter.convert(20);
		Assert.assertEquals("XX", romanNumeral);
	
	}
	
	@Test
	public void test_convert_twentyone_thru_thirty_nine() {
		String romanNumeral  = converter.convert(21);
		Assert.assertEquals("XXI", romanNumeral);
		romanNumeral  = converter.convert(24);
		Assert.assertEquals("XXIV", romanNumeral);
		romanNumeral  = converter.convert(25);
		Assert.assertEquals("XXV", romanNumeral);
		romanNumeral  = converter.convert(29);
		Assert.assertEquals("XXIX", romanNumeral);
		romanNumeral  = converter.convert(39);
		Assert.assertEquals("XXXIX", romanNumeral);	
	}
	
	@Test
	public void test_convert_forty() {
		String romanNumeral  = converter.convert(40);
		Assert.assertEquals("XL", romanNumeral);
	
	}
	
	@Test
	public void test_convert_forties() {
		String romanNumeral  = converter.convert(41);
		Assert.assertEquals("XLI", romanNumeral);
		romanNumeral  = converter.convert(44);
		Assert.assertEquals("XLIV", romanNumeral);
		romanNumeral  = converter.convert(46);
		Assert.assertEquals("XLVI", romanNumeral);
		romanNumeral  = converter.convert(49);
		Assert.assertEquals("XLIX", romanNumeral);
	
	}
	
	@Test
	public void test_convert_fifty() {
		String romanNumeral  = converter.convert(50);
		Assert.assertEquals("L", romanNumeral);
	
	}
	
	@Test
	public void test_convert_fifties() {
		String romanNumeral  = converter.convert(51);
		Assert.assertEquals("LI", romanNumeral);
		romanNumeral  = converter.convert(54);
		Assert.assertEquals("LIV", romanNumeral);
		romanNumeral  = converter.convert(56);
		Assert.assertEquals("LVI", romanNumeral);
		romanNumeral  = converter.convert(59);
		Assert.assertEquals("LIX", romanNumeral);	
	}
	
	@Test
	public void test_convert_sixties_thru_eighties() {
		String romanNumeral  = converter.convert(61);
		Assert.assertEquals("LXI", romanNumeral);
		romanNumeral  = converter.convert(74);
		Assert.assertEquals("LXXIV", romanNumeral);
		romanNumeral  = converter.convert(85);
		Assert.assertEquals("LXXXV", romanNumeral);
		romanNumeral  = converter.convert(89);
		Assert.assertEquals("LXXXIX", romanNumeral);	
	}
	
	@Test
	public void test_convert_ninety() {
		String romanNumeral  = converter.convert(90);
		Assert.assertEquals("XC", romanNumeral);	
	}

	@Test
	public void test_convert_ninties() {
		String romanNumeral  = converter.convert(91);
		Assert.assertEquals("XCI", romanNumeral);
		romanNumeral  = converter.convert(94);
		Assert.assertEquals("XCIV", romanNumeral);
		romanNumeral  = converter.convert(96);
		Assert.assertEquals("XCVI", romanNumeral);
		romanNumeral  = converter.convert(99);
		Assert.assertEquals("XCIX", romanNumeral);	
	}
	
	@Test
	public void test_convert_oneHundred() {
		String romanNumeral  = converter.convert(100);
		Assert.assertEquals("C", romanNumeral);	
	}
	

}
