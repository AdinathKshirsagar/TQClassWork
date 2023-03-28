package com.innerclass;

interface Doable
{
  public void doIt();	
 
}

class Car
{
	public void drive()
	{
		System.out.println("I am driving");
	}
	
}

abstract class Cake
{
   void doBaking()
   {
	   System.out.println("I am baking");
   }


}


public class AnonymousInnerClass {

	public static void main(String[] args) {

      //using interface
		
		Doable d= new Doable() {

			@Override
			public void doIt() {

              System.out.println("I am doing");
				
			}
						
		};
		d.doIt();
		
		
		//using Concrete class
		
		Car c1= new Car() {
			
			public void drive()
			{
				System.out.println("I am driving BMW car");
			}
			
		};
		c1.drive();
		
		//using abstract class
		
		Cake ck= new Cake() {
			
			 void doBaking()
			   {
				   System.out.println("I am baking a pizza");
			   }
			
		};
		ck.doBaking();

	}

}
