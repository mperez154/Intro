//Created by Marco Perez
//Student ID: 2348837
package perez10;

public class TestVehicle {

	public static void main(String[] args) {

		// Creating 3 vehicle objects, with args
		Vehicle car1 = new Vehicle("Chevy", "Camaro", 2016, 21999.99, new Motor(8, 400, "Gas"));
		Vehicle car2 = new Vehicle("Ford", "Mustang", 2015, 20999.99, new Motor(8, 405, "Gas"));
		Vehicle car3 = new Vehicle("Toyota", "Prius", 2014, 22999.99, new Motor(4, 100, "Electric"));

		// outputting vehicle details using the vehicleToString method
		System.out.println(car1.vehicleToString());
		System.out.println(car2.vehicleToString());
		System.out.println(car3.vehicleToString());

	}

}
