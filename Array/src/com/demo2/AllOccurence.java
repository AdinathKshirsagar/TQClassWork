package com.demo2;

import java.util.Scanner;

public class AllOccurence {
	static Scanner sc = new Scanner(System.in);
	public static void enterArray(int arr[])
	{
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public static void searchArrayPosition(int arr[],int value)
	{
		boolean status = false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				status=true;
				System.out.println("Element is present at Position "+i);
			}
		}
		if(!status)
		{
			System.out.println("Element is Not Present ");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the size ");
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the element ");
		enterArray(arr);
		System.out.println("Enter element to be searched ");
		int value=sc.nextInt();
		searchArrayPosition(arr, value);
		
	}

}
