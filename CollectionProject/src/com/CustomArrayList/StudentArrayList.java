package com.CustomArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> stud = new ArrayList<>();
		stud.add(new Student(1,"Santosh",78.4f));
		stud.add(new Student(2,"Gaurav",87.3f));
		stud.add(new Student(3,"Rani",66.4f));
		stud.add(new Student(4,"Pradip",88.32f));
		stud.add(new Student(5,"Hina",77.9f));
		stud.add(new Student(6,"Bhushan",69.4f));
		stud.add(new Student(6,"Adinath",69.4f));
		
		for(Student s : stud)
		{
			System.out.println(s);
		}
		Collections.sort(stud);
		//Collections.reverse(stud);
		
		System.out.println("________________________________________________");
		
		for(Student s : stud)
		{
			System.out.println(s);
		}
		System.out.println("________________________________________________");
		Collections.sort(stud,Collections.reverseOrder());
		for(Student s : stud)
		{
			System.out.println(s);
		}
	}

}
