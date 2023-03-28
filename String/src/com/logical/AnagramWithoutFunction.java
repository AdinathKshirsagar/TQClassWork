package com.logical;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramWithoutFunction {
	
	public static boolean checkAnagram(String s1,String s2)
	{
		boolean flag= false;
		
		s1= s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length())
		{
			char ch1[]=s1.toCharArray();
			char ch2[]= s2.toCharArray();
			
			//sort
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2))
				flag=true;
		}
		return flag;
	}

	public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      
      System.out.println("Enter first string:");
      String str1= sc.next();
      
      System.out.println("Enter second string:");
      String str2= sc.next();
      
      boolean status= checkAnagram(str1, str2);
      
      if(status)
      {
    	  System.out.println("The strings are anagram");
      }
      else
      {
    	  System.out.println("The strings are not anagram");
      }

	}

}
