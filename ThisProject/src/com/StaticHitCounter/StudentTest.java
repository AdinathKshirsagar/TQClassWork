package com.StaticHitCounter;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("number of student :"+Student.studentCount);
		Student s1= new Student(32,"Adinath");
		Student s2= new Student(5,"Manas");
		System.out.println("number of student :"+Student.studentCount);
	}

}
