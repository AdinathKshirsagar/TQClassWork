package com.ArrayList;

import java.util.ArrayList;

public class GenricArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(67);
		list1.add(56);
		list1.add(89);
		list1.add(98);
		list1.add(34);
		
		for(int i=0;i<list1.size();i++)
		{
			int data =list1.get(i)+5;
			list1.set(i, data);
			System.out.println(list1.get(i));
		}
		System.out.println("_________________________________________");
		for(Integer li : list1)
		{
			System.out.println(li);
		}
	}

}
