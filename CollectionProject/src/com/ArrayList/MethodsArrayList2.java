package com.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MethodsArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> stud = new ArrayList<>();
		stud.add("Sandhya");
		stud.add("Chinmay");
		stud.add("Priya");
		stud.add("Vaishanvi");
		stud.add(null);	// Null allowed
		stud.add("Priya");	// Duplicate allowed
		stud.add(null);
		
		System.out.println(stud);
		System.out.println("____________________After Adding Rupali______________________");
		List<String> list1= stud.subList(1, 3);
		System.out.println(list1);
		
		System.out.println("Contains Priya :"+stud.contains("Priya"));
		System.out.println("___________________After Removing all Priya____________________");
		for(int i=0;i<stud.size();i++)
		{
			if(stud.get(i)=="Priya")
			{
				stud.remove(i);
			}
		}
		// Collection 
		//stud.removeAll(Collections.singleton("Priya"));
		System.out.println(stud);
	}

}
