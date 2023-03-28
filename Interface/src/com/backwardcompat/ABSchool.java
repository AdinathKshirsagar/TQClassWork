package com.backwardcompat;

public class ABSchool implements Student{
	
	int id;
	String name;
	static int count=0;
	
		
	public void addStudent()
	{
		this.id=1;
		this.name="Unknown";
		count++;
	}
	
	public void payFees(double amount) {

    System.out.println("Fees paid:"+amount);
		
	}
	
	public static void main(String args[])
	{
		
		
	}


}

