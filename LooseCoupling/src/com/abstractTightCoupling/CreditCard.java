package com.abstractTightCoupling;

public class CreditCard extends OnlineBanking{
	
	 int cardNumber;
	 int cvv;
	 float balance;
	 
	
	public CreditCard() {
		
	}

	public CreditCard(int id, String name, int cardNumber, int cvv,float balance) {
	    super(id, name);
       this.cardNumber=cardNumber;
       this.cvv=cvv;
       this.balance=balance;

	}

	void payAmount(CreditCard c1, float amount)
	{
		doTranscation(amount);
		
	}
	
	
	public void doTranscation(float amount) {
		
		if((this.balance-amount)>=0)
		{
			System.out.println("Credit card debited:"+amount);
			this.balance= this.balance-amount;
		}
		
		
	}
	

}

