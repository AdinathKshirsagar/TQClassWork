package com.arraypractice;

public class ReverseArray2 {
	
	static void reverse(int arr[]) {
		int temp[]=new int[arr.length]; 
		int j=0;
		for(int i=(arr.length)-1;i>=0;i--)
		{
			temp[j++]=arr[i];
		}
		
		printArray(temp);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=temp[i];
		}
	}
	static void printArray(int arr[])
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {

      int arr[]= {7,3,5,1,2,9};
      System.out.println("Array :");
      printArray(arr);
      System.out.println();
      System.out.println("Reverse : ");
      reverse(arr);
      System.out.println("\n---ReverseArray---");
      printArray(arr);
    

	}

}