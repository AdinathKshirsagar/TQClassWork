package com.Polymorphism;

public class PolyDemo {
	
	int a;
	int b;
	int c;
	
	int add(int a,int b)
	{
		System.out.println("Addition of 2 int numbers:");
		return (a+b);
	}
	
    float add(float a,float b)
    {
    	System.out.println("Addition of 2 float numbers:");
    	return (a+b);
    }
	
	int add(int a,int b,int c)
	{
	    System.out.println("Addition of 3 numbers:");
		return(a+b+c);
	}
	

	public static void main(String[] args) {

		PolyDemo obj1= new PolyDemo();
		// number of arguments
		System.out.println("The sum is :"+obj1.add(4, 5));
		
		System.out.println("The sum is :"+obj1.add(4, 5,9));

		// type of argument
		System.out.println("The sum is :"+obj1.add(4.6f,8.9f));
		

	}

}
