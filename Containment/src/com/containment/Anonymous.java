package com.containment;

public class Anonymous {

	public static void main(String[] args) {
		Book  b1 = new Book("The India Story",838f,"Science",new Author(101,"Bimal Jalal","Master Degree","19-02-86"));
		Book  b2 = new Book("Lal Salam",600f,"Science",new Author(101,"Smriti Irani","Master Degree","08-07-92"));
		
		System.out.println(b1);
		System.out.println(b2);
		
		Author a1 = new Author(302,"Harish Mehta","Master Degree","28-04-79");
		Book  b3 = new Book();
		b3.setBookName("Queen of Fire");
		b3.setBprice(877f);
		b3.setBtype("Social");
		b3.setAuthor(a1);
		
		System.out.println(b3);
		
		Book b4 = new Book("Lal Salam",600f,"Science",a1);
		System.out.println(b4);
		
	}

}
