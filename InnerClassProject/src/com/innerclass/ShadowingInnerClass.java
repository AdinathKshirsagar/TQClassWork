package com.innerclass;

class Outer1
{
  int a=90;
  
  class Inner1
  {
	  int a=900;
	  
	  void show()
	  {
		  int a=9000;
		  System.out.println(a); // local a
         System.out.println(this.a); // inner a
         System.out.println(Outer1.this.a);
		  
	  }
  }

}


public class ShadowingInnerClass {

	public static void main(String[] args) {
    
		Outer1.Inner1 i1= new Outer1().new Inner1();
		i1.show();


	}

}