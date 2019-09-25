package com.datacontainers;
import java.util.Date;

public class SaleAgreements extends Product {
	private Date date;
	private Address address;
	
	public SaleAgreements(String productCode, String type, Date date, Address address) {
		super(productCode, type);
		this.date = date;
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
