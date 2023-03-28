package com.demo;

class ConstantSeason
{
  public static final String SUMMER="SUMMER";
  public static final String WINTER="WINTER";
  public static final String SPRING="SPRING";

 }

public class EnumDemo1 {
	
	public enum Season{SUMMER,WINTER,SPRING,AUTUMN}

	public static void main(String[] args) {

		
		
     for(Season s:Season.values())
     {
    	 System.out.println(s+" "+s.ordinal());
     }
     
     System.out.println("Ordinal of winter:"+Season.WINTER.ordinal());

 	System.out.println(ConstantSeason.SUMMER);

	}
	
}
