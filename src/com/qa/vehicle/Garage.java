package com.qa.vehicle;

import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> Garage = new ArrayList<>();
	

	
	public void addVehicle(Vehicle item) {
		System.out.println("Adding " + item.getName());
		Garage.add(item);
	}
	
	
	
	public void emptyGarage() {
		System.out.println("Clearing Garage!");
		Garage.clear();
	}
}
