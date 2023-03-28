package com.example;

public class StudentDemo {

	// instance variable
	int sid;
	String name;
	float marks;
	String adharNumber;

	// instance methods
	void enterDetails(int id, String n, float m, String adhar) {
		sid = id;
		name = n;
		marks = m;
		adharNumber = adhar;

	}

	void displayDetails() {

		System.out.println(sid + "  " + name + "   Marks:" + marks + "  AdharNumber:" + adharNumber);
	}

	public static void main(String[] args) {

		Student s1;
		s1= new Student();
		Student s2= new Student();
		s1.displayDetails();

		s1.enterDetails(1, "Pritish", 90.8f, "HJ89DHJ");
		s2.enterDetails(2, "Omkar", 89.6f, "KFD789GGF");
		
		s1.displayDetails();
		s2.displayDetails();

		}

}