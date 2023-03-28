package com.CompiletimeCustomcException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InvalidPasswordException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password :");
		String pass = sc.next();
		try
		{
				if(pass.length()>8 || pass.length()<5)
				{
					throw new InvalidPasswordException("Password must be greater than 5 and less than 9");
				}
				else
				{
					System.out.println("Welcome...");
				}
		}
		catch(InvalidPasswordException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Final method..");
	}

}
