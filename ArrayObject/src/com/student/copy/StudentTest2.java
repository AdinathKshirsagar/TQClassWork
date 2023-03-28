package com.student.copy;
import java.util.Scanner;

public class StudentTest2 {
	
	public static void checkTopper(Student st[])
	{
	  float maxTotal=Float.MIN_VALUE;
	  float total;
	  float m[];
	  Student ms=null;
	  for(Student s:st)
	  {
		  total=0;
		  m= s.getMarks();
		  for(int i=0;i<m.length;i++)
		  {
			  total+=m[i];
		  }
		  
		  if(total>maxTotal)
		  {
			  maxTotal= total;
			  ms= s;
	      }
	  }
	   
	  System.out.println("==============================");
	  System.out.println("Topper of the session:");
	  System.out.println(ms);
		
	}

	public static void main(String[] args) {
		
	  Scanner sc= new Scanner(System.in);	

      Student stud[]= new Student[3];
      
      float m1[] ;
      
      for(int i=0;i<3;i++)
      {
    	 stud[i]= new Student();
    	  
    	System.out.println("Enter id:");
  		stud[i].setId(sc.nextInt());
  		
  		System.out.println("Enter name:");
  		stud[i].setName(sc.next());
  		
  		m1= new float[3];
  		
  		System.out.println("Enter marks:");
  		for(int j=0;j<m1.length;j++)
  		 {
  			System.out.println("Subject "+(j+1)+":");
  			m1[j]= sc.nextFloat();
  			
  		 }
  		
  		stud[i].setMarks(m1);
  		
      } 
      
      for(Student s: stud)
      {
    	  System.out.println(s);
      }
      
      checkTopper(stud);

	}

}
