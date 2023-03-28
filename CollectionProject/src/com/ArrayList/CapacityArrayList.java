package com.ArrayList;

import java.util.ArrayList;

public class CapacityArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(20);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.ensureCapacity(20);
		
		list1.add(30);
		list1.add(45);
		list1.trimToSize(); // capacity 2 

	}

}
