package com.logical;

public class PalindromeWthoutReverse {
	public static void checkPalindrome(String str) {
		str= str.toLowerCase();
		boolean isPalindrome=true;
		char ch[]=str.toCharArray();
		
		for(int i=0,j=str.length()-1; i<str.length()/2 ;i++,j--)
		{
			if(ch[i]!=ch[j])
			{
				isPalindrome=false;
				break;
			}
		}
		System.out.println(str);
		if(isPalindrome)
		{
			System.out.println("It is Palindrome ");
		}
		else
		{
			System.out.println("It is not Palindrome ");
		}
	}
	public static void main(String[] args) {
		String str = "YoB anana Boy";
		
		checkPalindrome(str);
	}

}
