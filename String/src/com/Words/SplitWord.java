package com.Words;

import java.util.Scanner;

public class SplitWord {
	public static void splitWord(String str)
	{
		int noOfWord=0;
		String word[]=str.split("\\s");
		for(String w : word)
		{
			System.out.println(w);
			noOfWord++;
		}
		System.out.println("No of Words "+noOfWord);
	}
	
	public static void splitWordWithoutMethod(String str)
	{
		String word="";
		String splitstr[]=new String[20];
		int temp=0;	// Store a index
		str=str+' ';	// to get the last word
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				word=word+str.charAt(i);
			}
			else // found a space 
			{
				// to store the word
				splitstr[temp]=word;
				temp++;
				word="";
			}
		}
		for(int i=0;i<temp;i++)
		{
			System.out.println(splitstr[i]);
		}
		System.out.println("Number of words "+temp);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Line");
		String str = sc.nextLine();
		
		//splitWord(str);
		splitWordWithoutMethod(str);
		
	}

}
