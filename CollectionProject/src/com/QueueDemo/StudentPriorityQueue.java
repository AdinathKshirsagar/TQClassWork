package com.QueueDemo;

import java.util.PriorityQueue;

public class StudentPriorityQueue {

	public static void main(String[] args) {
		
	MarksComparator comp= new MarksComparator();

      PriorityQueue<Student> pqs= new PriorityQueue<>(comp);
      
      pqs.add(new Student(101, "Shuruti", 23, 89f));
      pqs.add(new Student(102,"Sagar",22, 78f));
      pqs.add(new Student(103, "Bhushan",24, 98f));
      pqs.add(new Student(104,"Pritish",26, 94f));
      
      for(Student s:pqs)
      {
    	  System.out.println(s);
      }

	}

}
