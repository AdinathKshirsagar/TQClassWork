package com.CustomTreeMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByValuesTreeMap {
		public static void sortByPrice(TreeMap<Customer, Order> tm)
		{
			ArrayList<Order> al = new ArrayList<>(tm.values());
			Collections.sort(al,new PriceComparator());
			
			LinkedHashMap<Customer, Order> lhm = new LinkedHashMap<>();
			Iterator<Order> itr= al.iterator();
			while(itr.hasNext())
			{
				Customer c= null;
				Order o = itr.next();
				for(Map.Entry<Customer, Order> en : tm.entrySet())
				{
					if(o.equals(en.getValue()))
					{
						c=en.getKey();
						if(!lhm.containsKey(c))
						{
							lhm.put(c, o);  
						}
					}
				}
			}
			for(Map.Entry<Customer, Order>en : lhm.entrySet())
			{
				System.out.println(en.getKey());
				System.out.println(en.getValue());
			}
		}
	
		public static void main(String[] args) {
			TreeMap<Customer, Order> cmap = new TreeMap<>(new NameComparator());
			 
			 cmap.put(new Customer(101,"Adinath",34344), new Order(5,"Pendrive",730f));
			 cmap.put(new Customer(103,"Manas",84944), new Order(2,"Laptop",67000f));
			 cmap.put(new Customer(99,"Prem",94944), new Order(1,"Earphone",4000f));
			 
			 for(Map.Entry<Customer, Order>en : cmap.entrySet())
			 {
				 System.out.println(en.getKey());
				 System.out.println(en.getValue());
			 }
			 System.out.println("__________________________By Price ________________");
			 sortByPrice(cmap);
		}
}
