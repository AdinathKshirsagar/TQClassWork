package com.TreeSet;

import java.util.TreeSet;

public class TreeSetEmployee2 {

	public static void main(String[] args) {

    TreeSet<Employee> ts= new TreeSet<>(new NameComparator());
    ts.add(new Employee(101, "Sagar", 9000f));
    ts.add(new Employee(102, "Pritish", 7500f));
    ts.add(new Employee(103, "Bhushan", 20000f));
    ts.add(new Employee(104, "Vivek", 12000f));
 
    for(Employee e: ts)
    {
    	System.out.println(e);
    }

	}

}

