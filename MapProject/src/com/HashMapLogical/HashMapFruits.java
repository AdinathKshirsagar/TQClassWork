package com.HashMapLogical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapFruits {
	public static void occurenceFrutis(ArrayList<String> list)
	{
		HashMap<String, Integer> map = new HashMap<>();
		int count;
		 for(String s : list)
		 {
			 count =1;
			 if(map.containsKey(s))
			 {
				count=map.get(s);
				map.put(s, count+1);
			 }
			 else
			 {
				 map.put(s, count);
			 }
		 }
		 for(Entry<String, Integer> ent : map.entrySet())
		 {
			 System.out.println(ent.getKey()+" "+ent.getValue());
		 }
	}
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pinapple");
		fruits.add("Kiwi");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		
		occurenceFrutis(fruits);
	}

}
