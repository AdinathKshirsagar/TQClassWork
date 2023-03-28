package com.joiningDate;

public class EmployeeTest {

	public static void main(String[] args) {
		
		JoiningDate date1 = new JoiningDate(2,3,2023);
	    JoiningDate date2= new JoiningDate(1,5,2023);
	    JoiningDate date3= new JoiningDate(7,6,2023);
	    
	    Employee emp[]= new Employee[6];
	    emp[0]= new Employee(1, "Gaurav",70000f, date3);
	    emp[1]= new Employee(2, "Priya", 40000f, date2);
	    emp[2]= new Employee(3,"Vivek",75000f,date1);
	    emp[3]= new Employee(4,"Bhushan",77000f,date2);
	    emp[4]= new Employee(5,"Yashank",65000f,date2);
	    emp[5]= new Employee(6,"Mamta",95000f,date1);
	    
	    System.out.println("Joining Date :"+date2);
	      for(int i=0;i<emp.length;i++)
	      {
	        if(emp[i].getJoiningDate()==date2)
	        {
	        	System.out.println(emp[i]);
	        }

	      }
	      
	}

}
