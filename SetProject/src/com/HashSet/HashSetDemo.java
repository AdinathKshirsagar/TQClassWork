package com.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		 
		 HashSet<String> hset= new HashSet<>();
		 
		 hset.add("Java");
		 hset.add("Python");
		 hset.add("Html");
		 hset.add(null);
		 hset.add("SpringBoot");
		 hset.add("Angular");
		 hset.add("Java");
		 hset.add(null);	// No error but can not add multiple null 
		 
		 System.out.println(hset);
		 
		 HashSet<String> hset1= new HashSet<>();
		 
		 hset1.add("Java");
		 hset1.add("Python");
		 hset1.add("JavaScipt");
		 hset1.add("Angular");
		
		 
		 System.out.println(hset1);
		 
		 // Mathematical Operation
		 
		 hset.addAll(hset1);	// Union(Addtion)
		 System.out.println(hset);
		 
		 //hset.removeAll(hset1);	// Difference (Element present in hset and not in hset1 )
		 //System.out.println(hset);
		 
		 hset.retainAll(hset1); // intersection ( common element in both new hset and hset1 )
		 System.out.println(hset);
	}

}
