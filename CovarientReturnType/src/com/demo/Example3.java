package com.demo;

class Vehicle
{
	 int speed;
	 
	 Vehicle changeSpeed()
	 {
		 speed=speed+10;
		 return this;
	 }
	
	 void displaySpeed()
	 {
		 System.out.println(speed);
	 }

}

class Car extends Vehicle
{
	
	 Car changeSpeed()
	 {
		 speed=speed+50;
		 return this;
	 }

}
public class Example3 {

	public static void main(String[] args) {

      Car c1= new Car();
      c1= c1.changeSpeed();
      c1.displaySpeed();
      c1= c1.changeSpeed();
      c1.displaySpeed();
		
	}

}

