package com.customarraylistComparable;

public class Employee implements Comparable<Employee>{
		private int id;
		private String name;
		private float salary;
		private int age;
		
		public Employee() {
			
		}
		public Employee(int id, String name, float salary, int age) {
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.age = age;
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Employee id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age ;
		}
		
		@Override
		public int compareTo(Employee e) {
			if(salary==e.salary) 
				return (name.compareTo(e.name));
			else
				if(salary>e.salary)
					return 1;
				else
					return -1;
		}
		
}
