package com.demo;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------Employee 1----------------");
		
		Employee e1 = new Employee();
		System.out.println("Enter the eid :");
		e1.setEid(sc.nextInt());
		System.out.println("Enter the ename :");
		e1.setEname(sc.next());
		System.out.println("Enter the Salary : ");
		e1.setSalary(sc.nextFloat());
		
		Department d = new Department();
		System.out.println("Enter the Dept id :");
		d.setDid(sc.nextInt());
		System.out.println("Enter the Dept name :");
		d.setDname(sc.next());
		System.out.println("Enter the Dept location : ");
		d.setLocation(sc.next());
		
		e1.setDept(d);
		
		System.out.println(e1);
		
		System.out.println("----------------Employee 2----------------");
		
		Employee e2 = new Employee();
		System.out.println("Enter the eid :");
		e2.setEid(sc.nextInt());
		System.out.println("Enter the ename :");
		e2.setEname(sc.next());
		System.out.println("Enter the Salary : ");
		e2.setSalary(sc.nextFloat());
		
		d= new Department();
		
		System.out.println("Enter the Dept id :");
		d.setDid(sc.nextInt());
		System.out.println("Enter the Dept name :");
		d.setDname(sc.next());
		System.out.println("Enter the Dept location : ");
		d.setLocation(sc.next());
		
		e2.setDept(d);
		
		System.out.println(e1);
		System.out.println(e2);
		
	}

}
