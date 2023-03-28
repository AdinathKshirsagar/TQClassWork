package com.varags;

public class VaragsWrapper {
	public static void display(Object ...obj) {
		System.out.println("Object ");
		for(Object o:obj)
		{
			System.out.print(o+" ");
		}
		
	}
	public static void display(Number ...num) {
		System.out.println("Number ");
		for(Number n:num)
		{
			System.out.print(n+" ");
		}
		
	}
	public static void display(Character ...ch) {
		System.out.println("Character ");
		for(char c:ch)
		{
			System.out.print(c+" ");
		}
		
	}
	
	public static void main(String[] args) {
		display(4,3,5,6);
	}

}
