package com.myPayment;

public class PersonTax implements Payment{
	
	public void pay(double amount)
	{
		double tax;
		tax= 0.3* amount;
		System.out.println("Pay the tax:"+tax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

