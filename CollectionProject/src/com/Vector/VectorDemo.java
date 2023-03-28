package com.Vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> names= new Vector<>(4);
		System.out.println(names.size());	// Number of element
		System.out.println(names.capacity());
		
		names.add("Adinath");
		names.add("Ram");
		names.add("Yogesh");
		names.add("Utkarsh");
		names.addElement("Rahul");
		
		System.out.println("_____________________________________");
		System.out.println(names.size());	
		System.out.println(names.capacity());
		
		System.out.println("_____________________________________");
		names.add("Omkar");
		System.out.println(names.size());	// Number of element
		System.out.println(names.capacity());	// Increments by 100%
		
		// Specific position element [legacy method]
		
		System.out.println(names.elementAt(4));	// Specific position element [legacy method]
		System.out.println(names.get(4));	// Specific position element
		
		// value
		System.out.println(names);
		System.out.println("Old Element at 3 "+names.set(3, "Prem"));	// return old element
		names.setElementAt("Harshal", 3);
		System.out.println(names);
		
		System.out.println(names.removeElement("Omkar"));	// boolean
		System.out.println(names.remove("Ram"));		// boolean
		
		
		
	}

}
