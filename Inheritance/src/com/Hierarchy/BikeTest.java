package com.Hierarchy;

public class BikeTest {

	public static void main(String[] args) {
		MountainBike m1= new MountainBike(1255,"RE",85000f,6,20);
		RacingBike r1 = new RacingBike(4646,"KTM",99999f,320);
		
		System.out.println(m1);
		System.out.println(r1);
	}

}
