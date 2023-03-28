package com.varags;

public class RulesVarags {
	//Rule 1 : There can be only 1 varags
	/*public static void display(int ...a, String ...b) {
		
	}*/
	
	//Rule 2: Varags has to be last argument
	public static void display(int a, int ...b) {
		System.out.println("a : "+a);
		for(int i:b) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		display(6,5,3,7,4,1,10);
	}

}
