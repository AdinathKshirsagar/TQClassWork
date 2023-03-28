package com.ThisObject;

public class ThisDemo {
	private int a;
	private int b;
	private String name;
	
	public ThisDemo(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public ThisDemo() {
		this(90,67);
		String name= "Adinath";
		
	}
	void display() {
		int a=900;
		System.out.println("Local a :"+a); //900
		System.out.println("Instance a :"+this.a); //90
		System.out.println("Instance b :"+this.b); //67
		addition(this); 	//This process is for same object
		//this.addition(this);
	}
	
	ThisDemo displayValues() {
		this.a+=10;
		this.b+=10;
		return this;	// it will return current object
	}
	
	void addition(ThisDemo obj) {
		this.a= this.a + obj.a;	 //  90+20
		this.b= this.b +obj.b;	 // 67+30
	}
	
	/*
	void addition(ThisDemo obj)
	{
		obj.a= obj.a+obj.a;	
	}*/

	public static void main(String[] args) 
	{
		ThisDemo obj1 = new ThisDemo(20,30); //a=20 & b=30
		ThisDemo obj2 = new ThisDemo(); 	 //local a=900 & instance a=90  & b=67
		
		System.out.println("-----------------This process is for same object 1-------------------------------");
		System.out.println("Before :"+obj1.a+" "+obj1.b);
		obj1.display();
		System.out.println("After :"+obj1.a+" "+obj1.b);
		
		System.out.println("-----------------object 2-------------------------------");
		
		System.out.println("Before :"+obj2.a+" "+obj2.b);
		obj2.display();
		System.out.println("After :"+obj2.a+" "+obj2.b);
		
		/*
		System.out.println("-----------------This process is for different object-------------------------------");
		obj2.display();		// This process is for different object
		
		System.out.println("Before :"+obj1.a+" "+obj1.b); // a-20 & b-30
	
		obj1.addition(obj2);
	
		System.out.println("After :"+obj1.a+" "+obj1.b); // a=90+20 & b= 67+30
		*/
		
		System.out.println("--------------------------It will return current object----------------------------------");
		
		ThisDemo obj3 = obj2.displayValues();
		System.out.println(obj3.a+" "+obj3.b);
		System.out.println(obj2.a+" "+obj2.b);
		
	}
}
