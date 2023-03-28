package com.abstractExample;

public abstract class Bike {
    
	String brand;
	int maxspeed;
	
	static String name;
	
	public Bike()
	{
		System.out.println("In abstract default constructor");
		brand="Honda";
		maxspeed=50;
	}
	
	public Bike(String brand,int maxSpeed)
	{
		System.out.println("In abstract param constructor");
		this.brand=brand;
		this.maxspeed=maxSpeed;
	}
	
	abstract void changeSpeed(int speed);
	
	void display()
	{
		System.out.println(brand+"  :"+maxspeed);
	}
	
	final void show()
	{
		System.out.println("My Bike");
	}
	
	public String toString()
	{
		return brand+"  "+maxspeed;
	}
	
	/*
	//cannot  create object of abstract class
	public static void main(String args[])
	{
		Bike b1;
		b1= new Bike();
		
	}
	*/
	
}
