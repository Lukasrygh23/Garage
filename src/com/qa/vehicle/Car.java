package com.qa.vehicle;

public class Car extends Vehicle {

	private int EngineHorsePower;
	private int EmissionValue;
	
	public Car(String name, String brand, int length, int price) {
		super(name, brand, length, price);
		// TODO Auto-generated constructor stub
	}
	
	
	public Car(String name, String brand, int length, int EngineHorsePower, int EmissionValue) {
		super(name, brand, length);
		this.EngineHorsePower = EngineHorsePower;
		this.EmissionValue = EmissionValue;
	}
	
	@Override
	public int calcBill() {
		return EmissionBill();
	}
	
	public int EmissionBill() {
		return (this.EngineHorsePower * 2) + EmissionValue;
	}

}
