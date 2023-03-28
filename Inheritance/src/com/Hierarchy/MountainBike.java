package com.Hierarchy;

public class MountainBike extends Bike {
	private int gear;
	private int seatHeight;
	
	public MountainBike() {
		
	}
	public MountainBike(int modelno,String brand,float price,int gear,int seatHeight) {
		super(modelno,brand,price);
		this.gear= gear;
		this.seatHeight= seatHeight;
	}
	public void setGear(int gear) {
		this.gear=gear;
	}
	public int getGear() {
		return gear;
	}
	public void setSeatHeight(int seatHeight) {
		this.seatHeight=seatHeight;
	}
	public int getSeatHeight() {
		return seatHeight;
	}
	public String toString()
	{
		return " MountainBike "+super.toString()+ " Gear :"+gear+" SeatHeigt "+seatHeight;
	}
}
