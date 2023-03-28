package com.student;

import java.util.Scanner;

public class StudentTest3 {
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
		Student stud[]=new Student[5];
		
		int i=0;
		int choice=0;
		do
		{
			stud[i]=new Student();
			enterStudentDetails(stud[i]);
			i++;
			System.out.println("Enter more Student 1-Yes/ 0-No");
			choice=sc.nextInt();
		}while(choice==1&& i<5);
		
		System.out.println(" No Student : "+Student.scount);
		for(Student s: stud)
		{
			System.out.println(s);
		}
	}

}
