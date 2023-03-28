package com.innerclass;
class Mall
{
	private String mallName="Pacific";
	private String location="Pune";
	
	void doShopping()
	{
		class Cart
		{
			String item;
			float price;
			static float bill=0.0f;
			
			public void addBill(String item, float price)
			{
				this.item=item;
				this.price=price;
				System.out.println(this.item +"  "+this.price);
				bill+=price;
			}
			
			public void displayBill()
			{
				System.out.println("-----------------------------------");
				System.out.println("Shopping Mall:"+mallName);
				System.out.println("Total bill:"+bill);
			}
			
		}
		
		Cart c1= new Cart();
		c1.addBill("Laptop", 34000.5f);
		c1.addBill("Charger", 7800.0f);
		c1.addBill("Pendrive", 1000.0f);
		c1.displayBill();
	
	}
	
	
}

public class LocalInner2 {

	public static void main(String[] args) {

       Mall m1 = new Mall();
       m1.doShopping();

	}

}