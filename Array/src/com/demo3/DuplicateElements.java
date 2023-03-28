package com.demo3;

public class DuplicateElements {
	public static void printDuplicate(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='\0') {
				continue;
			}
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]='\0';
					break;
				}
			}
		}
		System.out.println("Number of Duplicate Element is "+count);
		
	}
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,4,7,9,8,0,7};
		for(int i:arr)
		{
			System.out.print(i+" ");	
		}
		System.out.println();
		printDuplicate(arr);
		
	}

}
