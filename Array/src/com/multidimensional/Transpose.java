package com.multidimensional;

public class Transpose {
	public static void calTranspose(int arr[][])
	{
		int rows=arr.length;
		System.out.println(rows);
		int col=arr[0].length;
		System.out.println(col);

		int tarr[][]=new int[col][rows];
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<rows;j++)
			{
				tarr[i][j]=arr[j][i];
			}
		}
		System.out.println("Transpose is");
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<rows;j++)
			{
				System.out.print(tarr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[][]= {	{1,2,3},
					  	{6,0,7}
					 };
		calTranspose(arr);
	}

}
