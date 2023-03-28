package com.Vector;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector<String> names= new Vector<>(4,2);
		System.out.println(names.size());	// Number of element
		System.out.println(names.capacity());
		
		names.add("Adinath");
		names.addElement("Jayesh");	// Legacy Method
		names.add("Ram");
		names.add("Yogesh");
		names.add("Utkarsh");
		
		System.out.println(names);
		System.out.println("_____________________________________");
		System.out.println(names.size());	
		System.out.println(names.capacity());
		
		System.out.println("_____________________________________");
		names.add("Omkar");
		System.out.println(names.size());	// Number of element
		System.out.println(names.capacity());	// Increments by 2
		
		// Specific position Element
		
		System.out.println(names.get(3));
		System.out.println(names.elementAt(5));	// Legacy Method
		
		System.out.println("__________________________________________");
		// set at a specific index
		
		System.out.println("Old Element at 2 "+names.set(2, "Rocky"));	// return old element
		names.setElementAt("Madhav", 4);	// Legacy Method
		System.out.println(names);
		
		System.out.println(names.removeElement("Rocky"));	// Legacy Method [ boolean ]
		System.out.println(names);
		
		
	}

}
