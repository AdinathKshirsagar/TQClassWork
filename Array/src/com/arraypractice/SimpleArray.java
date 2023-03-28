package com.arraypractice;

public class SimpleArray {

	public static void main(String[] args) {
		int arr[]; // initialization
		arr=new int[11]; // declaration
		
		int arr1[]= new int [20];
		
		arr1[0]=39;
		arr1[1]=34;
		arr1[2]=65;
		arr1[10]=85;
		
		System.out.println(arr);
		
		for(int i=0; i<10;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
	}

}
