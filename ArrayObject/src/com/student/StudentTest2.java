package com.student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTest2 {
	static Scanner sc = new Scanner(System.in);
	public static void enterStudentDetails(Student st)
	{
		System.out.println("Enter Student id :");
		st.setId(sc.nextInt());
		System.out.println("Enter Student name :");
		st.setName(sc.next());
		System.out.println("Enter Student Marks : ");
		st.setMarks(sc.nextFloat());
	}
	public static void main(String[] args) {
		Student stud[] = new Student[3];
		
		for(int i=0;i<stud.length;i++)
		{
			stud[i]= new Student();
			enterStudentDetails(stud[i]);
		}
		
		for(Student s: stud)
		{
			if(s.getMarks()>80) {
				System.out.println(s);
			}
		}
		
	}

}
