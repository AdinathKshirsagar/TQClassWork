package com.CustomMap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BookAuthorHashMap {
	public static void createAuthorBookMap(ArrayList<Book> al) 
	{			
		HashMap<Author, ArrayList<String>> authMap= new HashMap<>();
		Iterator<Book> itr = al.iterator();
		ArrayList<String> booklist;
		while(itr.hasNext())
		{
			Book b = itr.next();
			if(!authMap.containsKey(b.getAuthor()))
			{
				booklist =  new ArrayList<>();
				
			}else
			{
				booklist= authMap.get(b.getAuthor());
			}
			booklist.add(b.getName());
			authMap.put(b.getAuthor(), booklist);
		}
		for(Map.Entry<Author, ArrayList<String>> en : authMap.entrySet())
		{
			System.out.println(en.getKey());
			System.out.println("Book List :");
			booklist= en.getValue();
			for(String s: booklist)
			{
				System.out.println(s+" ");
			}
			System.out.println();
			System.out.println("======================================================");
		}
	}
	
	public static void createAuthorNumberBookMap(ArrayList<Book> al)
	{
		HashMap<Author, Integer> authmap= new HashMap<>();
		
		Iterator<Book> itr= al.iterator();
		int count;		
		while(itr.hasNext())
		{
			count=1;
			Book b= itr.next();
			if(!authmap.containsKey(b.getAuthor()))
			{				
				authmap.put(b.getAuthor(), count);
			}
			else
			{
				count= authmap.get(b.getAuthor());
				authmap.put(b.getAuthor(), count+1);
			}
			
			
		}
		
		for(Map.Entry<Author, Integer> en: authmap.entrySet())
		{
			
			System.out.println(en.getKey().getName()+" :"+en.getValue());
			
			System.out.println();
			System.out.println("===========================================================");
		}
		
		
	}
	public static void createAuthorNameBookMap(ArrayList<Book> al)
	{
		HashMap<String, ArrayList<String>> authmap= new HashMap<>();
		
		Iterator<Book> itr= al.iterator();
		ArrayList<String> booklist;
		
		while(itr.hasNext())
		{
			Book b= itr.next();
			if(!authmap.containsKey(b.getAuthor().getName()))
			{
				booklist= new ArrayList<>();
				//booklist.add(b.getBname());
				//authmap.put(b.getAuthor(), booklist);
			}
			else
			{
				booklist= authmap.get(b.getAuthor().getName());
				//booklist.add(b.getBname());
				//authmap.put(b.getAuthor(), booklist);
			}
			booklist.add(b.getName());
			authmap.put(b.getAuthor().getName(), booklist);
			
		}
		
		for(Map.Entry<String, ArrayList<String>> en: authmap.entrySet())
		{
			
			System.out.println("Author name: "+en.getKey());
			System.out.println("Book List:");
			booklist= en.getValue();
			for(String s:booklist)
			{
				System.out.print(s+" , ");
			}
			System.out.println();
			System.out.println("===========================================================");
		}
		
		
	}

	public static void main(String[] args) {
		ArrayList<Book> bal = new ArrayList<>();
		bal.add(new Book(1001,"Harry Potter",760f,new Author(1,"J.K Rowling")));
		bal.add(new Book(1002,"Hamlet",870f,new Author(3,"William Shakespeare")));
		bal.add(new Book(1003,"Fantastic Beasts",660f,new Author(1,"J.K Rowling")));
		bal.add(new Book(1004,"The clear blue sky",780f,new Author(2,"Narayana Murthy")));
		bal.add(new Book(1005,"The better India a better World",1060f,new Author(2,"Narayana Murthy")));
		bal.add(new Book(1006,"The Christmas Pig",550f,new Author(1,"J.K Rowling")));
		bal.add(new Book(1007,"Othello",840f,new Author(3,"William Shakespeare")));
		
		createAuthorBookMap(bal);
		createAuthorNameBookMap(bal);
		createAuthorNumberBookMap(bal);
		
		
	}

}
