package com.objectclass;

class Demo
{
	int a;
	
	Demo()
	{
		
	}
	Demo(int a)
	{
		this.a=a;
	}
	
	public String toString()
	{
		return a+" ";
	}

}

public class ObjectCreate {

	public static void main(String[] args) throws ClassNotFoundException {
		//1st way
		Demo d1= new Demo();
		System.out.println(d1);
		
		//2nd way
		Class<Demo> t2= Demo.class;
		System.out.println(t2.getName());
		
		//3rd way
		Class<?> t3= Class.forName("Test");
		System.out.println(t3.getName());
		

	}

}
