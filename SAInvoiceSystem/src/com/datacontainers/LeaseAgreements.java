package com.datacontainers;
import java.util.Date;

public class LeaseAgreements extends Product {
	private Date startDate;
	private Date endDate;
	private Address address;
	private Name name;
	private String pricePerAppt;

	public LeaseAgreements(String productCode, String type, Date startDate, Date endDate, Address address,
			Name name, String pricePerAppt) {
		super(productCode, type);
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
		this.name = name;
		this.pricePerAppt = pricePerAppt;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
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