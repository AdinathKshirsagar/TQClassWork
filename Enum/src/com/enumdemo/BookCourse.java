package com.enumdemo;

enum BookCourse {
	
	JAVA(2000), PYTHON(3200),HTML(1300);
	
	int price;
	BookCourse(int price)
	{
		this.price=price;
	}
}
