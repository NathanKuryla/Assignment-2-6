package com.datacontainers;

public class Name {
	private String firstName;
	private String lastName;

	/** Creates Name Constructor with specified attributes */
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/** Getter and Setter Methods for Name Class */
	
	public String getFirst() {
		return firstName;
	}

	public void setFirst(String firstName) {
		this.firstName = firstName;
	}

	public String getLast() {
		return lastName;
	}

	public void setLast(String lastName) {
		this.lastName = lastName;
	}

}
