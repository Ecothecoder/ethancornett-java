package com.techelevator; 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//this is the same code as the command line exercise to start
public class BaseballCoach {

	public static void main(String[] args) {		
		
		//prompt for number of players
		System.out.println("How many players are on the team?");
		Scanner input = new Scanner(System.in);
		
		String userInput = input.nextLine();
		int numPlayers = Integer.parseInt(userInput);
		
		//create list to hold the baseball players
		List<BaseballPlayer> players = new ArrayList<BaseballPlayer>(); 

		BaseballPlayer playerWithBestAverage = null;
					
		//for each player ask for name, number of times at bat, and number of hits
		for (int i=0; i<numPlayers;i++) {
			System.out.print("Enter player first name: ");
			String playerFirstName = input.next();
			
			System.out.print("Enter player last name: ");
			String playerLastName = input.next();
								
			BaseballPlayer player = new BaseballPlayer(playerFirstName,playerLastName); 
							
			System.out.print("\nEnter times at bat: ");
			int timesAtBat= input.nextInt();			
			player.setTimesAtBat(timesAtBat);
			
			boolean validHits = false;
			while(!validHits) {
				System.out.print("\nEnter number of hits: ");
				int numHits= input.nextInt();
			    validHits = player.setNumHits(numHits);
			}
			
			players.add(player); 
			
			if (i==0) {//the first player entered is automatically the highest
				playerWithBestAverage = player; 
			}
			else {
				if (player.getBattingAverage() > playerWithBestAverage.getBattingAverage()) {
					playerWithBestAverage = player; 
				}
			}

		}
		
		
		//display name and batting average for every player
		for(BaseballPlayer playa : players) {
			System.out.println(playa.toString());
			System.out.print(playa.getFullName() +"  "); 
			System.out.printf( "%.3f",playa.getBattingAverage());
			System.out.println();
		}	
		

		//print player name and average for player with highest batting average	   
		System.out.printf("highest: %s %.3f ",playerWithBestAverage.getFullName(), playerWithBestAverage.getBattingAverage());

	}

}
