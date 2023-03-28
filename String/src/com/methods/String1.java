package com.methods;

public class String1 {

	public static void main(String[] args) {
		// String immutable
		String s1= "Java";
		
		System.out.println(s1);
		s1.concat("Programming");
		s1=s1.concat(" Programming"); 	// concat
		System.out.println(s1);
		
		char ch[] = {'A','j','a','y'};
		String s2= new String(ch);	// character to String 
		System.out.println(s2);
		
		String str = "Creating a character array ";
		char c[] = str.toCharArray(); 	// toCharArray method (String to character)
		for(char cha: c)
		{
			System.out.print(cha+" ");
		}
		
		
	}

}
