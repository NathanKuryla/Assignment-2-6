package com.datacontainers;

public class Customer {

	private String customerCode;
	private String type;
	private Person contact;
	private String customerName;
	private Address customerAddress;

	public Customer(String customerCode, String type, Person contact, String name, Address address) {
		super();
		this.customerCode = customerCode;
		this.type = type;
		this.contact = contact;
		this.customerName = name;
		this.customerAddress = address;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Person getPrimaryContact() {
		return contact;
	}

	public void setPrimaryContact(Person contact) {
		this.contact = contact;
	}

	public String getName() {
		return customerName;
	}

	public void setName(String name) {
		this.customerName = name;
	}

	public Address getAddress() {
		return customerAddress;
	}

	public void setAddress(Address address) {
		this.customerAddress = address;
	}
	
	@Override
	public String toString() {
		return "Customer [customerCode=" + customerCode + ", type=" + type + ", contact=" + contact + ", customerName="
				+ customerName + ", customerAddress=" + customerAddress + "]";
	}
}
