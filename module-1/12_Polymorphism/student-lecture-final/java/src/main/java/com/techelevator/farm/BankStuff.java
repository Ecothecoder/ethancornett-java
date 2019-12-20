package com.techelevator.farm;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankStuff {
	public BankStuff() {
	    
    }

	private BigDecimal moneyBalance = new BigDecimal(0.0);
	private BigDecimal returnChange = new BigDecimal(0.0);
	private BigDecimal itemCost = new BigDecimal(0.0);
	private BigDecimal refundAmount = new BigDecimal(0.0);
	private BigDecimal amountToDeposit = new BigDecimal(0.0);



	public BigDecimal amountToDeposit(BigDecimal deposit) {
	    amountToDeposit.add(moneyBalance);
	    return moneyBalance;
	}

	public void changeBalance(BigDecimal returnChange) {
	    moneyBalance.subtract(itemCost);
	    System.out.print("Your balance is " + moneyBalance);
	    boolean exit = false;
	    String choice = "";
	    Scanner userInput = new Scanner(System.in);
	    while (!exit) {
	        if (choice.contentEquals("balance")) {
	            System.out.println("How much would you like to deposit (in dollar amounts?");
	            BigDecimal deposit = new BigDecimal(userInput.nextDouble());
	            amountToDeposit(deposit);
	            
	        } else if (choice.contentEquals("refund")) {
	            System.out.println("Money refunded. Balance equals 0.00.");
	            moneyBalance.subtract(moneyBalance);
	            
	        } else if (choice.contentEquals("Purchase")) {
	            if (itemCost.compareTo(moneyBalance)==1) {
	                System.out.println("Please deposit more money.");
	            } else {
	                System.out.println("Vending");
	                moneyBalance.subtract(itemCost);
	                
	            }
	        }
	        
	        }
	    

	    
	}
	    


	}

