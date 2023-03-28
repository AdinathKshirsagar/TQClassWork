package com.joiningDate;

public class EmployeeTestSort {
	
	public static void sameJoiningDate(Employee[] emp1)
	{
		// sort the basis of joining date
	      JoiningDate date;
	      for(int i=0;i<emp1.length;i++)
	      {
	    	  if(emp1[i].getJoiningDate()==null)
	    		  continue;
	    	  System.out.println("============================");
	    	  date = emp1[i].getJoiningDate();
	    	  System.out.println(emp1[i]);
	    	  for(int j=i+1;j<emp1.length;j++)
	    	  {
	    		  if(date==emp1[j].getJoiningDate())
	    		  {
	    			  System.out.println(emp1[j]);
	    			  emp1[j].setJoiningDate(null);
	    		  }
	    	  }
	      }
	}
	
	public static void sameSalary(Employee emp2[])
	{
		for(int i=0;i<emp2.length;i++)
		{
			if(emp2[i].getSalary()=='\0')
				continue;
			System.out.println("====================");
			System.out.println(emp2[i]);
			for(int j=i+1;j<emp2.length;j++)
			{
				if(emp2[j].getSalary()==emp2[i].getSalary())
				{
					System.out.println(emp2[j]);
					emp2[j].setSalary('\0');
					
				}
			}
		}
	}
	public static void main(String[] args) {

      JoiningDate date1 = new JoiningDate(2,3,2023);
      JoiningDate date2= new JoiningDate(1,5,2023);
      JoiningDate date3= new JoiningDate(7,6,2023);
      
      Employee emp[]= new Employee[6];
      
      emp[0]= new Employee(1, "Gaurav",70000f, date3);
      emp[1]= new Employee(2, "Priya", 65000f, date2);
      emp[2]= new Employee(3,"Vivek",70000f,date1);
      emp[3]= new Employee(4,"Bhushan",70000f,date2);
      emp[4]= new Employee(5,"Yashank",65000f,date2);
      emp[5]= new Employee(6,"Mamta",95000f,date1);
            
      sameJoiningDate(emp);
      
      System.out.println("======================Salary Sort===========================");
      
      sameSalary(emp);

	}

}
