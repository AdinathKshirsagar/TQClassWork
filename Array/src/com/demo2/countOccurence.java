package com.demo2;

import java.util.Scanner;

public class countOccurence {
	static Scanner sc = new Scanner(System.in);
	public static void enterElement(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public static void countOccurence(int arr[],int value)
	{
		boolean status = false;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				status=true;
				count++;
			}
		}
		if(!status)
		{
			System.out.println("Element is Not Present ");
		}else
		{
			System.out.println("Element is Present "+ count + " Times");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the size ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the element ");
		enterElement(arr);
		System.out.println("Enter the element to be Count ");
		int value = sc.nextInt();
		
		countOccurence(arr, value);
	}

}
