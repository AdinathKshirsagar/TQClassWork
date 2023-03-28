package com.CustomTreeMap;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class CustomerOrderTreeMap {

	public static void main(String[] args) {
		 TreeMap<Customer, Order> cmap = new TreeMap<>();
		 
		 cmap.put(new Customer(101,"Adinath",34344), new Order(5,"Pendrive",730f));
		 cmap.put(new Customer(103,"Manas",84944), new Order(2,"Laptop",67000f));
		 cmap.put(new Customer(99,"Prem",94944), new Order(1,"Earphone",4000f));
		 //System.out.println(cmap);
		 // compareTo calls containKey
		 
		 
		 /*
		  * for custom key we need to override hashcode and equals method id hashMap
		 HashMap<Customer, String> hm = new HashMap<>();
		 hm.put(new Customer(101,"Adinath",83783), "Pendrive");
		 hm.put(new Customer(101,"Adinath",34344), "Laptop");
		 System.out.println(hm);*/
		 
		 NavigableSet<Customer> ns = cmap.navigableKeySet();
		 for(Customer c : ns)
		 {
			 System.out.println("___________________________________________________");
			 System.out.println(c);
			 System.out.println(cmap.get(c));
		 }
		 
		 System.out.println("\n_________________________Descending KeySet__________________________");
		 
		 NavigableSet<Customer> nv = cmap.descendingKeySet();
		 for(Customer c : nv)
		 {
			 System.out.println(c);
			 System.out.println(cmap.get(c));
			 System.out.println("___________________________________________________");

		 }
		 
		 
	}

}
