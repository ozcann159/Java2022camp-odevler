package oop1;

//Bireysel müşteri bit müşteridir.      //Extends = Genişletme
public class IndividualCustomer extends Customer {// Bireysel müşteri
	private String firstName;
	private String lastName;

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

}
