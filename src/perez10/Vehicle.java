//Created by Marco Perez
//Student ID: 2348837
package perez10;

public class Vehicle {
	// Declaring variables
	private String make;
	private String model;
	private int year;
	private double price;
	private Motor motor;

	// Constructor with 5 args (including one from Motor class)
	public Vehicle(String conMake, String conModel, int conYear, double conPrice, Motor conMotor) {
		make = conMake;
		model = conModel;
		year = conYear;
		price = conPrice;
		motor = conMotor;
	}

	// Setter for price
	public void setPrice(double newPrice) {
		price = newPrice;
	}

	// getter for price
	public double getPrice() {
		return price;
	}

	// Vehicle to String method
	public String vehicleToString() {
		String vehicleDetails = year + " " + make + " " + model + "," + " Price = $" + price;
		String motorDetails = motor.motorToString();
		return vehicleDetails + "\r" + motorDetails;
	}

}
