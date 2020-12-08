package main;

public class Person {
	String firstName, lastName, domisili;

	public Person(String firstName, String lastName, String domisili) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.domisili = domisili;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public String getDomisili() { 
		return "Domisili: " + domisili;
	}
}
