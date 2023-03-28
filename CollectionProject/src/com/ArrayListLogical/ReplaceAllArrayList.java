package com.ArrayListLogical;

import java.util.ArrayList;

public class ReplaceAllArrayList {
	public static void replaceAll(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)<40) 
			{
				list.set(i, 40);
			}
		}
		System.out.println(list);
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(78);
		list.add(45);
		list.add(67);
		list.add(34);
		list.add(35);
		list.add(89);
		
		System.out.println(list);
		replaceAll(list);
		
	}

}
