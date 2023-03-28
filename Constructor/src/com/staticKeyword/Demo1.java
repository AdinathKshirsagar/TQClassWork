package com.staticKeyword;

public class Demo1 {
	
	int x=0;
	static int y=0;
	/*
	 * we cannot use instance variable in static
	static void increment()
	{
		x++;
		y++;
	}
	*/
	
	static void decrement()
	{
		//static int value =90;
	}
	
	void increment()
	{
		//local variable cannot be static 
		//static int data =90;
		int y=90;
		x++;
	    Demo1.y++;
	    System.out.println(Demo1.y);
	    System.out.println(y);
		
	}

	public static void main(String[] args) {
       
      Demo1 d1= new Demo1();
      d1.increment();
      Demo1 d2= new Demo1();
      d2.increment();
      
      System.out.println("Instance :"+d1.x);
      System.out.println("Static :"+d1.y);
		

	}

}
