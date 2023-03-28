package com.Hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1= new HashMap<>();
		
		System.out.println("Values of 91 key :"+map1.put(91, "AUS"));
		
		map1.put(91, "India");
		map1.put(44, "UK");
		map1.put(49, "Germany");
		map1.put(27, "SouthAfrica");
		
		System.out.println("Values of 91 key :"+map1.put(91, "Indonesia"));
		map1.put(null, "Unknown");
		System.out.println(map1.put(null, "No"));	// replaces Unknown by NO
		
		System.out.println(map1);
		map1.put(34, null);
		map1.put(56, null);
		map1.put(78, null);
		System.out.println(map1);
		
		System.out.println("Value of 49 : "+map1.get(49));
		
		
	}

}
