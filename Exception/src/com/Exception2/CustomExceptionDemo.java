package com.Exception2;

import java.util.Scanner;

public class CustomExceptionDemo {

	public static void main(String[] args)	throws VoteAgeException,InvalidAgeException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		try 
		{
			if(age<18)
			{
				try
				{
					if(age<0)
					{
						throw new InvalidAgeException("Age must be greater than 0");
					}
					throw new VoteAgeException("You Cannot Vote...");
					
				}
				catch(InvalidAgeException e)
				{
					System.out.println(e);
				}
				
			}
		}catch(VoteAgeException e)
		{
			System.out.println(e);
		}
		System.out.println("Final code");
	}

}
