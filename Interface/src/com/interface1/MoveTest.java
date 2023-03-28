package com.interface1;

class Car implements Moveable{
	
	public void move()
	{
		//speed=speed+50;
		System.out.println("Car is moving with speed:"+speed);
	}
	
	public void display()
	{
		System.out.println("5 Gears");
	}

}

class Ball implements Moveable
{
	 public void move()
		{
			System.out.println("Ball is rolling with speed:"+speed);
		}

	 public void display()
	 {
		 System.out.println("Red Color");
	 }
	
}

public class MoveTest
{
	  public static void main(String args[])
	  {
		  
		  Car c1 = new Car();
		  c1.move();
		  c1.display();
		  Ball b1 = new Ball();
		  b1.move();
		  b1.display();
		  
		  
		  Moveable m1;
		  m1= new Car();
		  m1.move();
		// m1.displayGear();
		  
		  m1= new Ball();
		  m1.move();
		  
		  
	  }
	  
}

