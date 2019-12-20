package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();

		/* Map is an interface and HashMap is a class that implements Map */
		Map<String,String>nameToZip = new HashMap<String,String>();//LinkedHashMap keeps stuff in order

		/* The "put" method is used to add elements to a Map */
		nameToZip.put("Katie","40142");
		nameToZip.put("David","44014");
		nameToZip.put("Ethan","40068");

		/* The "get" method is used to retrieve elements from a Map */
		String ethanZip = nameToZip.get("Ethan");
		System.out.println("Ethan lives in zip " +ethanZip);

		System.out.println("Ethan lives in zip " +nameToZip.get("Ethan"));
	
		/* keySet returns a Set of all of the keys in the Map */
		Set<String> keys = nameToZip.keySet(); 
		
		for (String name : keys) {
			System.out.println(name + " lives in the zip code " +nameToZip.get(name));
		}
		/* If the key already exists, put will overwrite the existing value with the new value */

		Map<Integer,String>seatToName = new HashMap<Integer,String>();


		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();
		Set<Integer> allSeatsTaken = seatNumberToName.keySet();
		Set<Integer> seatsTaken =new HashSet<Integer>();
		seatsTaken.add(0);
		//loop through seatNumberToName and add all the seats since if theres a name it's taken
		System.out.println("Printing all the values in seatsTaken");
		for (Integer seatNum : seatsTaken) {
			System.out.print(seatNum + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
		System.out.println();
		System.out.println("####################");
		System.out.println("Sets cannot contain duplicates");
		System.out.println("####################");
		System.out.println();


		System.out.println("####################");
		System.out.println("Sets do not guarantee ordering");
		System.out.println("####################");
		System.out.println();



	}

}
