package com.qa.runner;

import com.qa.vehicle.Car;
import com.qa.vehicle.Garage;
import com.qa.vehicle.Vehicle;

public class Runner {
	public static void main(String[] args) {
		Garage garage = new Garage();
		Vehicle Car1 = new Car("Carl", "Audino", 500, 500, 500);
		garage.addVehicle(Car1);
		Vehicle Car2 = new Car("Christine", "Chrysler", 30, 100, 200);
		garage.addVehicle(Car2);
	}
}
