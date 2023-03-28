package com.demo;

enum MovieSeat {
	
    STANDARD(300), PREMIUM(400), RECLINER(550);
	
    int price;
	MovieSeat(int price) { // internally private
      
		this.price=price;
	}
	
	void display()
	{
		System.out.println("Default method");
	}
}
	
public class EnumDemo3
{
	public static void main(String[] args) {

		for(MovieSeat m:MovieSeat.values())
		{
			System.out.println(m+" "+m.price);
			m.display();
		}	


 }
	
}
