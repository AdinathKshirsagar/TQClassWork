package com.sorting;

import java.util.Arrays;

public class SecondHighestWithoutSorting {
	public static void secondHighest(int arr[])
	{
		int highest= Integer.MIN_VALUE;
		int shighest= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>highest)
			{
				shighest=highest;
				highest=arr[i];
			}
			if((arr[i]<highest)&&(arr[i]>shighest))
			{
				shighest=arr[i];
			}
		}
		System.out.println("Second Highest is :"+shighest);
	}
	public static void main(String[] args) {
			int arr[]= {4,6,3,5,7,2};
			System.out.println(Arrays.toString(arr));
			secondHighest(arr);
	}

}
