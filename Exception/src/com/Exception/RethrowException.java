package com.Exception;

public class RethrowException {
	public static void print(String st) throws LengthException 
	{
		if(st.length()<3)
		{
			throw new LengthException("Length shoulde be greater than 3");
		}
	}
	public static void printLength(String st) throws Exception
	{
		try
		{
			print(st);
			
		}catch(Exception e)
		{
			System.out.println("Inside printLength ");
			throw e;
		}
	}
	public static void main(String[] args) {
		try
		{
			String s = "Ja";
			printLength(s);
		}
		catch(Exception e)
		{
			System.out.println("Caught in main");
			System.out.println(e);
		}
	}

}
