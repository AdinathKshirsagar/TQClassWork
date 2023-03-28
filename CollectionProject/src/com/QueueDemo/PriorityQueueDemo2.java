package com.QueueDemo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;


class MyComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) {
       
		return o1-o2;

	}
}

public class PriorityQueueDemo2 {

	public static void main(String[] args) {

      PriorityQueue<Integer> pq= new PriorityQueue<Integer>(new MyComparator());
      // unbounded : size restriction
      
      // default capacity:11
      // grows : <64: doubles
      //          >64 : grows 50%
      
     pq.offer(78);
     pq.offer(61);
     pq.offer(11);
     pq.offer(23);

     
     System.out.println(pq);
     
     //  pq.add(null); Runtime error
     //  Comparable cannot compare any object with null value
     
     
     Iterator<Integer> itr= pq.iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
     

	}

}

