package com.datacontainers;
import org.joda.time.DateTime;

public class SaleAgreements extends Product {
	private DateTime date;
	private Address address;
	private String cost;
	
	public SaleAgreements(String productCode, String type, DateTime date, Address address, String cost) {
		super(productCode, type);
		this.date = date;
		this.address = address;
		this.cost = cost;
	}

	public DateTime getDate() {
		return date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getCost() {
		return cost;
	}

	public void set(Address addrCost) {
		this.cost = cost;
	}

}
