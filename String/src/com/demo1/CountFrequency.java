package com.demo1;

public class CountFrequency {
	public static void counFrequency(String s)
	{
		s= s.toLowerCase();
		char ch[]= s.toCharArray();
		int count;
				
		for(int i=0; i<ch.length;i++)
		{
			count=1;
			if((ch[i]=='\0')||(ch[i]==' '))
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
			}
			System.out.println(ch[i]+" "+count);
		}
	}
	public static void main(String[] args) {
		String str= "Special offer of the week at a pet-shop";
		counFrequency(str);
	}

}
