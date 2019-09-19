package com.datacontainers;

import java.util.ArrayList;

public class Person {
	private String personCode;
	private Name name;
	private Address address;
	private ArrayList<String> email;

	public Person(String personCode, Name name, Address address, ArrayList<String> email) {
		super();
		this.personCode = personCode;
		this.name = name;
		this.address = address;
		this.email = email;
	}

	public String getPersonCode() {
		return personCode;
	}

	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<String> getEmail() {
		return email;
	}

	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}

}
