package com.joiningDate;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private JoiningDate joiningDate;
	
	public Employee() {
		
	}

	public Employee(int id, String name, float salary, JoiningDate joiningDate) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public JoiningDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(JoiningDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", salary=" + salary + "," + joiningDate;
	}
	
	

}
