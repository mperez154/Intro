//Created by Marco Perez
//Student ID: 2348837
package perez10;

public class Motor {
	// Declaring and initializing variables
	private int cylinders;
	private int hp;
	private String type; // (Gas, deisel, electric, etc.)

	// Constructor that takes 3 args
	Motor(int conCylinders, int conHP, String conType) {
		cylinders = conCylinders;
		hp = conHP;
		type = conType;
	}

	// Getter for Cylinders
	public int getCylinders() {
		return cylinders;
	}

	// Getter for HP
	public int getHP() {
		return hp;
	}

	// Getter for engine type
	public String getType() {
		return type;
	}

	// motor to String method
	public String motorToString() {
		String output = "Motor Cylinders = " + cylinders + ", HP = " + hp + ", Type = " + type + "\r";
		return output;
	}

}
