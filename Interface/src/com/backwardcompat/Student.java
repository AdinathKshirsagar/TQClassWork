package com.backwardcompat;

public interface Student {

	void addStudent();
	default void payFees(double amount)
	{
		System.out.println("Fees Paid");
		display();
	}
	
	static void scholars()
	{
		System.out.println("I am scholar");
		
	}
	
	private void display()
	{
		System.out.println("I am a student");
	}
	
}

