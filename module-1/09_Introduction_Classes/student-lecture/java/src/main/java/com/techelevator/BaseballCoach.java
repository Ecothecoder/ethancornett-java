package com.techelevator; 
import java.util.Scanner;

//this is the same code as the command line exercise to start
public class BaseballCoach {

	public static void main(String[] args) {		
		
		//prompt for number of players
		System.out.println("How many players are on the team?");
		Scanner input = new Scanner(System.in);
		
		String userInput = input.nextLine();
		int numPlayers = Integer.parseInt(userInput);
		
		String[]playerNames = new String [numPlayers];
		double[]battingAverage = new double[numPlayers];
		
		int indexOfHighestBattingAverage =0;		
			
		//for each player ask for name, number of times at bat, and number of hits
		for (int i=0; i<numPlayers;i++) {
			System.out.print("Enter player name: ");
			playerNames[i] = input.next();
					
			System.out.print("\nEnter times at bat: ");
			int timesAtBat= input.nextInt();
			
			System.out.print("\nEnter number of hits: ");
			int numHits= input.nextInt();
			
			battingAverage[i] = numHits/ (double)timesAtBat;
			System.out.println();
			
			if (battingAverage[i]>battingAverage[indexOfHighestBattingAverage]) {
				indexOfHighestBattingAverage = i;
			}
		}
		
		
		//display name and batting average for every player
		for (int i = 0; i< numPlayers; i++) {
			System.out.print(playerNames[i]+ " ");
			System.out.printf( "%.3f",battingAverage[i]);
			System.out.println();
		}
		
		//print player name and average for player with highest batting average	   
		System.out.printf("highest: %s %.3f ",playerNames[indexOfHighestBattingAverage], battingAverage[indexOfHighestBattingAverage]);

	}

}
