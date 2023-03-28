package com.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratingVector {

	public static void main(String[] args) {
		
		// Enumeration : hasMoreElement
					//	 nextElement
		// failSafe : allows modification while iteration
		
		Vector<String> names= new Vector<>();
		
		names.add("Adinath");
		names.add("Jayesh");
		names.add("Ram");
		names.add("Yogesh");
		names.add("Utkarsh");
		
		System.out.println(names);
		
		System.out.println("_______________________________________________");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("__________________________________________________");
		ListIterator<String> litr = names.listIterator(names.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		System.out.println("____________________________________________________");
		Enumeration<String> en = names.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
