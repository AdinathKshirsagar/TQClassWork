package com.Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterationInMap {

	public static void main(String[] args) {
		HashMap<String , Double> smap= new HashMap<>();
		smap.put("Suyog", 99.0);
		smap.put("Adinath", 85.5);
		smap.put("Pritish", 77.0);
		smap.put("Adinath", 80.3);
		smap.put(null, null);
		smap.put("Shruti", null);
		
		System.out.println(smap);
		System.out.println("______________________All Keys_______________________________");
		
		Set<String> keyset = smap.keySet();
		
		for(String key : keyset)
		{
			System.out.println(key);
		}
				
		System.out.println("__________________________All Values____________________________");
		
		Collection<Double> marks= smap.values();
		for(Double m : marks)
		{
			System.out.println(m);
		}
		
		System.out.println("_________________________Key Value Pairs______________________________");
		
		Set<String> key1 = smap.keySet();
		Iterator<String> itr = key1.iterator();
		
		while(itr.hasNext())
		{
			String k=itr.next();
			System.out.println(k+" : "+smap.get(k));
		}
		
		System.out.println("____________________________Entry Set____________________________________");
		
		Set<Entry<String,Double>> entrySet= smap.entrySet();
		
		for(Entry<String , Double> e : entrySet)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		System.out.println("_________________________Size of Map___________________________________");
		
		System.out.println(smap.size());
		
					// check key
		System.out.println(smap.containsKey("Shruti"));
					// check value
		System.out.println(smap.containsValue(88.6));
		
					// add if key is not present ;
		smap.putIfAbsent("Rohit", 75.6);
		System.out.println(smap);
		smap.putIfAbsent("Rohit", 88.6);
		System.out.println(smap);
					// remove
		smap.remove("Rohit");
		System.out.println(smap);
		smap.remove("Suyog",88.6); // It is not removed
		System.out.println(smap);
		smap.replace("Suyog", 99.0, 87.4);
		System.out.println(smap.replace("Suyog", 99.0,77.63)); // it return boolean type value
		System.out.println(smap);
	}

}
