package com.datacontainers;

public class LeaseAgreements extends Product {
	private String startDate;
	private String endDate;
	private Address address;
	private Name name;
	private String pricePerAppt;

	public LeaseAgreements(String productCode, String type, String startDate, String endDate, Address address,
			Name name, String pricePerAppt) {
		super(productCode, type);
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
		this.name = name;
		this.pricePerAppt = pricePerAppt;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getPricePerAppt() {
		return pricePerAppt;
	}

	public void setPricePerAppt(String pricePerAppt) {
		this.pricePerAppt = pricePerAppt;
	}

}
