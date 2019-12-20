package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class LectureEthan {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		
		List<String> names =new ArrayList<String>();
		//names.size(); == how big list is
		names.add("Erica");
		names.add("Dean");
		names.add("Evan");
		
		
		
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
//names.get(i) pulls the name one at a time as installed or finds the name at that number
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		names.add("Erica"); //duplicates are fine, for now.
		names.add("Dean");
		names.add("Evan");	
		names.add("Erica");
		names.add("Dean");
		names.add("Evan");	
		names.add("Erica");
		names.add("Dean");
		names.add("Evan");
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		names.add(1,"Jay");
		//puts Jay after Erica

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		
		names.remove(5);//removes Erica DON'T REMOVE ITEMS INSIDE A LOOP

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		boolean isInList = names.contains("Seth"); //False, isInList is the variable name

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		String [] listToArray = names.toArray(new String[names.size()]);

		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */
		
		//List<int> scores =new ArrayList<int>(); this is a list of integers, not good
		Integer employees =new Integer(25);
		Integer piecesOfCake =new Integer ("24");
		
		if (employees > piecesOfCake) {
			System.out.println("Burn the building down.");
		}
		
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(new Integer(90));
		Integer deanScore = new Integer(100);
		scores.add(deanScore);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		
		//forEach Loops
		for (int i=0;i<names.size();i++) {
			String n = names.get(i);
			System.out.println(n);
		}

		System.out.println();
		//for every element that is in the list Names, refer to it by "name"
		for(String name : names) {
			System.out.println(name.toUpperCase());
		}

		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();

		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////
		//Queue, first in is first out. "Next in line"
		Queue<String> priorities=new LinkedList<String>();
		priorities.offer("Clean the dishes");
		priorities.offer("Wash the counters");
		priorities.offer("Sweep the floor");
		priorities.offer("Clean the whiteboard");
		
		while (priorities.size() >0) {
			String nextPriorities = priorities.poll();
			System.out.print("Next Priority: " + nextPriorities);
		}
		//priorities.peak() just looks .poll() pulls it out. can only notice the first person
		
		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();
//Last in First out
		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////
		Stack<String> browserStach = new Stack<String>();
		browserStach.push("www.google.com");
		browserStach.push("www.cnn.com");
		browserStach.push("www.techelevator");
		browserStach.push("www.larosas.com");

		////////////////////
		// POPPING THE STACK
		////////////////////
		while (browserStach.size()>0) {
			String previousPage = browserStach.pop();
			System.out.println("Previous Page was: " + previousPage);
		}
	}
}
