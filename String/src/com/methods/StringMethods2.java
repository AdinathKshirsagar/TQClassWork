package com.methods;

public class StringMethods2 {

	public static void main(String[] args) {
		String s1= "   Java is programming it is interesting subject ";
		s1= s1.trim();			// trim Method
		System.out.println(s1);
	 
		System.out.println(s1.isEmpty());
		s1=s1.replaceAll("is", "has");
		System.out.println(s1);
		s1=s1.replace('g', 'y');
		System.out.println(s1);
		
		System.out.println("=========================================");
		String words[]= s1.split("\\s");	// split on the basis of white spaces
		//String words[]= s1.split("\s",6);
		// String words[]= s1.split("e");
		
		for(String w:words)
		{
			System.out.println(w);
		}
		
		System.out.println("______________________________________________");
		String s4= new String("Java");
		String s5= new String("java");
		String s6= "Java";
		
		System.out.println(s4.equals(s6)); // true it check value
		System.out.println(s4==s5); // it will gives false.(it refer different object)
		System.out.println(s4.equals(s5)); // it will gives false.(it refer different object)
		System.out.println("______________________________________________");
	}

}
