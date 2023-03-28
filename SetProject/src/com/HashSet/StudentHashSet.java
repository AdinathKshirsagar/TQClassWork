package com.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StudentHashSet {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student(101,"Adinath",47f));
		hs.add(new Student(102,"Rohit",57f));
		hs.add(new Student(103,"Sachin",77f));
		// hs.add(new Student(103,"Sachin",77f));	
		
		// Override equals and hashcode	
		
		for(Student s : hs)
		{
			System.out.println(s);
		}
		
		System.out.println("_________________________________________________________");
		
		Iterator<Student> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
