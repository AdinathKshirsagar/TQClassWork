package com.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CustomLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Student> hs = new LinkedHashSet<>();
		hs.add(new Student(101,"Adinath",47f));
		hs.add(new Student(102,"Rohit",57f));
		hs.add(new Student(103,"Sachin",77f));
		hs.add(new Student(103,"Sachin",77f));
		
		Iterator<Student> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		 
	}

}
