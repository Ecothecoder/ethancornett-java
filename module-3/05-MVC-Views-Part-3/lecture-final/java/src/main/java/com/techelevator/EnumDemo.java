package com.techelevator;

public class EnumDemo {
	
	
	public enum Season {SPRING, SUMMER, FALL, WINTER}
	
	public enum PhoneType {
		ANDROID("Google"), IPHONE("Apple");
		
		private String maker;
		
		private PhoneType(String maker) {
			this.maker = maker;
		}
		
		public String getMaker() {
			return maker;
		}		
	}
	
	public static void main(String[] args) {
		
		Season s;
		
		
		s = Season.FALL;
		
		if (s == Season.SUMMER) {
			System.out.println("It's summertime!");
		} else if (s == Season.FALL) {
			System.out.println("The leaves are falling.");
		}
		
		PhoneType pt;
		
		pt = PhoneType.IPHONE;
		
		
		System.out.println(pt.getMaker());
		
		System.out.println(Season.FALL);
	}

}
