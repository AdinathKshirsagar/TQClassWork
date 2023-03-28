package com.demo;

import java.util.Arrays;
import java.util.Spliterator;

public class DivideEqualParts {
	public static void divideParts(String st) {
		int len= st.length();
		int n =2;
		int noOfChar=len/n;
		
		String splistr[]= new String [n];
		int temp=0;
		if(len%n!=0)
		{
			System.out.println("Cannot divide the String into equal parts");
		}
		else
		{
			for(int i=0;i<st.length();i+=noOfChar)
			{
				splistr[temp]=st.substring(i,i+noOfChar);
				temp++;
			}
			System.out.println(Arrays.toString(splistr));
		}
		
	}
	public static void main(String[] args) {
		String str = "Progrm";
		System.out.println(str);
		divideParts(str);
	}

}
