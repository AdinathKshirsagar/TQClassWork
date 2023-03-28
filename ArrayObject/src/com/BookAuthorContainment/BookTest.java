package com.BookAuthorContainment;

import java.util.Scanner;

public class BookTest {
	static Scanner sc = new Scanner(System.in);
	public static void getBookDetails(Book b1)
	{
		System.out.println("Enter a book id :");
		b1.setbId(sc.nextInt());
		System.out.println("Enter a book name :");
		b1.setbName(sc.next());
		System.out.println("Enter a book prize :");
		b1.setPrize(sc.nextFloat());
		Author au = new Author(); 
		b1.setAuthor(au);
		// b1.setAuthor(new Author()); // anonymous object of Author
		System.out.println("Enter a Author id :");
		b1.getAuthor().setaId(sc.nextInt());
		System.out.println("Enter a Author name :");
		b1.getAuthor().setaName(sc.next());
	}
	public static void main(String[] args) {
		Book b[]= new Book[2];
		for(int i=0;i<2;i++)
		{
			b[i]=new Book();
			getBookDetails(b[i]);
		}
		for(Book bo: b)
		{
			System.out.println(bo);
		}
	}

}
