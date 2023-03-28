package com.sorting;

import java.util.Arrays;

public class SortArray {
	public static void sortArrayassending(int arr[]) 
	{
		int temp;
		int size=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second Highest : "+arr[size-2]);
		System.out.println("Second Smallest : "+arr[1]);
	}
	public static void sortArraydesending(int arr[]) 
	{
		int temp;
		int size=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second Smallest : "+arr[size-2]);
		System.out.println("Second Highest : "+arr[1]);
	}
	public static void main(String[] args) {
		int arr[]={6,5,3,7,4,1,10};
		System.out.println(Arrays.toString(arr));
		sortArrayassending(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("_________________________");
		System.out.println(Arrays.toString(arr));
		sortArraydesending(arr);
		System.out.println(Arrays.toString(arr));
	}

}
