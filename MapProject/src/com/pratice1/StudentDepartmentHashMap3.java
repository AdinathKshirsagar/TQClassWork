package com.pratice1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentDepartmentHashMap3 {
	
	public static void createMap(ArrayList<Dept> al)
	{
		HashMap<Integer,Dept> map= new HashMap<>();
		for(Dept d:al)
		{
			int did= d.getId();
			if(!map.containsKey(did))
			{
				map.put(did, d);
			}
		}
		
		for(Map.Entry<Integer, Dept> en:map.entrySet())
		{
              System.out.println("Department id:"+en.getKey());
              System.out.println("---------------");
              Dept d= en.getValue();
              System.out.println("Department Name: "+d.getName());
              for(Student s:d.getStud())
              {
            	  System.out.println(s);
              }
               System.out.println("=============================================");

		}
		
		addStudent(map);
		
		
	}
			
	public static void addStudent(HashMap<Integer,Dept> map1)
	{
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(4,"Mohan"));
		list.add(new Student(5,"Yashank"));
		
		int did=102;
		 
		if(!map1.containsKey(did))
		{
			//System.out.println("Department doesnot exist");
			Dept d =new Dept();
			d.setId(did);
			d.setName("ME");
			d.setStud(list);
			
			map1.put(did, d);
			
			
		}
		else
		{
			Dept d= map1.get(did);
			list.addAll(d.getStud());
			d.setStud(list);
			
			map1.put(did, d);
		}
			
		
		
		for(Map.Entry<Integer,Dept> en:map1.entrySet())
		{
			System.out.println("Department id:"+en.getKey());
            System.out.println("---------------");
            Dept d= en.getValue();
            System.out.println("Department Name: "+d.getName());
            for(Student s:d.getStud())
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
	    
	  //  list1.add(new Student(4,"Uday"));
	    //list1.add(new Student(5,"Sairaj"));
	    
	   // d1.add(new Dept(101,"CSE",list1));
	    /*
		for(Dept d:d1)
		{
			System.out.println(d.getId()+"   " + d.getName());
			for(Student s:d.getStud())
			{
				System.out.println(s);
			}
			
			System.out.println("=================================================");
		}
		*/
		createMap(d1);
		
		
     
	}

}
