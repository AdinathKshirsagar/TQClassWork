package com.demo2;

import java.util.Scanner;

public class AlternateElementArray {
	static Scanner sc = new Scanner(System.in);
	static void enterElement(int ar[])
	{
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
	}
	
	static void printAlternate(int ar[])
	{
		System.out.println("Alternate elements of array : ");
		for(int i=0;i<ar.length;i++) {
			if(i%2==0)
			{
				System.out.print(ar[i]+" ");
			}
		}
	}
	
	static void printAlternate2(int ar[])
	{
		boolean flag=true;
		for(int i:ar) {
			if(flag)
			{
				System.out.print(i+" ");
			}
			flag=!flag;
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the size of array : ");
		int size= sc.nextInt();
		
		int arr[] = new int[size];
		enterElement(arr);
		
		printAlternate2(arr);
	}

}
