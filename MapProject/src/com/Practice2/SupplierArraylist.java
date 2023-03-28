package com.Practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SupplierArraylist {
	public static void createMap(ArrayList<Supplier> sp)
	{
		HashMap<String, ArrayList<Item>> map = new HashMap<>();
		for(Supplier s : sp)
		{
			String sName= s.getsName();
			if(!map.containsKey(sName))
			{
				map.put(sName, s.getItem());
			}
		}
		for(Map.Entry<String, ArrayList<Item>>en : map.entrySet())
		{
			System.out.println("Supplier Name : "+en.getKey());
			System.out.println("--------------------------------------");
			for(Item it : en.getValue())
			{
				System.out.println(it);
			}
			System.out.println("--------------------------------------");
		}
		addItem(map);
	}
	
	public static void addItem(HashMap<String,ArrayList<Item>> map1)
	{
		
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item(4,"EarPhone"));
		list.add(new Item(5,"NoteBook"));
		
		String sup="Adinath";
		 
		if(!map1.containsKey(sup))
		{
			map1.put(sup, list);
		}
		else
		{
			list.addAll(map1.get(sup));
			map1.put(sup, list);
		}
			
		
		
		for(Map.Entry<String, ArrayList<Item>> en:map1.entrySet())
		{
              System.out.println(en.getKey());
              System.out.println("---------------");
              for(Item s:en.getValue())
              {
            	  System.out.println(s);
              }
               System.out.println("=============================================");

		}
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Item> item1= new ArrayList<>();
		item1.add(new Item(101,"Laptop"));
		item1.add(new Item(102,"Mobil"));
		item1.add(new Item(103,"Charger"));
		
		ArrayList<Item> item2= new ArrayList<>();
		item2.add(new Item(101,"HeadPhone"));
		item2.add(new Item(102,"Fan"));
		item2.add(new Item(103,"Bulb"));
		
		ArrayList<Item> item3= new ArrayList<>();
		item3.add(new Item(101,"Chair"));
		item3.add(new Item(102,"Books"));
		item3.add(new Item(103,"Tv"));
		
		ArrayList<Supplier> sp1 = new ArrayList<>();
		sp1.add(new Supplier(801,"Pritish",item1));
		sp1.add(new Supplier(802,"Adinath",item2));
		sp1.add(new Supplier(803,"Vivek",item3));
		
		createMap(sp1);
				
	}

}
