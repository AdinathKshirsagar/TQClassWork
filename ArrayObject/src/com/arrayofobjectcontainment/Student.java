package com.arrayofobjectcontainment;

import java.util.Arrays;

public class Student {
	private int id;
	private String studName;
	private Subject subject[];
	
	public Student ()
	{
		
	}
	public Student(int id,String studName, Subject subject[])
	{
		this.id=id;
		this.studName=studName;
		this.subject=subject;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setStudName(String studName)
	{
		this.studName=studName;
	}
	public String getStudName()
	{
		return studName;
	}
	public void setSubject (Subject subject[])
	{
		this.subject=subject;
	}
	public Subject[] getSubject()
	{
		return subject;
	}
	
	public String toString()
	{
		return " Student id :"+id+" Name : "+studName+" "+Arrays.toString(subject)+" ";
	}
}
