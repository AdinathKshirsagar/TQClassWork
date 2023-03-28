package com.Overloading;

public class AreaDemo {
	
	static void area(float radius)
	{
		System.out.println("Area of circle is:"+(3.14*radius*radius));
	}
	
	static void area(int side)
	{
		System.out.println("Area of square is:"+(side*side));
	}
	
	// cannot overload method on return type
	/*
	static int area(int side)
	{
		System.out.println("Area of square is:");
		return (side*side);
	}
	*/
	
	static void area(int length, float breadth)
	{
		System.out.println("Area of rectangle is:"+(length*breadth));
	}
	
	static void area(float base, int height)
	{
		System.out.println("Area of triangle is:"+(0.5*base*height));
	}

	public static void main(String[] args) {
		
		AreaDemo.area(6);
		AreaDemo.area(5.6f);
		AreaDemo.area(7, 9.7f);
		AreaDemo.area(6.7f, 7);
		
		

	}

}
