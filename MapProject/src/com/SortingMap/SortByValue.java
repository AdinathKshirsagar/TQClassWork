package com.SortingMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortByValue {
	
	public static void sortValue(HashMap<Integer, String> map)
	{
		ArrayList<String> alist = new ArrayList<>(map.values());
		System.out.println(alist);
		
		Collections.sort(alist);
		
		System.out.println(alist);
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		int k;
		for(String s : alist)
		{
			for(Map.Entry<Integer, String> en : map.entrySet())
			{
				if(en.getValue().equals(s))
				{
					k=en.getKey();
					if(!lhm.containsKey(k))
					{
						lhm.put(k, s);
					}
				}
			}
		}
		System.out.println(lhm);
	}
	public static void main(String[] args) {
		HashMap<Integer, String> list = new HashMap<>();
		list.put(1, "Java");
		list.put(3, "Python");
		list.put(6, ".Net");
		list.put(4, "Angular");
		list.put(9, "Html");
		list.put(7, "ReactJs");
		
		System.out.println(list);
		sortValue(list);
	}

}
