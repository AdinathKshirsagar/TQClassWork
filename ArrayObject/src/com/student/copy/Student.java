package com.student.copy;

import java.util.Arrays;

public class Student {
	private int id;
	private String sName;
	private float marks[];
	
	public Student()
	{
		marks=new float[3];
	}
	public Student(int id, String sName,float marks[])
	{
		this();
		this.id=id;
		this.sName=sName;
		this.marks=marks;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String sName)
	{
		this.sName=sName;
	}
	public String getName()
	{
		return sName;
	}
	public void setMarks(float marks[])
	{
		this.marks=marks;
	}
	public float[] getMarks()
	{
		return marks;
	}
	public String toString ()
	{
		return " Student Id : "+id+" Name "+sName+" Marks : "+Arrays.toString(marks);
	}
}
