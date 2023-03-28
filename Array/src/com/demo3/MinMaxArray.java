package com.demo3;

import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {
		int min= Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		
		int arr[]= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the number : ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println("Minumun : "+min+" Maximum : "+max);
	}

}
