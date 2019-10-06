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
	
	/** Creates Customer Constructor with specified attributes */
	public Customer(String customerCode, String customerType, Person contact, String name, Address address) {
		super();
		this.customerCode = customerCode;
		this.customerType = customerType;
		this.contact = contact;
		this.customerName = name;
		this.customerAddress = address;
	}

	/** Getter and Setter Methods for Customer Class */
	
	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setType(String customerType) {
		this.customerType = customerType;
	}

	public Person getPrimaryContact() {
		return contact;
	}

	public void setPrimaryContact(Person contact) {
		this.contact = contact;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String name) {
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
	public abstract double getAdditionalFee();
}
