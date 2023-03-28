package com.multidimensional;

public class AddMatrix {
	public static void additionMatrix(int m[][],int n[][])
	{
		int rows=m.length;
		int cols=m[0].length;
		int addM[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				addM[i][j]=m[i][j]+n[i][j];
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(addM[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int a[][]={{1,2,4},{5,0,7},{9,1,7}};
		int b[][]={{1,8,4},{2,0,1},{0,2,3}};
		additionMatrix(a, b);
	}

}
