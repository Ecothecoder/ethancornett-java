package com.techelevator.shoppingcart;

public class ShoppingCart {
public ShoppingCart() {
}
private int totalNumberOfItems;
private double totalAmountOwed;

//Total Number Of Items Getter/Setter
public int getTotalNumberOfItems(){
	return totalNumberOfItems;
}

	 
	 //Total Amount Owed Getter/Setter
public double getTotalAmountOwed(){
	return totalAmountOwed;
}
//Methods
public void empty() {
	totalAmountOwed = 0;
	totalNumberOfItems = 0;
}
public void addItems(int totalNumberOfItems, double number) {
	this.totalNumberOfItems = totalNumberOfItems;
	totalAmountOwed = (totalNumberOfItems * number);
}
public double getAveragePricePerItem() {
	if (totalNumberOfItems==0||totalAmountOwed==0)
		return 0;
	double aver=(totalAmountOwed/totalNumberOfItems);
	return aver;
}




}
