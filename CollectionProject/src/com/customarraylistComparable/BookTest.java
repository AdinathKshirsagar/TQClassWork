package com.customarraylistComparable;

import java.util.ArrayList;
import java.util.Collections;

public class BookTest {

	public static void main(String[] args) {
		 ArrayList<Book> blist = new ArrayList<>();
		 blist.add(new Book(1,"Science",448.9));
		 blist.add(new Book(3,"Math",500.9));
		 blist.add(new Book(2,"English",748.9));
		 blist.add(new Book(4,"Sanskrit",300.9));
		 blist.add(new Book(5,"Computer Science",645.9));
		 
		 
		 for(Book b : blist)
	     {
	    	 System.out.println(b);
	     }
		 Collections.sort(blist,Collections.reverseOrder());
		 
	     System.out.println("====================================================");

	     for(Book b : blist)
	     {
	    	 System.out.println(b);
	     }
	}

}
