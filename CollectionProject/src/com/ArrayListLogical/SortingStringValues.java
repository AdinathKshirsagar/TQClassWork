package com.ArrayListLogical;

import java.util.ArrayList;

public class SortingStringValues {
	public static void sortingString(ArrayList<String> list)
	{
		String temp;
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).compareTo(list.get(j))>1)
				{
					temp=list.get(i);
					list.set(i, list.get(j));
					list.set(i, temp);
				}
			}
		}
		System.out.println(list);
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Adinath");
		list.add("Rupali");
		list.add("Pritish");
		list.add("Suyog");
		list.add("Yashank");
		list.add("Bhushan");
		list.add("Manas");
		
		System.out.println(list);
		sortingString(list);
		
	}

}
