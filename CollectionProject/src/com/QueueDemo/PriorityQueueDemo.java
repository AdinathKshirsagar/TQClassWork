package com.QueueDemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		// unbounded : there has no size restriction
		// default capacity : 11
		// grows : <64 : doubles
		//		   >64 : grows 50%
		
		
		pq.add("Rahu");
		pq.add("Adinath");
		pq.add("Vivek");
		pq.add("Bhushan");
		
		//pq.add(null); // Runtime error
		// Comparable cannot compare any object with null value
		
		Iterator<String> itr = pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("___________________________________________");
		
		PriorityQueue<Integer> qq = new PriorityQueue<>();
		qq.add(32);
		qq.add(56);
		qq.add(88);
		qq.add(26);
		qq.add(94);
		
		
		System.out.println(qq);
	}

}
