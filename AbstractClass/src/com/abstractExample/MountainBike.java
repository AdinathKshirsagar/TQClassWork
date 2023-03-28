package com.abstractExample;

public class MountainBike extends Bike {
	
	int gears;
	
	public MountainBike()
	{
	   super();
	}
	
	public MountainBike(String brand, int maxSpeed,int gears)
	{
		super(brand, maxSpeed);
		System.out.println("In param constructor");
		this.gears=gears;
		
	}
	
   void changeSpeed(int speed)
   {
	   maxspeed+=speed;
	   
   }
   	
   
   /*
   void display()
	{
		System.out.println("Mountain Bike:"+brand+"  :"+maxspeed);
	}
   */
   public static void main(String args[])
   {
	   Bike.name="MyShowroom";
	   
	   MountainBike m1= new MountainBike();
	   m1.brand="Honda";
	   m1.maxspeed=800;
	   m1.changeSpeed(200);
	   m1.display();;
	   	   
	   MountainBike m2= new MountainBike("Hayabua",1200,6);
	   System.out.println(m2);
	   m2.changeSpeed(400);
	   System.out.println(m2);
   }
	
}
