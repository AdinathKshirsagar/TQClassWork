package com.demo;

public class Anonymous {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Adinath",56443.54f,new Department(101,"HR","pune"));
		Employee e2 = new Employee(2,"Sandy",23344.32f, new Department (101,"HR","mumbai"));
		
		// System.out.println(e1.getDept().getDname());  //get a department name
		System.out.println(e1);
		System.out.println(e2);
	}

}
