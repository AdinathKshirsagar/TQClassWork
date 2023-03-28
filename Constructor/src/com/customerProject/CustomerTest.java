package com.customerProject;

import java.util.Scanner;

public class CustomerTest {
	
	public static void enterItemDetails(Customer c)
	{
		
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

      Customer c1= new Customer();
      Customer c2= new Customer(101,"Sagar","9077467865");
      Customer c3= new Customer(102,"Adinath","7867545680","DellLaptop",78000.60f,"FullPaid");

      int choice;
      
          
      System.out.println("-------------------------------------------");
      
      //for customer 1
      System.out.println("enter the id:");
      c1.setCid(sc.nextInt());
      
      System.out.println("enter the name:");
      c1.setName(sc.next());
      
      System.out.println("enter the phone number:");
      c1.setPhoneNumber(sc.next());
      
      System.out.println("Do you want to purchase item(1-yes/0-no):");
      choice= sc.nextInt();
      if(choice==1)
      {
    	  System.out.println("Enter the item name:");
    	  c1.setItemName(sc.next());
    	  
    	  System.out.println("Enter the price:");
    	  c1.setPrice(sc.nextFloat());
    	  
    	  System.out.println("Enter the payment status:");
    	  c1.setStatus(sc.next());
      }
      
      
      // for customer 2
      System.out.println("----------------------------");
      
      System.out.println(c2);
      System.out.println("Do you want to purchase item(1-yes/0-no):");
      choice= sc.nextInt();
      if(choice==1)
      {
    	  System.out.println("Enter the item name:");
    	  c2.setItemName(sc.next());
    	  
    	  System.out.println("Enter the price:");
    	  c2.setPrice(sc.nextFloat());
    	  
    	  System.out.println("Enter the payment status:");
    	  c2.setStatus(sc.next());
      }
      
      
      
      System.out.println("----------------------------");
      
      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c3);
      
      
	}

}