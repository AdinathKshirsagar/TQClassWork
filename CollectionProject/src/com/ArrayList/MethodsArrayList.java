package com.ArrayList;

import java.util.ArrayList;

public class MethodsArrayList {

	public static void main(String[] args) {
		ArrayList<String> stud = new ArrayList<>();
		stud.add("Sandhya");
		stud.add("Chinmay");
		stud.add("Priya");
		stud.add(null);	// Null allowed
		stud.add("Vaishanvi");
		stud.add("Priya");	// Duplicate allowed
		stud.add(null);
		
		System.out.println(stud);
		stud.add(2,"Rupali");
		System.out.println("____________________After Adding Rupali______________________");
		System.out.println(stud);
		
		stud.add("Adinath");
		System.out.println("____________________After Adding Rupali______________________");
		System.out.println(stud);
		
		ArrayList<String> stud1= new ArrayList<>();
		stud1.add("Uday");
		stud1.add("Pratik");
		stud1.add("Suyog");
		System.out.println(stud1);
		System.out.println("____________________After adding Collection_____________________");
		
		stud.addAll(2,stud1);	// Specific position 
		//stud.addAll(stud1);		// at end position
		System.out.println(stud);
		
		System.out.println("____________________Removing Priya__________________________");
		stud.remove("Priya");		// removes first Occurence
		System.out.println(stud);
		
		System.out.println("_________________Removing collection stud 1__________________");
		stud.removeAll(stud1);
		System.out.println(stud);
		
		stud.addAll(stud1);
		System.out.println("_______________________Retains all___________________________");
		stud.retainAll(stud1);		// stud1 sodun baki sagle delete
		System.out.println(stud);
		
		System.out.println("Size : "+stud.size());
		System.out.println("Empty : "+stud.isEmpty());
	}

}
