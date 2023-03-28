package com.ArrayListLogical2;

import java.util.ArrayList;
import java.util.Collections;

public class CommonElements {
	public static void commonElement(ArrayList<String> list1,ArrayList<String> list2)
	{
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("Common elements are :");
		for(int i=0;i<list1.size();i++)
		{
				if(list2.contains(list1.get(i)))
				{
					System.out.println(list1.get(i));
				}
		}
		
	}
	public static void uniqueElement(ArrayList<String> list1,ArrayList<String> list2)
	{
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("unique elements are :");
		for(int i=0;i<list1.size();i++)
		{
				if(!list2.contains(list1.get(i)))
				{
					System.out.println(list1.get(i));
				}
		}
		
	}
	public static void main(String[] args) {
		ArrayList<String> lang1= new ArrayList<>();
		lang1.add("Angular");
		lang1.add("Python");
		lang1.add("Java");
		lang1.add("Html");
		
		ArrayList<String> lang2= new ArrayList<>();
		lang2.add("C++");
		lang2.add("Python");
		lang2.add("ReactJs");
		lang2.add("Html");
		
		Collections.sort(lang1);
		System.out.println(lang1);
		
		System.out.println("_______________________________");
		commonElement(lang1, lang2);
		System.out.println("_______________________________");
		uniqueElement(lang1, lang2);
	}

}
