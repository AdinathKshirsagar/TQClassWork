package com.StaticHitCounter;

public class Student {
	private int sid;
	private String sname;
	
	static String school="Shivaji Highschool";
	static int studentCount=0;
	
	{
		studentCount++;
	}
	Student(){
		
	}
	Student(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
}
