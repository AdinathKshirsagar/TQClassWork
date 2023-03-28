package com.LinkedHashMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo1 {

	public static void main(String[] args) {

      LinkedHashMap<String, Double> lmap= new LinkedHashMap<>();
      lmap.put("Rupali", 78.5);
      lmap.put("Priya", 73.5);
      lmap.put("Vivek", 85.4);
      lmap.put("Uday", 83.5);
      
      for(Map.Entry<String, Double> en: lmap.entrySet())
      {
    	  System.out.println(en.getKey()+"  "+en.getValue());
      }
      
      // keys
      Set<String> names=lmap.keySet();
      Iterator<String> itr= names.iterator();
      while(itr.hasNext())
      {
    	  String k= itr.next();
    	  System.out.println(k+"  "+lmap.get(k));
      }
     
      // values
     Collection<Double> marks= lmap.values();
     Iterator<Double> itr1= marks.iterator();
     while(itr1.hasNext())
     {
   	  System.out.println(itr1.next());
   
     }
     
     
     System.out.println("======================================");
     double m= lmap.get("Priya");
     m=lmap.get("Vivek");
     
     for(Map.Entry<String, Double> en: lmap.entrySet())
     {
   	  System.out.println(en.getKey()+"  "+en.getValue());
     }
      
	}

}
