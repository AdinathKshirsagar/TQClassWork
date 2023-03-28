package com.CustomMap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentCourseHashMap {
	public static void createStudentCourse(ArrayList<Student> st)
	{
		HashMap<Course, ArrayList<String>> coursemap = new HashMap<>();
		Iterator<Student> itr = st.iterator();
		ArrayList<String> courseList;
		
		while(itr.hasNext())
		{
			Student s = itr.next();
			if(!coursemap.containsKey(s.getCourse()))
			{
				courseList= new ArrayList<>();
			}
			else {
				courseList=coursemap.get(s.getCourse());
			}
			courseList.add(s.getName());
			coursemap.put(s.getCourse(), courseList);
		}
		for(Map.Entry<Course, ArrayList<String>> en : coursemap.entrySet())
		{
			System.out.println(en.getKey());
			System.out.println("Student List : ");
			courseList = en.getValue();
			for(String cs : courseList)
			{
				System.out.print(cs+" ");
			}
			System.out.println();
			System.out.println("========================================================");
		}
	}
	
	public static void countStudentCourse(ArrayList<Student> st)
	{
		HashMap<Course, Integer> coursemap= new HashMap<>();
		Iterator<Student> itr = st.iterator();
		int count ;
		while(itr.hasNext())
		{
			count=1;
			Student s = itr.next();
			if(!coursemap.containsKey(s.getCourse()))
			{
				coursemap.put(s.getCourse(), count);
			}else {
				count= coursemap.get(s.getCourse());
				coursemap.put(s.getCourse(), count+1);
			}
		}
		for(Map.Entry<Course, Integer> en: coursemap.entrySet())
		{
			
			System.out.println(en.getKey().getcName()+" :"+en.getValue());
			
			System.out.println();
			System.out.println("===========================================================");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Student> stud = new ArrayList<>();
		
		stud.add(new Student(1,"Manish",23,new Course(1,"Java")));
		stud.add(new Student(2,"Samar",20,new Course(2,"Python")));
		stud.add(new Student(3,"Gaurav",24,new Course(1,"Java")));
		stud.add(new Student(4,"Manish",23,new Course(3,"AWS")));
		stud.add(new Student(1,"Pritish",23,new Course(1,"Java")));
		stud.add(new Student(2,"Vivek",20,new Course(2,"Python")));
		stud.add(new Student(3,"Rahul",24,new Course(1,"Java")));
		stud.add(new Student(4,"Satish",23,new Course(2,"Python")));
		
		createStudentCourse(stud);
		countStudentCourse(stud);
	}

}
