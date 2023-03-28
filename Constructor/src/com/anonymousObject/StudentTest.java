package com.anonymousObject;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		// default constr
       Student s1= new Student();
       s1.display();
       
       //parameter
       System.out.println("===================");
       Student s2= new Student(101,"Shuruti",90.5f);
       s2.display();
       /*
       // user input
       
        System.out.println("Enter id:");
       int id= sc.nextInt();
       System.out.println("Enter name:");
       String name= sc.next();
       System.out.println("Enter marks:");
       float marks= sc.nextFloat();
       
       
       Student s3= new Student(id,name,marks);
       // tight coupling
       s3.display();
       */
       System.out.println("===================");
       Student s4= new Student(103,"Sneha",88.5f,"Mary school");
       s4.display();
       
       
       System.out.println("===================");
       Student s5= new Student(105,"Adinath");
       s5.display();
       
       sc.close();
       
	}
}

