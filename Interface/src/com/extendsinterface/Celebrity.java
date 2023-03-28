package com.extendsinterface;

public class Celebrity implements Person {
	
	String name;
	int rating;
	
	Celebrity()
	{
		
	}
	
	Celebrity(String name,int rating)
	{
		this.name=name;
		this.rating=rating;
	}
	public void showDetail() {

     System.out.println(name+" :"+rating+"*");
		
	}


	public static void main(String[] args) {

      Celebrity c1= new Celebrity("Amitabh",5);
      c1.showDetail();

	}

	
}

