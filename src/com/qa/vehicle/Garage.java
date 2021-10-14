package com.qa.vehicle;

import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicle> Garage = new ArrayList<>();
	

	
	public void addVehicle(Vehicle item) {
		System.out.println("Adding " + item.getName());
		Garage.add(item);
	}
	
	public void fixVehicle(int id) {
		System.out.println("Fixing a vehicle now.. bill incoming.");
		System.out.println(Garage.get(id).calcBill());
	}
	
	public void fullbill() {
		for (int i = 0; i < Garage.size(); i++) {
			System.out.println(Garage.get(i).calcBill());
		}
	}
	
	public void emptyGarage() {
		System.out.println("Clearing Garage!");
		Garage.clear();
	}
	
	public void removeByID(int id) {
		System.out.println("Removing vehicle number " + id);
		Garage.remove(id);
	}
	
	public void updateByID(int id, Vehicle replacement) {
		System.out.println("Updating vehicle!");
		Garage.set(id, replacement);
	}
	
	public void removeByName(String name) {
		Garage.removeIf(n -> n.getName().equals(name));
		System.out.println("Removed!");
	}
	
	public void removeByType(String type) {
		Garage.removeIf(n -> n.getClass().getSimpleName().equals(type));
		System.out.println("Type cleared!");
	}
	
}
