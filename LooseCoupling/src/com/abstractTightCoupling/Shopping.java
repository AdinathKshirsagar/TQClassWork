package com.abstractTightCoupling;

public class Shopping {

	public static void main(String[] args) {

      CreditCard c1= new CreditCard(101,"Shuruti",786540,123,9000);
      DebitCard d1= new DebitCard(201,"Shuruti",564566,10000);
      

      c1.payAmount(c1, 3000);
      d1.payAmount(d1, 7000);
      

	}

}

