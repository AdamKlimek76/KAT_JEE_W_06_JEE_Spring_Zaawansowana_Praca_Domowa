package pl.coderslab.advanced.abstractclass;

public class Person implements Comparable<Person> {

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	String firstName;
	String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "lastName= " + lastName + " firstName, = " + firstName ;
	}


	@Override
	public int compareTo(Person person) {
		return this.getLastName().substring(0, 2).compareTo(person.getLastName().substring(0, 2));

	}
}
