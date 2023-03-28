package com.ArrayListLogical2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShiftNegativeElement {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> alist = new ArrayList<>();
		
		System.out.println("Enter a Element : ");
		for(int i=0;i<5;i++) 
		{
			alist.add(sc.nextInt());
		}
		
		ArrayList<Integer> nlist = new ArrayList<>();
		for(int i=0;i<alist.size();i++)
		{
			if(alist.get(i)>=0) 
			{
				nlist.add(alist.get(i));
			}
		}
		for(int i=0;i<alist.size();i++)
		{
			if(alist.get(i)<0)
			{
				nlist.add(alist.get(i));
			}
		}
		System.out.println(alist);
		System.out.println(nlist);
		
	}

}
