package com.extendsinterface;

public class Manager implements Employee {
	
	private int mid;
	private String name;
	private float salary;
	
	Manager()
	{
		
	}
	
	Manager(int mid, String name)
	{
		this.mid=mid;
		this.name=name;
		
	}
	
	public void showDetail() {
		
		System.out.println("Details:"+mid+ " "+name);
		
	}


	public void showSalary(float salary) {

	 salary= salary-2000;	
     System.out.println("Salary:"+salary);
		
	}
	

	public static void main(String[] args) {

       Employee e1= new Manager(101,"Vivek");
       e1.showDetail();
       e1.showSalary(9800f);
       

	}
	

}

