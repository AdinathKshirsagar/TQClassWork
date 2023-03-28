package com.backwardcompat;

public class MySchool implements Student{
	
	int id;
	String name;
	static int count=0;
	
		
	public void addStudent()
	{
		this.id=1;
		this.name="Unknown";
		count++;
	}
	
	public static void main(String args[])
	{
		Student.scholars();
		Student s= new MySchool();
		s.addStudent();
		s.payFees(0);
		
		
	}

}
