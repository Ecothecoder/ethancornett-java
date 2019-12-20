package com.techelevator;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();

		/* Map is an interface and HashMap is a class that implements Map */
		//Map<String,String> nameToZip = new HashMap<String,String>();		

		//if i want to have a implementation of Map that retains the order
		Map<String,String> nameToZip = new LinkedHashMap<String,String>();

		/* The "put" method is used to add elements to a Map */
		nameToZip.put("Katie", "40142");
		nameToZip.put("David", "44014");
		nameToZip.put("Freddy Kruger", "12345"); 
		
		/* The "get" method is used to retrieve elements from a Map */
		String katiesZip = nameToZip.get("Katie"); 
		System.out.println("Katie lives in zip " + katiesZip);
		System.out.println("David lives in zip " + nameToZip.get("David"));
	
		/* keySet returns a Set of all of the keys in the Map */
		Set<String> keys = nameToZip.keySet();  //returns a set of all the keys in the map
		//Collection<String> values = nameToZip.values(); we probably don't want to do this
		
		System.out.println("Iterating over everything");
		//iterate over everything
		for (String name : keys) {
			System.out.println(name + " lives in zip " + nameToZip.get(name));
		}
		
		/* If the key already exists, put will overwrite the existing value with the new value */
		nameToZip.put("David","12345"); 
		System.out.println("Put david at 12345");
		//iterate over everything
		for (String name : keys) {
			System.out.println(name + " lives in zip " + nameToZip.get(name));
		}
		
		System.out.println();		
		nameToZip.remove("David","44014");	//this does nothing because this key, value pair doesn't exist
		nameToZip.remove("David");
		System.out.println("Remove David");
		//iterate over everything
		for (String name : keys) {
			System.out.println(name + " lives in zip " + nameToZip.get(name));
		}
		
		
	    //your instructor is bad at remembering names, but she can see where you are sitting
		//she needs a way to get your name based on your seat number
		Map<Integer,String> seatNumberToName = new HashMap<Integer,String>();
		
		seatNumberToName.put(0,"Daniel Brown");
		seatNumberToName.put(1, "Tran Day");
		seatNumberToName.put(2,"Gavin");
		seatNumberToName.put(3, "Evan");
		
		//the person in seat 3 asked a question, who is it
		String questionAsker = seatNumberToName.get(3);
		System.out.println(questionAsker + "asked a question");
		
		//Set<Entry<Integer,String>> test = seatNumberToName.entrySet(); 

		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();
		
		//Set<Integer> seatsTaken = new HashSet<Integer>();
		Set<Integer> seatsTaken = new LinkedHashSet<Integer>();
		
		seatsTaken.add(0);		
		//loop through seatNumberToName and add all the seats since if there's a name it's taken
		
		Set<Integer> allSeatsTaken = seatNumberToName.keySet();  //returns a set of all the keys in the map
		for(Integer seatNum : allSeatsTaken) {
			seatsTaken.add(seatNum);
		}


		System.out.println("####################");
		System.out.println("Sets cannot contain duplicates");
		System.out.println("####################");
		System.out.println();

		seatsTaken.add(1); 
		seatsTaken.add(14);
		seatsTaken.add(10);

		System.out.println("####################");
		System.out.println("Sets do not guarantee ordering");
		System.out.println("####################");
		System.out.println();
		
		//loop through all of the values
		System.out.println("Printing all the values in seatsTaken");
		for (Integer seatNum : seatsTaken) {
			System.out.println(seatNum + " ");
		}
		
		System.out.println("####################");
		System.out.println("       Big O");
		System.out.println("####################");
		System.out.println();
		
		
		//is the last element of an array even
		int [] myArray = {1,3,6,3,9};
		boolean isLastElementEven =  myArray[myArray.length-1] %2 ==0; 
		
		//does myArray contain the number 10?
		boolean doesMyArrayContain10 = false; 
		for(int i=0; i<myArray.length; i++) {
			if (myArray[i] == 10) {
				doesMyArrayContain10 = true;
				break;
			}
		}
		
		//are there duplicate values in myArray
		boolean dupsExist = false;
		for(int i =0; i<myArray.length; i++) {
			for (int j=0; j<myArray.length; j++) {
				if(myArray[i]==myArray[j] && i!=j) {
					dupsExist = true; 
				}
			}
		}


	}

}
