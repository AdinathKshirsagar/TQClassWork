package com.TypePromotion;

public class TypePromotionDemo {
	
	static double add(int a, double b)
	{
		System.out.println("In method 1");
		return (a+b);
	}
	
	static float add(long l, float b)
	{
		System.out.println("In method 2");
		return (l+b);
	}
	
	static float add(float a)
	{
		System.out.println("In method 3");
		return (a);
	}
	
	/*static char add(char a)
	{
		System.out.println("In method 4");
		return (a);
	}
	*/


	public static void main(String[] args) {
		
		System.out.println(TypePromotionDemo.add(9, 7.8));
		System.out.println(TypePromotionDemo.add('s'));
		
		// ambiguity
		/*
		 * System.out.println(TypePromotionDemo.add(9, 7.8f));
		 */

	}

}
