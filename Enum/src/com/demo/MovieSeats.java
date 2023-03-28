package com.demo;

enum MovieSeats {
	PLATINUM(300), PREMIMUN(400),RECLINER(500);
	
	private int price;
	 MovieSeats(int price) // internally private
	{
		this.price=price;
	}
	
	public static void main(String[] args) {
		for(MovieSeats m : MovieSeats.values())
		{
			System.out.println(m+" "+m.price);
		}
	}

}
