//Created by Marco Perez
//Student ID: 2348837
package perez9;

public class TestPerson {

	public static void main(String[] args) {
		// Creating three person instances
		Person firstPerson = new Person("Marco Perez", 'M', 32);
		Person secondPerson = new Person("Bradley Yourth", 'M', 42);
		Person thirdPerson = new Person("Mariana Martinez", 'F', 52);

		System.out.println("Three people at first:");
		// Displaying status of 3 person instances
		System.out.print(firstPerson.personToString());
		System.out.print(secondPerson.personToString());
		System.out.print(thirdPerson.personToString());

		// Calling the changeName method to change the name of thirdPerson
		changeName(thirdPerson);

		// Array of all persons
		Person[] allPeople = { firstPerson, secondPerson, thirdPerson };

		// Calling the agePersons method with 3 as the yrs argument
		agePersons(allPeople, 3);

		// Displaying the value of the static numFrineds
		System.out.printf("\rWe created %d Person Objects", Person.numFriends);

	}

	// changeName method
	public static void changeName(Person p) {
		p.setFullName(p.getFullName() + "-Perez");
	}

	// agePersons method has a loop that will loop through the array, add yrs to
	// Person age
	public static Person[] agePersons(Person[] ara, int yrs) {
		System.out.println("\rThree persons after 3 years");
		for (int i = 0; i < ara.length; i++) {
			ara[i].setAge(ara[i].getAge() + yrs);
			System.out.print(ara[i].personToString());
		}

		return ara;
	}

}
