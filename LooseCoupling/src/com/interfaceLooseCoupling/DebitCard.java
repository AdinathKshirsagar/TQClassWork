package com.interfaceLooseCoupling;

public class DebitCard implements Payment{
	
	 int cardNumber;
	 double balance;
	 
	
	public DebitCard() {
		
	}

	public DebitCard( int cardNumber, double balance) {

       this.cardNumber=cardNumber;
       this.balance=balance;

	}

	
	public void doTransaction(double amount) {
		
		if((this.balance-amount)>=500)
		{
			System.out.println("Dedit card debited:"+amount);
			this.balance= this.balance-amount;
		}
		
		
	}

	
	

}

