package com.SortingMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class SortByKey {
	public static void sortByKey(HashMap<Integer, String> map)
	{
		ArrayList<Integer> alist = new ArrayList<>(map.keySet());
		Collections.sort(alist);
		for(Integer i : alist)
		{
			System.out.println(i+" "+map.get(i));

		}
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		for(Integer i : alist)
		{
			lhm.put(i, map.get(i));
		}
		System.out.println(lhm);
	}
	public static void main(String[] args) {
		HashMap<Integer, String> map1= new HashMap<>();
		map1.put(1, "Java");
		map1.put(3, "Python");
		map1.put(6, ".Net");
		map1.put(4, "Angular");
		map1.put(9, "Html");
		map1.put(7, "ReactJs");
		
		sortByKey(map1);
		
	}

}
