package com.qa.vehicle;

public class Truck extends Vehicle {

	private int Capacity;
	private String CargoName;
	private int Range;
	
	public Truck(String name, String brand, int length, int Cap, String CN, int Range) {
		super(name, brand, length);
		
		this.Capacity = Cap;
		this.setCargoName(CN);
		this.Range = Range;

	}
	@Override
	public int calcBill() {
		return TruckBill();
	}
	
	private int TruckBill() {
		return this.Capacity*20 + this.Range;
	}
	public String getCargoName() {
		return CargoName;
	}
	public void setCargoName(String cargoName) {
		CargoName = cargoName;
	}
}
