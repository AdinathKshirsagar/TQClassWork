package com.mergeArrays;

public class StringUncommonElements {
	
	public static void uncommonElement(String str1[] ,String str2[])
	{
		
		boolean flag;
		System.out.println("Uncommon  elements in Second array is : ");
		for(int i=0;i<str2.length;i++)
		{
			flag = false;
			for(int j=0;j<str1.length;j++)
			{
				if(str2[i]==str1[j])
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println(str2[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		String str1 []= {"adinath@gmail.com","satish@gmail.com","rani@gmail.com","rajesh@gmail.com"};
		String str2[]= {"rani@gmail.com","sandhya@gmail.com","manas@gmail.com","rajesh@gmail.com","satish@gmail.com"};
		
		uncommonElement(str1, str2);
	}

}
