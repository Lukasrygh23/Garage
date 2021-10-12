package com.qa.runner;

import com.qa.vehicle.Car;
import com.qa.vehicle.Garage;
import com.qa.vehicle.Truck;
import com.qa.vehicle.Vehicle;

public class Runner {
	public static void main(String[] args) {
		Garage garage = new Garage();
		Vehicle Car1 = new Car("Carl", "Audino", 500, 25, 500);
		garage.addVehicle(Car1);
		Vehicle Car2 = new Car("Christine", "Chrysler", 30, 100, 200);
		Vehicle TruckKun = new Truck("Dave", "Dunno", 25, 50, "Toys", 85);
		garage.addVehicle(Car2);
		garage.addVehicle(TruckKun);
		garage.fixVehicle(0);
		garage.fullbill();
		garage.removeByName("Carl");
		garage.fullbill();
		garage.removeByType("Car");
		garage.fullbill();
	}
}
