package com.WrapperCovarient;

class First{
	Number value;
	Number printValue()  // If you replace Number to Object then it will access all class(Character class)
	{
		return value;
	}
}
class Second extends First
{
	int myval;
	Integer printValue()
	{
		return myval;
	}
}

class Third extends First
{
	float myval;
	Float printValue()
	{
		return myval;
	}
}
// Character and Boolean is not a subclass of Number 
/*
class Fourth extends First
{
	char ch;
	Character printValue()
	{
		return ch;
	}
}*/

public class WrapperCovarient {
	public static void main(String[] args) {
		Second s1 = new Second();
		Integer n = s1.printValue();
		n=n+5;
		
		Third t1 = new Third();
		float f = s1.printValue();
		f=f+8.5f;
	}
}
