package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Lecture {

	public static void main(String[] args) {
		
		
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		//TO Do add an array to the List
		
		String [] myArrayOfNames = {"Rob","Alex","Jay"};
		List<String> names = new ArrayList<String>(); 
		System.out.println("Before adding any names, the size of the list is "+names.size()); 
		names.add("Erica"); 
		names.add("Dean"); 
		names.add("Evan"); 
		names.add("Gavin"); 
		

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i)); 
			
			//if accessing array items 
			//it would be myArrayOfNames[i]; 
		}
		

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		names.add("Erica");
		System.out.println("After adding Erica again");
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i)); 
			
			//if accessing array items 
			//it would be myArrayOfNames[i]; 
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		names.add(1, "Jay");
		System.out.println("After adding Jay at index 1");
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i)); 
			
			//if accessing array items 
			//it would be myArrayOfNames[i]; 
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		names.remove(5);//DONT DO THIS IN A LOOP

		System.out.println("After removing element at index 5");
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i)); 
			
			//if accessing array items 
			//it would be myArrayOfNames[i]; 
		}
		
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		boolean isInList = names.contains("Seth");
		System.out.println("Is Seth in the list? " + isInList);
		isInList = names.contains("Erica"); 
		System.out.println("Is Erica in the list? " + isInList);
		
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		String [] listToArray = names.toArray( new String[names.size()]); 

		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */
		
		//List<int> scores = new ArrayList<int>(); i want a list of integers!!!
		Integer employees = new Integer(25);
		Integer piecesOfCake = new Integer("24");
		
		if (employees > piecesOfCake) {
			System.out.println("Burn the building down"); 
		}
		
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(new Integer(90)); 
		Integer deansScore = new Integer(100); 
		scores.add(deansScore); 
		
		
		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		
		System.out.println("Print using for loop");
		for (int i=0; i<names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
		}
		
		System.out.println("Print using for each loop");
		//for every element that is in the list names, let's refer to it by "name"
		for(String nameOfStudentInFirstRow : names ) {
			System.out.println(nameOfStudentInFirstRow); 
			System.out.println(names.size()); 
		}
		
		//print the list of scores
		for(Integer element : scores) {
			System.out.println(element);	
		}

	
		
		//increment each score by 5 list of scores
		for(Integer element : scores) {
			element += 5; 	
			System.out.println("Element "+element);
		}

		System.out.println("Scores after: ");
		//print the list of scores
		for(Integer element : scores) {
			System.out.println(element);	
		}

		
		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();
		
		//add items
		Queue<String> priorities = new LinkedList<String>(); 
		priorities.offer("Clean the dishes"); 
		priorities.offer("Wash the counters");
		priorities.offer("Sweep the floor");
		priorities.offer("Clean the whiteboard"); 

		/////////////////////
		// PROCESSING ITEMS IN A QUEUE - FIFO
		/////////////////////
		

		while (priorities.size()>0) {
			//String peek = priorities.peek() ; //look at it but not remove
			String nextPriority = priorities.poll(); 
			System.out.println("Next priority: " + nextPriority);
			
		}
		
		System.out.println("priorities size is " + priorities.size());

		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();

		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////
		Stack<String> browserStack = new Stack<String>(); 
		browserStack.push("www.google.com");
		browserStack.push("www.cnn.com"); 
		browserStack.push("www.techelevator.com");
		browserStack.push("www.larosas.com");

		////////////////////
		// POPPING THE STACK
		////////////////////
		while (browserStack.size()>0) {
			String previousPage = browserStack.pop();
			System.out.println("Previous page: " + previousPage); 
		}

	}
}
