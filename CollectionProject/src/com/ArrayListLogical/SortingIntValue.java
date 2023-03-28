package com.ArrayListLogical;

import java.util.ArrayList;
import java.util.Collections;

public class SortingIntValue {
	public static void sortingValues(ArrayList<Integer> list) 
	{
		Integer temp;
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++) 
			{
				if(list.get(i)>list.get(j))
				{
					temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
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
		sortingValues(list);
		//Collections.sort(list);
		//System.out.println(list);
	}

}
