package com.qa.vehicle;

public class Helicopter extends Vehicle {
	private int PropellerLength;
	private double flightCeiling;
	
	public Helicopter(String name, String brand, int length, int PropLength, double FC) {
		super(name, brand, length);
		this.PropellerLength = PropLength;
		this.flightCeiling = FC;
	}
	
	@Override
	public int calcBill() {
		return heliBill();
	}
	
	private int heliBill() {
		return (int) (500+ this.flightCeiling + this.PropellerLength);
	}
}
