package com.customarraylistComparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> elist = new ArrayList<>();
	     elist.add(new Employee(101,"Suyog",85559f,22));
	     elist.add(new Employee(102,"Vivek",73538f,23));
	     elist.add(new Employee(103,"Sagar",34589f,24));
	     elist.add(new Employee(104,"Aditya",65667f,23));
	     elist.add(new Employee(105,"Mamta",598657f,24));
	     
	     for(Employee e : elist)
	     {
	    	 System.out.println(e);
	     }
	     
	     //Collections.sort(elist, new SalaryComparator());
	     //Collections.sort(elist, new NameComparator());
	     Collections.sort(elist, new AgeComparator());
	     System.out.println("====================================================");

	     for(Employee e : elist)
	     {
	    	 System.out.println(e);
	     }
	}

}
