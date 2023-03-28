package com.ArrayList;

import java.util.ArrayList;

public class NonGenericArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Akash");
		list.add('c');
		list.add(34); // auto boxing
		list.add(78.4f);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
			int data = (int) list.get(i)+5;	 // casting
			list.set(i, data);				 // Code will give ClassCastException	
			
		}
		
	}
}
