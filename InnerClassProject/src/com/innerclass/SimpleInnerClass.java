package com.innerclass;

class Bank
{
	private static String bankName="SBI";
	String bankLocation;
	int regNo;
	
	{
		bankLocation="Delhi";
		regNo= 7856;
	}
	
	void displayBankDetails()
	{
		System.out.println(bankName+" "+bankLocation+" "+regNo);
	}
	
	// class Locker
	class Locker
	{
		int lockerId;
		String custName;
		static int lockerRent=2000;
		
		public  void enterDetail(int id, String name)
		{
			lockerId=id;
			custName= name;
			System.out.println("The locker "+lockerId+" belong to "+custName+" in the bank"+ bankName);
			
			displayBankDetails();
			System.out.println("Locker rent :"+lockerRent);
		}
		
	}
	
	
}


public class SimpleInnerClass {

	public static void main(String args[])
	{
		// 1st way
		Bank bank1= new Bank();
		bank1.displayBankDetails();
		
		Bank.Locker locker1= bank1.new Locker();
		locker1.enterDetail(1, "Shuruti");
		
		
		// 2nd way
		
		Bank.Locker locker2= new Bank().new Locker();
		locker2.enterDetail(2, "Rohit");
		
		System.out.println("---------------");
		//locker2.displayBankDetails();
		
		
		
	}
}