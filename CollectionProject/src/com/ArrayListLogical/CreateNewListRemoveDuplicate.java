package com.ArrayListLogical;

import java.util.ArrayList;

public class CreateNewListRemoveDuplicate {
	public static void createlist(ArrayList<String> list )
	{
		ArrayList<String> ulist = new ArrayList<>();
		for(String s : list)
		{
			if(!ulist.contains(s))
			{
				ulist.add(s);
			}
		}
		System.out.println( ulist);
	}
	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<>();
		list1.add("A");
		list1.add("C");
		list1.add("N");
		list1.add("Y");
		list1.add("E");
		list1.add("W");
		list1.add("C");
		list1.add("N");
		list1.add("Y");
		
		createlist(list1);
	}

}
