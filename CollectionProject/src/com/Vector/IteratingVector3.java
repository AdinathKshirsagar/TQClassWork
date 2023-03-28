package com.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratingVector3 {

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
		
		System.out.println("____________________________________________________");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
		{
			String s1 = itr.next();
			if(s1.equals("Jayesh"))
			{
				names.remove("Jayesh");	// Program will gives a ConcurrentModificationException
										// Because In iterator we can not done any modification.
			}
		}
		System.out.println(names);		
	}

}
