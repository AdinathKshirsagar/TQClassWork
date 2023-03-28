package com.arraypractice;

import java.util.Scanner;

public class CharMaxMinArray {
	public static void checkMax(char arr[]) {
		char max=arr[0];
		for(char i:arr)
		{
			if(max<i)
			{
				max=i;
			}
		}
		System.out.println("Maximum Character:"+max);
	}
	
	public static void checkMin(char arr[]) {
		char min=arr[0];		
		for(char num:arr) 	 
		{
			if(min>num) 
			{
				min=num;
			}
		}
		System.out.println("Minimum Character:"+min);
	}
	
	public static void main(String[] args) {
		
		char arr[]= {'A','D','E','x','z','R'};
		
		checkMax(arr);
	    checkMin(arr);
		
	}

}
