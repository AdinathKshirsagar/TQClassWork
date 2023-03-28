package com.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratingVector2 {

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
		Enumeration<String> en = names.elements();
		while(en.hasMoreElements())
		{
			String st = en.nextElement();
			if(st.equals("Jayesh"))
			{
				names.remove("Jayesh");
			}
		}
		System.out.println(names);
	}

}
