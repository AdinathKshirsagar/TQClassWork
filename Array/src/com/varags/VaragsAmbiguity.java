package com.varags;

public class VaragsAmbiguity {
	public static void display(int a,char ...ch) {
		System.out.println(" a "+a);
		for(char c:ch)
		{
			System.out.print(c+" ");
		}
		System.out.println();
	}
	public static void display(char c,int ...b) {
		System.out.println(" c "+c);
		for(int i:b)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		display(85,'A','B','D','U');
		display('c',8,7,9,5);
		
		// display(85,75,62,85); ambiguity
		
	}

}
