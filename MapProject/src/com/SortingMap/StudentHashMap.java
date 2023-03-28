package com.SortingMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentHashMap {
	
	public static void sortKey(HashMap<Student,String> map)
	{
		ArrayList<Student> list = new ArrayList<>(map.keySet());
		
		//Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());
				
		LinkedHashMap<Student, String> lhm= new LinkedHashMap<>();
		for(Student s:list)
		{
			lhm.put(s, map.get(s));
		}
		
        for(Map.Entry<Student, String> en:lhm.entrySet())
        {
        	System.out.println(en.getKey()+"  "+en.getValue());
        }

	}
	
	public static void sortValue(HashMap<Student, String> map)
	{
		ArrayList<String> alist = new ArrayList<>(map.values());
		System.out.println(alist);
		
		Collections.sort(alist);
		
		System.out.println(alist);
		
		LinkedHashMap<Student, String> lhm = new LinkedHashMap<>();
		Student key;
		for(String s : alist)
		{
			for(Map.Entry<Student, String> en : map.entrySet())
			{
				if(en.getValue().equals(s))
				{
					key=en.getKey();
					if(!lhm.containsKey(key))
					{
						lhm.put(key, s);
					}
				}
			}
		}
		for(Map.Entry<Student, String> en:lhm.entrySet())
        {
        	System.out.println(en.getKey()+"  "+en.getValue());
        }
	}

	public static void main(String[] args) {

     HashMap<Student, String> smap= new HashMap<>();
     
     smap.put(new Student(101,"Bhushan",89f),"Java");
     smap.put(new Student(102,"Ajay",98.4f), "Python");
     smap.put(new Student(103,"Sagar",78.4f), "Angular");
     smap.put(new Student(104,"Ratan",72f), "ReactJs");
     smap.put(new Student(105,"Vivek",72f), "Html");
     
      sortKey(smap);
      
      System.out.println("===============================================");
      
      sortValue(smap);

	}

}
