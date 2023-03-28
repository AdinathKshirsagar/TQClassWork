package com.mergeArrays;

import java.util.Scanner;

public class MergeArray {
	static Scanner sc = new Scanner(System.in);
	public static void enterArray(int ar[])
	{
		System.out.println("Enter the element ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
	}
	public static void printArray(int ar[])
	{
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
	}
	public static int[] mergeArray(int arr1[],int arr2[])
	{
		int size1= arr1.length;
		int size2= arr2.length;
		int marr[]=new int[size1+size2];
		int i,j;
		int k=0;
		for(i=0,j=0;i<size1&& i<size2;i++,j++)
		{
			marr[k++]=arr1[i];
			marr[k++]=arr2[j];
		}
		// Remaining Element
		while(i<size1)
		{
			marr[k++]=arr1[i++];
		}
		while(j<size2)
		{
			marr[k++]=arr2[j++];
		}
		return marr;
	}
	public static void main(String[] args) {
		int arr1[]=new int[5];
		int arr2[]=new int[4];
		enterArray(arr1);
		enterArray(arr2);
		int marr[]=mergeArray(arr1, arr2);
		
		printArray(marr);
	}

}
