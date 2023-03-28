package com.arraypractice;

import java.util.Scanner;

public class UserArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sub[]= new float[5];
		for(int i=0; i<5;i++) {
			System.out.println("Enter the subject marks :"+(i+1)+" : ");
			sub[i]=sc.nextFloat();
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Subject marks "+(i+1)+" : "+sub[i]);
		}
	}

}
