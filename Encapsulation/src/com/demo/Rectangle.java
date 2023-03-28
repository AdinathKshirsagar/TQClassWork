package com.demo;

public class Rectangle {
	
	private int length;
	private int breadth;
	
   	public void enterValues(int l, int b)
	{
   		length=l;
		breadth=b;
	}
	
	public float displayArea()
	{
		float area= length*breadth;
		return area;
	}
	
	public float displayPerimeter()
	{
		float peri;
		peri= 2*(length+breadth);
		return peri;
	}
	
	public static void main(String args[])
	{
		Rectangle r1= new Rectangle();
		//r1.enterValues(10,11);
		
		r1.length=10;
		r1.breadth=11;
		
		System.out.println("Area is:"+r1.displayArea());
		System.out.println("Perimeter is:"+r1.displayPerimeter());
	}

}
