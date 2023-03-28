package com.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("Java");
		llist.add("Python");
		llist.add("Html");
		
		System.out.println(llist);
		
		System.out.println("____________________add and offer___________________________");
		// add and offer
		llist.addFirst("C++"); 	// addFirst
		System.out.println(llist);	
		llist.add("JavaScript"); // add at the last
		System.out.println(llist);
		
		System.out.println(llist.offerFirst("Angular"));	// Boolean true
		System.out.println(llist);		// add at the first
		
		System.out.println("____________________remove and poll___________________________");
		// remove and poll
		System.out.println( llist.remove());// remove and retrieve first element : NoSuchElement Exception
		System.out.println(llist);
		System.out.println(llist.poll()); // remove and retrieve first element : Null if empty
		System.out.println(llist);	 
		
		//"__________________________________________________________________________________"
		
		LinkedList< String> lang = new LinkedList<>();
		System.out.println(lang.poll());	// Null if empty list
		//System.out.println(lang.remove());	// NoSuchElement Exception if empty list
		
		System.out.println("_____________________get and pick__________________________");
		// get and pick
		
		//System.out.println(lang.get(0));	// IndexOutOfBoundsException
		//System.out.println(lang.getFirst());	// IndexOutOfBoundsException
		
		System.out.println(lang.peek());	// Null 
		System.out.println(lang.peekFirst());	// Null
		
		System.out.println("__________________element_____________________________");
		System.out.println(llist.element());	// gives the first element of list
		//System.out.println(lang.element());		// NoSuchElement Exception
		
		System.out.println("________________________stack Interface_______________________");
		// push and pop
		
		llist.push("Devops");	// return void
		System.out.println(llist);	// add the element at first
		llist.pop();
		System.out.println(llist);	// remove the element at first
	}

}
