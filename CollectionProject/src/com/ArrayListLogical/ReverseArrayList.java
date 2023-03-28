package com.ArrayListLogical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseArrayList {
	public static void reverseArray(ArrayList<String> list)
	{
		Iterator<String> itr = list.iterator();
		ListIterator<String> listitr = list.listIterator();
		String temp;
		
		/*for(int i=0,j=(list.size()-1);i<list.size()/2;i++,j--)
		{
			temp=itr.next();
			list.set(i, listitr.previous());	// Exception No Such Element
			list.set(j, temp);
		}*/
		
		for(int i=0,j=(list.size()-1);i<list.size()/2;i++,j--)
		{
			temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			
		}
		
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Adinath");
		list.add("Utkarsh");
		list.add("Manas");
		list.add("Gaurav");
		list.add("Vivek");
		list.add("Pritish");
		
		System.out.println(list);
		reverseArray(list);
		//Collections.sort(list);
		System.out.println(list);
		
	}

}
