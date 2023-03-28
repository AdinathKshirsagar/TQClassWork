package com.student.copy;

import java.util.Scanner;

public class StudentTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Student stud[]=new Student[5];
		 /* 
	      float m1[]= {34f,56f,78f};
	      stud[0]= new Student(1,"Shruti",m1);
	      
	      System.out.println(stud[0]);
	      */
		float m1[];
		for(int i=0;i<3;i++)
		{
			stud[i]=new Student();
			System.out.println("Enter student id :");
			stud[i].setId(sc.nextInt());
			System.out.println("Enter student name : ");
			stud[i].setName(sc.next());
			
			m1=new float[3];
			System.out.print("Enter student marks ");
			for(int j=0;j<3;j++)
			{
				System.out.println("Subject : "+(j+1)+" :");
				m1[j]=sc.nextFloat();
			}
			stud[i].setMarks(m1);
			
		}
		for(Student s: stud)
		{
			System.out.println(s);
		}
	}

}
