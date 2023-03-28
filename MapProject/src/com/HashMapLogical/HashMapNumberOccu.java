package com.HashMapLogical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapNumberOccu {
	
	public static String convertWords(int n)
	{
		String word=null;
		switch (n)
		{
		case 1:  
			word = "One";
			break;
		case 2:
			word = "Two";
			break;
		case 3:
			word= "Three";
			break;
		case 4:
			word= "Four";
			break;
		case 5:
			word= "Five";
			break;
		}
		return word;
		
	}
	public static void numberOccurence(ArrayList<Integer> list)
	{
		HashMap<String , Integer> map = new HashMap<>();
		
		for(int num : list)
		{
			String nword = convertWords(num);
			int count=1;
			if(map.containsKey(nword)) 
			{
				count= map.get(nword);
				map.put(nword, count+1);
			}
			else
			{
				map.put(nword, count);
			}
		}
		for(Entry<String, Integer> e : map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(5);
		list1.add(3);
		list1.add(4);
		list1.add(3);
		list1.add(5);
		 
		numberOccurence(list1);
	}

}
