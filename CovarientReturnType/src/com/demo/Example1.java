package com.demo;

class Employee
{
	private int id;
	private String name;
	 float salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	Employee incrSalary()
	{
		this.salary= this.salary+1000;
		return this;
		
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}

class Manager extends Employee
{
	private float exp;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int id, String name, float salary, float exp) {
		super(id, name, salary);
		this.exp=exp;
		
	}
	@Override
	Manager incrSalary()
	{
		this.salary= this.salary+3000;
		return this;
		
	}
	
	}

public class Example1 {

	public static void main(String[] args) {

		
		 Employee e1= new Employee(102, "Priya",45000f);
		 e1= e1.incrSalary();
		 System.out.println(e1);
		 
		 Manager m1= new Manager(103,"Mamta",98000f,5);
		  m1=m1.incrSalary(); 
		  
		  
	}

}

