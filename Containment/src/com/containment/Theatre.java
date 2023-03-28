package com.containment;

public class Theatre {
	private int theatreId;
	private String name;
	private String location;
	private Movie movie;
	
	public Theatre() {
		
	}
	public Theatre(int theatreId, String name, String location) {
		this.theatreId = theatreId;
		this.name = name;
		this.location = location;
	}
	public Theatre(int theatreId, String name, String location, Movie movie) {
		this(theatreId,name,location);
		this.movie = movie;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public String toString() {
		return "TheatreId=" + theatreId + ", name=" + name + ", location=" + location + ", movie=" + movie
				+" ";
	}
	
}
