package com.demo1;

public class EvenChar {
	public static void evenChar(String s)
	{
		for(int i=0; i<s.length();i++)
		{
			if(i%2==0)
			{
				System.out.println(s.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		String st= "Why did the spider";
		evenChar(st);
	}

}
