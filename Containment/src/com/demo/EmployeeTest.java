package com.demo;

public class EmployeeTest {

	public static void main(String[] args) {
		Department d1 = new Department(101, "HR","pune");
		Department d2 = new Department(201,"Sales","mumbai");
		
		Employee e1 = new Employee(1,"Anu",56875.65f,d1);
		Employee e2 = new Employee(2,"Kavi",42453.34f,d2);
		Employee e3 = new Employee(3, "Anand",94549.32f,d1);
		Employee e4 = new Employee(4,"Pranjal",84733.43f,d2);
		
		if(e1.getSalary()>50000) {
			System.out.println(e1);
		}
		if(e2.getSalary()>50000) {
			System.out.println(e2);
		}
		if(e3.getSalary()>50000) {
			System.out.println(e3);
		}
		if(e4.getSalary()>50000) {
			System.out.println(e4);
		}
		
	}

}
