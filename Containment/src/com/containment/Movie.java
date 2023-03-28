package com.containment;

public class Movie {
	private int movieId;
	private String movieName;
	private String rdate;
	
	static int movieCount=0;
	
	{
		movieCount++;
	}
	
	public Movie() {
		
	}
	public Movie(int movieId, String movieName) {
		this.movieId = movieId;
		this.movieName = movieName;
	}

	public Movie(int movieId, String movieName, String rdate) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.rdate = rdate;
	}
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public static int getMovieCount() {
		return movieCount;
	}

	public static void setMovieCount(int movieCount) {
		Movie.movieCount = movieCount;
	}

	public String toString() {
		return " [ MovieName=" + movieName + ", rdate=" + rdate + "]";
	}
	
}
