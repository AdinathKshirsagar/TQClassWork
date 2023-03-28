package com.demo2;

import java.util.Scanner;

public class FirstOccurence {
	static Scanner sc = new Scanner(System.in);
	public static void enterArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public static void searchElement(int arr[],int value)
	{
		boolean status = false;
		for(int i: arr)
		{
			if(i==value)
			{
				status=true;
				break;
			}
		}
		if(status)
		{
			System.out.println("Element is Present");
		}else
		{
			System.out.println("Element is Not Present");
		}
	}
	public static void searchElementPosition(int arr[],int value)
	{
		boolean status=false;
		int posi=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				status=true;
				posi=i;
				break;
			}
		}
		if(status)
		{
			System.out.println("Element is Present " +posi);
		}else
		{
			System.out.println("Element is Not Present");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int arr[]= new int[size];
		
		System.out.println("Enter the Element");
		enterArray(arr);
		
		System.out.println("Enter the Element to be Search :");
		int value= sc.nextInt();
		
		//searchElement(arr, value);
		searchElementPosition(arr, value);
	}

}
