package com.compartordem;

import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> stud = new ArrayList<>();
		stud.add(new Student(1,"Santosh",78.4f,22));
		stud.add(new Student(2,"Gaurav",87.3f,32));
		stud.add(new Student(3,"Rani",66.4f,24));
		stud.add(new Student(4,"Pradip",88.32f,25));
		stud.add(new Student(5,"Hina",77.9f,22));
		stud.add(new Student(6,"Bhushan",69.4f,26));
		stud.add(new Student(6,"Adinath",69.4f,27));
		
		for(Student s : stud)
		{
			System.out.println(s);
		}
		Collections.sort(stud,new AgeComparator());
		//Collections.sort(stud,new NameComparator());
		//Collections.sort(stud,new MarksComparator());
		
		System.out.println("________________________________________________");
		
		for(Student s : stud)
		{
			System.out.println(s);
		}
		
	}

}
