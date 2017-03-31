//Creted by Marco Perez
//Student ID: 2348837
package perez9;

public class Person {
	// Declare and initialize variables
	private String fullName;
	private char gender;
	private int age;
	public static int numFriends = 0;

	// Constructor w/ 3 args
	Person(String name, char theGender, int theAge) {
		fullName = name;
		gender = theGender;
		age = theAge;
		numFriends++;
	}

	// Method to get FullName attribute
	String getFullName() {
		return fullName;
	}

	// Set method to change fullName attribute
	void setFullName(String newName) {
		fullName = newName;
	}

	// Method used to retrieve gender
	char getGender() {
		return gender;
	}

	// Set method used to change or set gender
	void setGender(char newGender) {
		gender = newGender;
	}

	// Method used to retrieve age
	int getAge() {
		return age;
	}

	// Set method used to change/set age
	void setAge(int newAge) {
		age = newAge;
	}

	// Method used to display
	String personToString() {
		String output = "Person fullName=" + fullName + ", gender=" + gender + ", age=" + age + "\r";
		return output;
	}

}
