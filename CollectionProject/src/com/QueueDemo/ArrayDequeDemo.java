package com.QueueDemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {

      ArrayDeque<String> adq= new ArrayDeque<>();
      
      // allows null elements... no need of comparable
      adq.offer("Tea");
      adq.offer("Coffee");
      adq.offer("Juice");
      
      System.out.println(adq);
      
      adq.offerFirst("ColdDrink");
      
      System.out.println(adq);
      
      adq.pollFirst();
      System.out.println(adq);

      System.out.println(adq.peekFirst());
      
	}

}

