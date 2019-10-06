package com.datacontainers;

import java.util.ArrayList;

public class Person {
	private String personCode;
	private Name name;
	private Address address;
	private ArrayList<String> emails;

	/** Creates Person Constructor with specified attributes */
	public Person(String personCode, Name name, Address address, ArrayList<String> emails) {
		super();
		this.personCode = personCode;
		this.name = name;
		this.address = address;
		this.emails = emails;
	}

	/** Getter and Setter Methods for Person Class */

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
		return emails;
	}

	public void setEmail(ArrayList<String> emails) {
		this.emails = emails;
	}

}
