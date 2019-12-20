package com.techelevator.dog;

public class Dog {

public Dog () {
	
}

	private boolean isSleeping;
	
	public String makeSound () {
		if (isSleeping==false)
			return "Woof!";
		return "Zzzzz...";
	}
	public void wakeUp() {
		isSleeping = false;
	}
	public void sleep() {
		isSleeping = true;
	}
	public boolean isSleeping() {
		return isSleeping;
	}

}

