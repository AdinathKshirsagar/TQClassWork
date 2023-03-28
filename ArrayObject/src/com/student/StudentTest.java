package com.student;

import java.util.Arrays;

public class StudentTest {

	public static void main(String[] args) {
		Student stud[] = new Student[5];
		stud[0]= new Student(1,"Akash",34.5f);
		stud[1]= new Student(2,"Manoj",75.8f);
		stud[2]= new Student(3,"Pooja",44.5f);
		stud[3]= new Student(4,"Sandip",85.8f);
		stud[4]= new Student(5,"Adinath",58.5f);
		// stud[5]= new Student(6,"Pritish",76.5f); // It will give OutBondException
		
		System.out.println(Arrays.toString(stud));  //  we can pass like this also
		
		for(Student st: stud)
		{
			if(st.getMarks()>80) {
				System.out.println(st);
			}
		}
		
	}

}
