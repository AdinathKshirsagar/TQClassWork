package com.TreeSet;


import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> tm= new TreeSet<>();
		tm.add(78);
		tm.add(56);
		tm.add(90);
		tm.add(12);
		tm.add(78);
		tm.add(64);
		//tm.add(null);
		
		// null not allowed
		// duplicate not allowed
		
		System.out.println(tm);
		
		System.out.println(tm.first());
		System.out.println(tm.last());
		
		System.out.println(tm.lower(64));// strictly less
		System.out.println(tm.floor(64));// less or equal
		
		System.out.println(tm.higher(64));
		System.out.println(tm.ceiling(64));
		
		System.out.println(tm.headSet(64));
		System.out.println(tm.headSet(64, true));
		
		
		System.out.println(tm.tailSet(64));
		System.out.println(tm.tailSet(64, false));
		
		System.out.println(tm.subSet(12, 78));
		System.out.println(tm.subSet(12, true, 78, true));
		
		
		Iterator<Integer> itr=tm.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		NavigableSet<Integer> nm= tm.descendingSet();
		
		for(Integer i:nm)
		{
			System.out.println(i);
		}
		
		Set synchts=Collections.synchronizedSet(tm);
		


		
	}

}
