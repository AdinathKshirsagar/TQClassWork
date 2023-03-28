package com.Exception2;

import java.util.Scanner;

public class CustomExceptionDemo2 {

	public static void main(String args[]) throws InvalidAgeException 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age:");
		
		int age= sc.nextInt();
		try
		{
		  if(age<0)
		  {
			throw new InvalidAgeException("The age must be greater than 0");
		  }
		  
		 
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Final code");
	}
	
}
