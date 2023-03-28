package com.mergeArrays;

public class UncommonElementsArray {
	public static void uncommonElement(int a[] , int b[])
	{
		boolean flag;
		System.out.println("Uncommon  elements are : ");
		for(int i=0; i<b.length;i++)
		{
			flag = false;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.print(b[i]+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		int arr1[]= {2,3,4,5,6,7,8};
		int arr2[]= {13,4,15,6,87,8,7,4,34};
		
		uncommonElement(arr1, arr2);
	}

}
