package com.varags;

public class VaragsOverloading {
	public static void display(int ...ar)
	{
		for(int i:ar)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void display(float ...fl) {
		for(float i:fl)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void display(String ...str) {
		for(String i:str)
		{
			System.out.print(i+" ");
		}
		
	}
	public static void main(String[] args) {
		display(8,7,6,4,3,5);
		display(7.8f,4,6f,3);
		display("Hello","Java","World");
		// display(); ambguity
	}

}
