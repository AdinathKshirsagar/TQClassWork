package com.Words;

import java.util.Arrays;

public class CountFrequencyWords {
	public static void countFrequency(String str)
	{
		str=str.toLowerCase();
		String words[] = str.split("\\s");
		System.out.println(Arrays.toString(words));
		int count;
		for(int i=0;i<words.length;i++)
		{
			count=1;
			if(words[i].equals("visited")) 
				continue;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="visited";
				}
			}
			System.out.println(words[i]+" "+count);
		}
		
	}
	
	public static void splitLineWords(String str)
	{
		str= str.toLowerCase();
		String lines[]=str.split("\\.");
		System.out.println(Arrays.toString(lines));
		String words[]=null;
		String splitstr[]=new String[15];
		int temp=0;
		for(int i=0;i<lines.length;i++)
		{
			words= lines[i].split(" ");
			System.out.println(Arrays.toString(words));
			for(int j=0;j<words.length;j++)
			{
					splitstr[temp++]=words[j];
			
			}
		}

		System.out.println(Arrays.toString(splitstr));
      for(int k=0;k<temp;k++)
      {
    	  System.out.println(splitstr[k]);
      }
	}
	public static void main(String[] args) {
		String s1="Java is a program. We code logics in Java. Code is important.";
		//countFrequency(s1);
		splitLineWords(s1);
	}

}
