package com.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {

    ArrayList<String> al= new ArrayList<>();
    al.add("Shruti");
    al.add("Adinath");
    al.add("Mamta");
    al.add("Vivek");
    al.add("Mamta");
    al.add("Sagar");
    al.add("Adinath");
    
    System.out.println(al);
    
    HashSet<String> hs= new HashSet<>(al);
    
    System.out.println(hs);

	}

}
