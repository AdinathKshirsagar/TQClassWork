package com.arraypractice;

public class EvenElement {
	public static void Even(int ar[]) {
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
			if(ar[i]%2==0) 
			{
				System.out.println("EvenElement : "+ar[i]);
			}
			
		}
	}
	
	public static void sumEven(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
		}
		arr[1]=78;
		System.out.println("Sum of even numbers:"+sum);
	}
	
	public static int sumOdd(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				sum=sum+arr[i];
				System.out.println("Odd numbers:"+arr[i]);
			}
		}
		return sum;
	}
	
	static long productArray(int arr[]) {
		int product =1;
		for(int i:arr)
		{
			product=product*i;
		}
		return product;
	}
	
	public static void main(String[] args) {
		int arr1[]= {3,5,6,7,2,11};
		
		System.out.println("Length of array :"+arr1.length);
		Even(arr1);
		
		System.out.println(arr1[1]);
		sumEven(arr1);
		System.out.println(arr1[1]);
		
		int sumOdd=sumOdd(arr1);
		System.out.println(sumOdd);
		System.out.println("Sum of Odd numbers:"+sumOdd(arr1));
		
		System.out.println("Product :"+productArray(arr1));
	}

}
