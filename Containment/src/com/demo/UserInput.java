package com.demo;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Department d1 = new Department();
		System.out.println("Enter Department id :");
		d1.setDid(sc.nextInt());
		System.out.println("Enter the Department name :");
		d1.setDname(sc.next());
		System.out.println("Enter the Department location :");
		d1.setLocation(sc.next());
		
		Department d2 = new Department();
		System.out.println("Enter Department id :");
		d2.setDid(sc.nextInt());
		System.out.println("Enter the Department name :");
		d2.setDname(sc.next());
		System.out.println("Enter the Department location :");
		d2.setLocation(sc.next());
		
		
		
		System.out.println("---------------Employee-------------------");
		Employee e1 = new Employee();
		
		System.out.println("Enter Employee id : ");
		e1.setEid(sc.nextInt());
		System.out.println("Enter Employee name : ");
		e1.setEname(sc.next());
		System.out.println("Enter Employee salary : ");
		e1.setSalary(sc.nextFloat());
		
		// e1.setDept(d1);  //directly add dept 
		System.out.println("Enter Department id : ");
		int deptid= sc.nextInt();
		if(deptid==d1.getDid()) {
			e1.setDept(d1);
		}
		if(deptid==d2.getDid()) {
			e1.setDept(d2);
		}
		
		System.out.println(e1);
		
	}

}
