package com.datacontainers;

public class SaleAgreements extends Product {
	private String date;
	private Address address;
	
	public SaleAgreements(String productCode, String type, String date, Address address) {
		super(productCode, type);
		this.date = date;
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
