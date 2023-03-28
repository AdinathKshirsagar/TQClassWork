package com.ArrayListLogical;

import java.util.ArrayList;

public class SearchObject {
	public static void search(ArrayList<Integer> list)
	{
		boolean status = false;
		int val= 55;
		for(Integer i : list)
		{
			if(i==val)
			{
				System.out.println("Element found");
				status= true;
				break;
			}
		}
		if(!status)
		{
			System.out.println("Element Not found");
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(78);
		list.add(45);
		list.add(67);
		list.add(34);
		list.add(35);
		list.add(89);
		
		search(list);
		
	}

}
