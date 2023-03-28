package com.demo2;

import java.util.Scanner;

public class NegativeWithZero {
	static Scanner sc = new Scanner(System.in);
	public static void enterElement(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public static void replaceNegative(int arr[])
	{
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=0;
			}
		}
		for(int i:arr) 
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the size ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the element ");
		enterElement(arr);
		System.out.println("New Array of the element ");
		replaceNegative(arr);
	}

}
