package com.demo;

public class EnumDemo {
	public enum Season{WINTER,SUMMER,SPRING,AUTUMN}
	
	public static void main(String[] args) {
		for(Season s: Season.values())
		{
			System.out.println(s);
		}
		System.out.println("Ordinal of Summer : "+Season.SUMMER.ordinal());
	}

}
