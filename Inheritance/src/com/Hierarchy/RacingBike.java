package com.Hierarchy;

public class RacingBike extends Bike{
	private float speed;
	
	public RacingBike() {
		
	}
	public RacingBike(int modelno, String brand, float price,float speed) {
		super(modelno,brand,price);
		this.speed= speed;
	}
	public void setSpeed(float speed) {
		this.speed=speed;
	}
	public float getSpeed() {
		return this.speed;
	}
	public String toString() {
		return " Racingbike "+super.toString()+" Speed :"+speed;
	}
}
