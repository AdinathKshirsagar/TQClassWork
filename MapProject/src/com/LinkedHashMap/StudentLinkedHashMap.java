package com.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.HashMap1.Student;

public class StudentLinkedHashMap {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Bhushan",89.5f);
		Student s2 = new Student(102,"Ajay",98.4f);
		Student s3 =new Student(103,"Sagar",78.4f);
		Student s4 =new Student(104,"Ratan",72f);
		Student s5 =new Student(105,"Vivek",96f);
		
		LinkedHashMap<Student, String> lmap= new LinkedHashMap<>(30,0.75f,true);
		lmap.put(s1, "CS");
		lmap.put(s2, "IT");
		lmap.put(s3, "CS");
		lmap.put(s4, "IT");
		lmap.put(s5, "CS");
		
		Set<Entry<Student,String>> entrySet = lmap.entrySet();
		Iterator<Entry<Student, String>> itr= entrySet.iterator();
		while(itr.hasNext())
		{
			Entry<Student, String> en= itr.next();
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		System.out.println("=====================================");
		
		String course= lmap.get(s3);
		System.out.println(s3);
		System.out.println(course);
		System.out.println("=====================================");
		
		Set<Entry<Student,String>> entry = lmap.entrySet();
		Iterator<Entry<Student, String>> itr1= entry.iterator();
		while(itr1.hasNext())
		{
			Entry<Student, String> en= itr1.next();
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
	}

}
