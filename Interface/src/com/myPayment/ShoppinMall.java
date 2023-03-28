package com.myPayment;

public class ShoppinMall implements Payment {
	
	int sid;
	String sname;
	double bill;
	
	
	public ShoppinMall() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public ShoppinMall(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
		
	}


	public void pay(double amount)
	{
		amount = amount -(0.1*amount);
		System.out.println(sname);
		System.out.println("Total bill:"+amount);
	}

	public static void main(String[] args) {
		
		ShoppinMall s1= new ShoppinMall(1,"Shuruti");
		s1.pay(8000);

	}

}

