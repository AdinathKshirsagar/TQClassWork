package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingArrayList {

	public static void main(String[] args) {
		ArrayList<String> stud= new ArrayList<>();
	      
	      stud.add("Bhushan");
	      stud.add("Chinmay");
	      stud.add("Shuruti"); 
	      stud.add("Priya");
	      stud.add("Vaishnavi");
	      stud.add("Priya");// duplicate allowed
	      stud.add("Adinath"); 
	      
	      System.out.println("___________Normal for Loop____________________");
	      for(int i=0;i<stud.size();i++)
	      {
	    	  System.out.println(stud.get(i));
	      }
	      
	      System.out.println("___________Enhance for Loop____________________");
	      for(String s : stud)
	      {
	    	 System.out.println(s);
	      }
	      
	      System.out.println("___________Iterator____________________");
	      Iterator<String> itr = stud.iterator();
	      while(itr.hasNext()) 
	      {
	    	  System.out.println(itr.next());
	      }
	      
	      System.out.println("___________List Iterator(Forward)____________________");
	      
	      ListIterator<String> lisitr= stud.listIterator();
	      while(lisitr.hasNext())
	      {
	    	  System.out.println(lisitr.next());
	      }
	      
	      System.out.println("___________List Iterator(Backward)____________________");
	      
	      ListIterator<String> listr = stud.listIterator(stud.size());
	      while(listr.hasPrevious())
	      {
	    	  System.out.println(listr.previous());
	      }
	}

}
