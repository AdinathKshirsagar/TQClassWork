package com.enumdemo;

import java.util.Scanner;

public class CourseDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Course Type(1. Java,2. Python,3. HTML):");
		int course = sc.nextInt();
		
		BookCourse bc=null;
		System.out.println("Enter total Student : ");
		int stud=sc.nextInt();
		
		switch(course) 
		{
		case 1 : bc = BookCourse.JAVA;
					System.out.println("JAVA:"+ bc.price);
			        System.out.println("Total:"+ bc.price*stud);
			        break;
		case 2 : bc = BookCourse.PYTHON;
					System.out.println("PYTHON:"+ bc.price);
			        System.out.println("Total:"+ bc.price*stud);
			        break;
		case 3 : bc = BookCourse.HTML;
					System.out.println("HTML :"+ bc.price);
			        System.out.println("Total:"+ bc.price*stud);
			        break;
		default : System.out.println(" Wrong choice....");
		}
		
	}
}
