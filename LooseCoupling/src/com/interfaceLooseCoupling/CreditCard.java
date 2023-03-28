package com.interfaceLooseCoupling;

public class CreditCard implements Payment{
	
	 int cardNumber;
	 int cvv;
	 double balance;
	 
	
	public CreditCard() {
		
	}

	public CreditCard( int cardNumber, int cvv,double balance) {

       this.cardNumber=cardNumber;
       this.cvv=cvv;
       this.balance=balance;

	}
	
	
	public void doTransaction(double amount) {
		
		if((this.balance-amount)>=0)
		{
			System.out.println("Credit card debited:"+amount);
			this.balance= this.balance-amount;
		}
		
		
	}

	
	

}

