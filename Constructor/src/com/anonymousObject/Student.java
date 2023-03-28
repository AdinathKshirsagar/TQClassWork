package com.anonymousObject;

public class Student {

	private int id;
	private String name;
	private float marks;
	private String schoolName;
	
	public Student()
	{
		System.out.println("In default constructor");
		this.id=100;
		this.name="Unknown";
		this.marks=20.0f;
		this.schoolName="No school";
	}
	
	public Student(int id, String name)
	{
		System.out.println("In parameterized constructor 3");
		this.id=id;
		this.name=name;
		this.marks=40.f;
		this.schoolName="Joseph School";
		
	}
	
	public Student(int id, String name, float marks)
	{
		System.out.println("In parameterized constructor 1");
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.schoolName="Joseph School";
	}
	
	
	
	public Student(int id, String name, float marks, String schoolName)
	{
		System.out.println("In parameterized constructor 2");
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.schoolName=schoolName;
	}
	
	
	
	public void display()
	{
		System.out.println(id+"  "+name+"  "+marks+" "+schoolName);
	}
}
