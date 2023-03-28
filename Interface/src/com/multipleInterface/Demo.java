package com.multipleInterface;

public class Demo implements Sayable,Printable{
	
	
	public void say() {
		
		System.out.println("I am Demo");
	}

	

	public static void main(String[] args) {

     Printable s1;
      s1= new Demo();
      s1.say();

	}

	

}
