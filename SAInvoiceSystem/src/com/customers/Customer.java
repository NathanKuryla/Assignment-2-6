package com.customers;

import com.datacontainers.Address;
import com.datacontainers.Person;
import com.datacontainers.Taxable;

abstract public class Customer implements Taxable {

	private String customerCode;
	private String customerType;
	private Person contact;
	private String customerName;
	private Address customerAddress;
	private ArrayList products;
	
	/** Creates Customer Constructor with specified attributes */
	public Customer(String customerCode, String customerType, Person contact, Name name, Address address) {
		super();
		this.customerCode = customerCode;
		this.customerType = customerType;
		this.contact = contact;
		this.customerName = name;
		this.customerAddress = address;
		this.products = products
	}

	/** Getter and Setter Methods for Customer Class */
	
	public String getCode() {
		return customerCode;
	}

	public void setCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getType() {
		return customerType;
	}

	public void setType(String customerType) {
		this.customerType = customerType;
	}

	public Person getContact() {
		return contact;
	}

	public void setContact(Person contact) {
		this.contact = contact;
	}

	public String getName() {
		return customerName;
	}

	public void setName(String name) {
		this.customerName = name;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address address) {
		this.customerAddress = address;
	}
	
	public abstract double getTax();
	public abstract double getDiscount();
	public abstract double getFee();
}
