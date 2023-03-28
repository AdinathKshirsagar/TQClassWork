package com.demo1;

public class CountCharacters {
	public static int countCharacter(String str)
	{
		int ct=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				ct++;
			}
		}
		return ct;
	}
	public static void main(String[] args) {
		String s1= "Welcome to java";
		int count = countCharacter(s1);
		System.out.println(s1);
		System.out.println("Number of character "+count);
	}

}
