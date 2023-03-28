package com.arraypractice;

import java.util.Scanner;

public class MaxMinarray {
	public static void checkMax(int arr[]) {
		int max=arr[0];
		for(int i:arr)
		{
			if(max<i)
			{
				max=i;
			}
		}
		System.out.println("Maximum number:"+max);
	}
	
	public static void checkMin(int arr[]) {
		int min=arr[0];		// int arr={23,45,85,75,32,10};
							// int i = 23,45,85,75,32,10
		for(int num:arr) 	// int i is a only reference variable and putting the value of arr in i. 
							//and for each loop is use for read only 
		{
			if(min>num) 
			{
				min=num;
			}
		}
		System.out.println("Minimum number:"+min);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		int n= sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the element of Array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		checkMax(arr);
	    checkMin(arr);
		
	}

}
