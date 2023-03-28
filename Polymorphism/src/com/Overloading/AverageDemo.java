package com.Overloading;

import java.util.Scanner;

public class AverageDemo {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String no= sc.next();
	    float average=0.0f;
	    int count=0;
	    
		while(!no.equals("q"))
		{
			average+=Float.parseFloat(no);
			count++;
			no=sc.next();
			
		}
		
		System.out.println(average/count);
		
		
	
	}

}