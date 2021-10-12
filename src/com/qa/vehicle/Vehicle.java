package com.qa.vehicle;

public class Vehicle {
	private String name;
	private String brand;
	private int length;
	private int price;
	/**
	 * @param name
	 * @param brand
	 * @param length
	 */
	public Vehicle(String name, String brand, int length, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.length = length;
		this.price = price;
	}
	
	public Vehicle(String name, String brand, int length) {
		super();
		this.name = name;
		this.brand = brand;
		this.length = length;
		this.price = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public int calcBill() {
		return this.price;
	}
}
