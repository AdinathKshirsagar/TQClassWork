package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorLinkList {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("Java");
		llist.add("Python");
		llist.add("Html");
		llist.add("C++");
		llist.add("SpringBoot");
		
		System.out.println("_______________________ iterator_____________________________");
		Iterator<String> itr = llist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("_______________________descending iterator_____________________________");
		Iterator<String> itr1 = llist.descendingIterator();	 // descendingIterator
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("_______________________List iterator backward_____________________________");
		ListIterator<String> itr2= llist.listIterator(llist.size());
		while(itr2.hasPrevious())
		{
			System.out.println(itr2.previous());
		}
	}

}
