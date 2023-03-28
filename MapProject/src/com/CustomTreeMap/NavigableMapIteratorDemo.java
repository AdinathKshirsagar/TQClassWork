package com.CustomTreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapIteratorDemo {

	public static void main(String[] args) {
		 TreeMap<Customer, Order> cmap = new TreeMap<>();
		 
		 cmap.put(new Customer(101,"Adinath",34344), new Order(5,"Pendrive",730f));
		 cmap.put(new Customer(103,"Manas",84944), new Order(2,"Laptop",67000f));
		 cmap.put(new Customer(99,"Prem",94944), new Order(1,"Earphone",4000f));
		 
		 NavigableMap<Customer, Order> nmap = cmap.descendingMap();
		 
		 for(Map.Entry<Customer, Order>en : nmap.entrySet())
		 {
			 System.out.println(en.getKey());
			 System.out.println(en.getValue());
		 }
		 
		 
	}

}
