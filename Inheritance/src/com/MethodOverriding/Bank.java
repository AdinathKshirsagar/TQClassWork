package com.MethodOverriding;

public class Bank {
	protected  float rateOfInterest;

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest() {
		rateOfInterest = 0;
	}

	public  void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
}
