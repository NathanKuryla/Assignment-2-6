package com.datacontainers;
import org.joda.time.DateTime;

public class LeaseAgreements extends Product {
	private DateTime startDate;
	private DateTime endDate;
	private Address address;
	private String name;
	private String pricePerAppt;

	public LeaseAgreements(String productCode, String type, DateTime startDate, DateTime endDate, Address address,
			String name, String pricePerAppt) {
		super(productCode, type);
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
		this.name = name;
		this.pricePerAppt = pricePerAppt;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPricePerAppt() {
		return pricePerAppt;
	}

	public void setPricePerAppt(String pricePerAppt) {
		this.pricePerAppt = pricePerAppt;
	}
	
}