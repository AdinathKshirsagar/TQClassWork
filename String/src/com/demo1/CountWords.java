package com.demo1;

public class CountWords {
	public static int countWords(String s)
	{
		int ct=1;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
				{
					ct++;
				}
			}
		
		return ct;
	}
	public static void main(String[] args) {
		String s1= "This is a text file. I am reading a book";
	     int count= countWords(s1);
	     System.out.println(s1);
	     System.out.println("Number of words:"+count);
	}

}
