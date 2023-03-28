package com.sorting;

import java.util.Arrays;

public class SecondSmallestWithoutSorting {
	public static void secondSmallest(int arr[])
	{
		int smallest= Integer.MAX_VALUE;
		int secondSmall= Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				secondSmall=smallest;
				smallest=arr[i];
			}
			if((arr[i]>smallest)&&(arr[i]<secondSmall))
			{
				secondSmall=arr[i];
			}
		}
		System.out.println("Second Highest is :"+secondSmall);
	}
	public static void main(String[] args) {
			int arr[]= {4,6,3,5,7,2};
			System.out.println(Arrays.toString(arr));
			secondSmallest(arr);

	}

}
