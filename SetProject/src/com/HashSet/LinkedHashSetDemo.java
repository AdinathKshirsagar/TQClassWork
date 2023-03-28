package com.HashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> colours = new LinkedHashSet<>();
		
		colours.add("Purple");
		colours.add("blacks");
		colours.add("Blue");
		colours.add("Purple");
		colours.add(null);
		
		for(String s : colours)
		{
			System.out.println(s);
		}
	}

}
