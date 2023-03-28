package com.ArrayListLogical;

import java.util.ArrayList;

public class ArrayListFrequency {
	public static void countFrequency(ArrayList<String> list) {
		int count;
		for(int i=0;i<list.size();i++)
		{
			count=1;
			if(list.get(i).equals("visited"))
				continue;
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					list.set(j, "visited");
					count++;
				}
			}
			System.out.println(list.get(i)+" : "+count);
		}
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
		
		countFrequency(list1);
	}

}
