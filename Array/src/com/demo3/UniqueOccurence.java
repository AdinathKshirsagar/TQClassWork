package com.demo3;

public class UniqueOccurence {
	
	public static void uniqueElement(int arr[]) {
		int count;
		int ucount=0;
		for(int i=0;i<arr.length;i++)
		{
			count =1;
			if(arr[i]=='\0')
			{
				continue;
			}
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]='\0';
				}
			}
			if(count==1) {
				System.out.println("Unique Element are "+ arr[i]+" is "+count);
				ucount++;

			}
		}
		System.out.println("Unique Element Occurence "+ucount);
	}
	public static void main(String[] args) {
		
		int arr[]= {3,4,5,4,6,6,7,8,9,3};
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		uniqueElement(arr);
	}

}

