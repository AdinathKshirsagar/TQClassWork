package com.containment;

import java.util.Scanner;

public class MoiveHall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Theatre t = new Theatre();
		int choice;
		do
		{
			 System.out.println("1. Enter a theatre");
	    	 System.out.println("2. Enter movie in theatre");
	    	 System.out.println("3. Display theatre");
	         System.out.println("4. Exit");
	         	
	         choice=sc.nextInt();
	         switch(choice)
	         {
	         	case 1:
	         		System.out.println("Enter theatre id:");
	         		t.setTheatreId(sc.nextInt());
	         		System.out.println("Theatre name:");
	         		t.setName(sc.next());
	         		System.out.println("Enter location:");
	         		t.setLocation(sc.next());
	         		break;
	         	case  2:
	         		Movie m = new Movie();
	         		System.out.println("Enter movie id:");
	         		m.setMovieId(sc.nextInt());
	         		System.out.println("Enter movie name:");
	         		m.setMovieName(sc.next());
	         		System.out.println("Enter releasedate(yyyy-mm-dd):");
	         		m.setRdate(sc.next());
	         		t.setMovie(m);
	         		break;
	         	case 3:
	         		System.out.println(t);
	         		System.out.println("Number of Movies"+Movie.movieCount);
	         		break;
	         	case 4:
	         		System.exit(0);
	         	default:
	         		System.err.println("Error...");
	         }
	         System.out.println("Do you want to perform more operation(1-yes/0-no)");
			   choice= sc.nextInt();
		}while(choice==1);
		
	}

}
