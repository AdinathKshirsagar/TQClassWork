package com.HashMapLogical;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHashMap {
	
	public static void searchStudent(HashMap<Student, String> map)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student to Search : ");
		String name= sc.next();
		Student s = null;
		String course= null;
		for(Map.Entry<Student,String> en : map.entrySet())
		{
			s =en.getKey();
			if(s.getName().equals(name))
			{
				course = en.getValue();
			}
		}
		if(course!=null)
		{
			System.out.println(name+" has applied for "+ course);
		}
		else
		{
			System.out.println(" No record found ");
		}
		
	}
	public static void main(String[] args) {
		HashMap<Student, String> map= new HashMap<>();
		
		map.put(new Student(1,"Rohit",23), "B.Tech");
		map.put(new Student (2,"Sagar",22), "MBA");
		map.put(new Student (3,"Vivek",21), "BCA");
		map.put(new Student(4,"Adinath",23), "B.Tech");
		map.put(new Student (5,"Suyoug",22), "MBA");
		map.put(new Student (6,"Ratan",21), "BCA");
		
		searchStudent(map);
		
	}

}
