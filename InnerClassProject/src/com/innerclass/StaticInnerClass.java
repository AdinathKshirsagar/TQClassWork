package com.innerclass;

class OuterClass
{
   static int value1=90;
   int value2=67;
   
   void display()
   {
	   System.out.println(value1+" "+value2);
   }
   
   static class InnerClass
   {
	   String msg1="Hello";
	   static String msg2="Welcome";
	   
	   void show()
	   {
		   System.out.println(value1);
		  // System.out.println(value2);
		   
		   //display();
		   
		   OuterClass o1= new OuterClass();
		   o1.display();
		   
		   System.out.println(msg1);
		   System.out.println(msg2);
	   }
   }


}

public class StaticInnerClass {

	public static void main(String[] args) {

      OuterClass.InnerClass i1= new OuterClass.InnerClass();
      i1.show();
      
    
      
      

	}

}