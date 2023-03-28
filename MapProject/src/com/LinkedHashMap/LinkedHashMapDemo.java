package com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String, Double> lmap= new LinkedHashMap<>(10,0.75f,true);
		lmap.put("Adinath", 78.7);
		lmap.put("Manas", 88.4);
		lmap.put("Rohit", 56.3);
		lmap.put("Sandhya", 77.1);
		lmap.put("Jack", 85.7);
		
		for(Map.Entry<String,Double> en : lmap.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		System.out.println("________________________________________________________");
		
		double m = lmap.get("Manas");
		m= lmap.get("Adinath");
		for(Map.Entry<String,Double> en : lmap.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
	}
}
