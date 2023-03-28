package com.pratice1;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentDepartmentHashMap {

	public static void main(String[] args) {

		ArrayList<Student> list1= new ArrayList<>();
		list1.add(new Student(1,"Sagar"));
		list1.add(new Student(2,"Rohit"));
		list1.add(new Student(3,"Vivek"));
		list1.add(new Student(4,"Gaurav"));
		
		HashMap<Department, ArrayList<Student>> hm= new HashMap<>();
		hm.put(new Department(101,"CSE"), list1);
		
		
		ArrayList<Student> list2= new ArrayList<>();
		list2.add(new Student(1,"Priya"));
		list2.add(new Student(2,"Vaishnavi"));
		list2.add(new Student(3,"Rupali"));
		list2.add(new Student(4,"Shruuti"));
		
		hm.put(new Department(102,"IT"),list2);
		
		
		
		
     
	}

}
