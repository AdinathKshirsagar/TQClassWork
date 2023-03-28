package com.arrayofobjectcontainment;

public class StudentArray {
	public static void displayAll(Student stud[] )
	{
		Subject subj[];
		System.out.println("Student record : ");
		for(Student st: stud)
		{
			subj= st.getSubject();
			System.out.println(st.getId()+" "+st.getStudName());
			for(Subject sub: subj)
			{
				System.out.println(sub);
			}
			System.out.println("--------------------------------------------------");
		}
	}
	
	public static void displayMarks(Student stud[])
	{
		Subject subj[];
		for(Student su : stud)
		{
			if(su.getStudName().equals("Utkarsh"))
			{
				subj=su.getSubject();
				for(Subject sub : subj)
				{
					System.out.println(sub);
				}
			}
			
		}
		System.out.println("________________________________________________");
	}
	public static void displayNames(Student stud[])
	{
		Subject subj[];
		System.out.println("Math");
		// student having Math subject
		for(Student st: stud) 
		{
			subj=st.getSubject();
			for(Subject sub: subj)
			{
				if(sub.getsName().equals("Math"))
				{
					System.out.println(st.getStudName());
				}
			}
		}
		System.out.println("________________________________________________");
	}
	public static void main(String[] args) {
		Student stud[]=new Student[3];
		
		Subject sb[]=new Subject[3];
		sb[0]= new Subject(1,"English",67f);
		sb[1]= new Subject(2,"Marathi",78f);
		sb[2]= new Subject(3,"Hindi",89f);
		
		stud[0]=new Student(101,"Utkarsh",sb);
		
		Subject sb1[]=new Subject[2];
		sb1[0]= new Subject(2,"Math",78f);
		sb1[1]= new Subject(3,"Computer",89f);
		
		stud[1] = new Student(102,"Rohit",sb1);
		
		Subject sb2[]=new Subject[4];
		sb2[0]= new Subject(1,"English",67f);
		sb2[1]= new Subject(2,"Marathi",78f);
		sb2[2]= new Subject(3,"Hindi",89f);
		sb2[3]= new Subject(3,"Computer",56f);
		
		stud[2] = new Student(103,"Ram",sb2);
		
		displayAll(stud);
		
		displayMarks(stud);
		
		displayNames(stud);
	}

}
