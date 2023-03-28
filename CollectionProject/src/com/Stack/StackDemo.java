package com.Stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		stk.add("Dairy Milk");
		stk.add("5 Star");
		stk.add("Kit kat");
		stk.add("Perk");
		stk.add("Lindt");
		
		System.out.println(stk);
		
		System.out.println(stk.peek());	// retrieve element at last
		System.out.println(stk);
		
		System.out.println(stk.pop());	// retrieve and remove
		System.out.println(stk);
		
		System.out.println(stk.search("Dairy Milk"));	//  return from top 
		System.out.println(stk.search("Munch"));	//  if element not found return -1
		
		Enumeration<String> enu = stk.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		
		
	} 

}
