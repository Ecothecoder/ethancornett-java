package com.techelevator.farm;

public class BabyCow extends Cow{
	
	private int numHeads; 
	
	public BabyCow(int nh) {
		super("baby cow", calcSound(nh),50 );

		System.out.println("in Baby Cow constructor");
		numHeads = nh;
	}
	
	public static String calcSound(int times) {
		String sound = ""; 
		for(int i=0; i<times;i++) {
			sound+="moo";
		}
		return sound;
		 
	}

}
