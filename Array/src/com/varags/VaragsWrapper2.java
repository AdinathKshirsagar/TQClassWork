package com.varags;

public class VaragsWrapper2 {
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
	public static void display(Double ...dou) {
		System.out.println("Double ");
		for(Double d:dou)
		{
			System.out.print(d+" ");
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
		display(4f,3f,5,6); // here we pass float value but it will goes in Number class(Parent)
	}

}
