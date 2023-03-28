package com.varags;

public class Varags {
	public static void display(int ar[]) {
		for(int i:ar) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void displayVargs(int ...ar) {
		for(int i:ar) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {4,3,6,7,8,2};
		int arr1[]= {8,9,4,5};
		int arr2[]= {6,7,8};
		display(arr);
		display(arr1);
		display(arr2);
		System.out.println("_____________________________");
		displayVargs(8,7,5,6,4);
		displayVargs(7,5,6);
		displayVargs(5,6);
		
	}

}
