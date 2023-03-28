package com.innerclass;
class Outer
{
 private static int data=10;

 void display()
 {
	 class LocalInner
	 {
		 private int value=90;
		 
		static void show()
		 {
			 System.out.println(data);
			
		 }
		
		void show1()
		{
			System.out.println(value);
		}
		 
	 }
	 System.out.println("In local inner"); 
	 LocalInner l1= new LocalInner();
	 l1.show1();
	 l1.show();
	 
 }
 

}
public class LocalInnerClass {

	public static void main(String[] args) {

      Outer o1= new Outer();
      o1.display();
		
	}

}