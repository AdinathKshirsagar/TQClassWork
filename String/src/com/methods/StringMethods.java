package com.methods;

public class StringMethods {

	public static void main(String[] args) {
	 String st = new String("Adinath"); // heap
	 
	 String s1= "Java is programming"; // String constant pool
	// s1.charAt(5);  // Not allowed
	 System.out.println(s1.charAt(5)); // allow( charAt Method)
	 
	 char ch= s1.charAt(8);
	 System.out.println(ch);
	 
	 char ch1= s1.charAt(s1.length()-1); // Character at the end 
	 System.out.println(ch1);
	 
	 String str1="Adinath";
	 String str2="Akash";
	 String str3="Adinath";
	 
	 System.out.println(str1.compareTo(str2));	// Compare Method
	 System.out.println(str1.compareTo(str3));
	 
	 String sub1= s1.substring(1,6); 		// Substring Method (between the range String)
	 System.out.println(sub1);
	 
	 String s2= "Java is programming";
	 System.out.println(s2.contains("is")); // contains Method
	 
	 String s4= "Java";
	 String s5= "java";
	 
	 System.out.println(s4==s5);				// == Method 
	 System.out.println(s4.equals(s5)); 		//  .equals Method
	 
	 System.out.println(s4.equalsIgnoreCase(s5));	// .equalsIgnoreCase Method
	 
	 System.out.println(s4.toLowerCase()); 	// toLowerCase Method
	 System.out.println(s4);				// it will not change (Immutable)
	 System.out.println(s4.toUpperCase());	// toUpperCase Method
	 
	 
	 System.out.println(s4.indexOf('a'));	// indexOf Method
	 System.out.println(s4.lastIndexOf('a')); 	// from backside it will take index
	 
	}

}
