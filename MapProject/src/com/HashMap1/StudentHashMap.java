package com.HashMap1;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {

	public static void main(String[] args) {

		 HashMap<Student, String> smap= new HashMap<>();
	     
	     smap.put(new Student(101,"Bhushan",89f),"Java");
	     smap.put(new Student(102,"Ajay",98.4f), "Python");
	     smap.put(new Student(103,"Sagar",78.4f), "Java");
	     smap.put(new Student(104,"Ratan",72f), "Python");
	     smap.put(new Student(105,"Vivek",96f), "Java");
	     
	    for(Map.Entry<Student, String> sm:smap.entrySet())
	    {
	    	if(sm.getValue().equals("Java"))
	    	{
	    		System.out.println(sm.getKey()+" "+sm.getValue());
	    	}
	    }
	     
	    
	    // here we need to overrides equals and hashcode method: other wise null
	    System.out.println(smap.put(new Student(103,"Sagar",78.4f), "Python"));
	    
	    System.out.println("___________________________________________________");
	     
	    for(Map.Entry<Student, String> sm:smap.entrySet())
	    {
	    	if(sm.getValue().equals("Java"))
	    	{
	    		System.out.println(sm.getKey()+" "+sm.getValue());
	    	}
	    }
	     
	}

}
