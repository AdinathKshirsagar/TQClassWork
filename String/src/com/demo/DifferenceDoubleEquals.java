package com.demo;

public class DifferenceDoubleEquals {

	public static void main(String[] args) {
		String s1 = new String("Hello"); // object (heap memory)
		String s2 = "Hello"; // String literal (String constant pool)
		String s3 = "Hello";
		
		System.out.println(s1==s2);
		System.out.println(s2.equals(s3));
	}

}
