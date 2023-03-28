package com.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> hs = new Hashtable<>();
		hs.put(1,"Rupali");
		hs.put(2, "Adinath");
		hs.put(3, "Pritish");
		
		Enumeration<Integer> en = hs.keys();
		while(en.hasMoreElements())
		{
			int key = en.nextElement();
			System.out.println(key+" "+hs.get(key));
		}
	}

}
