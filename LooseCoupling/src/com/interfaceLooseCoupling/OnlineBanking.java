package com.interfaceLooseCoupling;

public class OnlineBanking {
	
	int id;
	String name;
	
	
	public OnlineBanking() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public OnlineBanking(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void payAmount(Payment p, double amount)
	{
		p.doTransaction(amount);
	}


	public static void main(String[] args) {

     Payment p1;
     OnlineBanking obj1= new OnlineBanking(1,"Shuruti");
     p1= new CreditCard(7257535,12, 90000);
     p1.doTransaction(3000);
     
     p1= new DebitCard(4243234,4500);
     p1.doTransaction(400);
     
	}

}

