package com.HashMap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> map1= new HashMap<>();
		map1.put(1, "Pyhton");
		map1.put(2, "Java");
		map1.put(3, "AWS");
		map1.put(4, "Java");
		map1.put(5, "Angular");
		
		
		Set<Entry<Integer,String>> entrySet= map1.entrySet();
		
		Iterator<Entry<Integer,String>> itr= entrySet.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,String> entry = itr.next();
			if(entry.getValue().equals("Java"))
			{
				entry.setValue("Core java");
			}
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
		System.out.println("________________________________________________");
		
		while(itr.hasNext())
		{
			Entry<Integer,String> entry = itr.next();
			if(entry.getValue().equals("Java"))
			{
				map1.put(entry.getKey(), "Core Java");
			}
		}
		System.out.println(map1);
	}

}
