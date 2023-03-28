package com.demo1;

import com.demo.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
	
		Rectangle r1= new Rectangle();
		r1.enterValues(2,8);
		
		System.out.println("Area is:"+r1.displayArea());
		System.out.println("Perimeter is:"+r1.displayPerimeter());
		
		Rectangle r2= new Rectangle();
		r2.enterValues(4,5);
		//r2.length=4;
		//r2.breadth=5;
		
		System.out.println("Area is:"+r2.displayArea());
		System.out.println("Perimeter is:"+r2.displayPerimeter());
		
		

	}

}