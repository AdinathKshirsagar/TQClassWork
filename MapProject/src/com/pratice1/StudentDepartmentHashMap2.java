package com.pratice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentDepartmentHashMap2 {
	
	public static void createMap(ArrayList<Dept> al)
	{
		HashMap<String,ArrayList<Student>> map= new HashMap<>();
		for(Dept d:al)
		{
			String dname=d.getName();
			if(!map.containsKey(dname))
			{
				map.put(dname, d.getStud());
			}
		}
		
		for(Map.Entry<String, ArrayList<Student>> en:map.entrySet())
		{
              System.out.println(en.getKey());
              System.out.println("---------------");
              for(Student s:en.getValue())
              {
            	  System.out.println(s);
              }
               System.out.println("=============================================");

		}
		
		addStudent(map);
		
	}
	
	public static void addStudent(HashMap<String,ArrayList<Student>> map1)
	{
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(4,"Mohan"));
		list.add(new Student(5,"Yashank"));
		
		String d="CSE";
		 
		if(!map1.containsKey(d))
		{
			map1.put(d, list);
		}
		else
		{
			list.addAll(map1.get(d));
			map1.put(d, list);
		}
			
		
		
		for(Map.Entry<String, ArrayList<Student>> en:map1.entrySet())
		{
              System.out.println(en.getKey());
              System.out.println("---------------");
              for(Student s:en.getValue())
              {
            	  System.out.println(s);
              }
               System.out.println("=============================================");

		}
		
	}

	public static void main(String[] args) {

		ArrayList<Student> list1= new ArrayList<>();
		list1.add(new Student(1,"Sagar"));
		list1.add(new Student(2,"Rohit"));
		list1.add(new Student(3,"Vivek"));
		list1.add(new Student(4,"Gaurav"));
			
		
		ArrayList<Student> list2= new ArrayList<>();
		list2.add(new Student(1,"Priya"));
		list2.add(new Student(2,"Vaishnavi"));
		list2.add(new Student(3,"Rupali"));
		list2.add(new Student(4,"Shuruti"));
		
		ArrayList<Student> list3= new ArrayList<>();
		list3.add(new Student(1,"Tejas"));
		list3.add(new Student(2,"Pritish"));
		list3.add(new Student(3,"Bhushan"));
		list3.add(new Student(4,"Suyog"));
		
		
	    ArrayList<Dept> d1= new ArrayList<>();
	  
	    d1.add(new Dept(101,"CSE",list1));
	    d1.add(new Dept(102,"IT",list2));
	    d1.add(new Dept(103,"ECE",list3));
	    
	  
		createMap(d1);
		
		
     
	}

}

