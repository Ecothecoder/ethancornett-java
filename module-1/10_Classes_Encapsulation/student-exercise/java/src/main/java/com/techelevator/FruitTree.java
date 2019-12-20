package com.techelevator;

public class FruitTree {
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit=typeOfFruit;
		piecesOfFruitLeft = startingPiecesOfFruit;
	}
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	
	public int  getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	public boolean pickFruit (int piecesMoving) {
		if (getPiecesOfFruitLeft()>=piecesMoving) {
			piecesOfFruitLeft -=piecesMoving;
			return true;
			}
		return false;
	}

}
