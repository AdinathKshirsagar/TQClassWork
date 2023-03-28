package com.abstractTightCoupling;

public class DebitCard extends OnlineBanking{
	
	 int cardNumber;
	 float balance;
	 
	
	public DebitCard() {
		
	}

	public DebitCard(int id, String name, int cardNumber,float balance) {
	    super(id, name);
       this.cardNumber=cardNumber;
        this.balance=balance;

	}

	void payAmount(DebitCard d1, float amount)
	{
		doTranscation(amount);
		
	}
	
	public void doTranscation(float amount) {
		
		if((this.balance-amount)>=500)
		{
			System.out.println("Deedit card debited:"+amount);
			this.balance= this.balance-amount;
		}
		
		
	}
	
}
