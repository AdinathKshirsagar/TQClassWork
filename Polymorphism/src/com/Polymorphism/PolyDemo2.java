package com.Polymorphism;

public class PolyDemo2 {
	
	int id; 
	String name;
	float marks;
	
	static void enterDetails(int id, String name)
	{
		System.out.println("in method 1");
		System.out.println(id+ name);
	}
	
	static void enterDetails(int id, String name, float marks)
	{
		System.out.println("in method 2");
		System.out.println(id+ name+marks);
	}
	
	static void enterDetails(int id,float marks,String name)
	{	
		System.out.println("in method 3");
		System.out.println(id+" "+marks+name);
	}
	

	public static void main(String[] args) {


		PolyDemo2.enterDetails(101,"Aditya");
        PolyDemo2.enterDetails(102,"Pritish",78.5f);
        PolyDemo2.enterDetails(103, 98.4f,"Bhushan");
		
	}

}

