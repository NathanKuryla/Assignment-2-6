package com.products;

import org.joda.time.DateTime;

import com.datacontainers.Address;

public class LeaseAgreements extends Product {
	private DateTime startDate;
	private DateTime endDate;
	private Address address;
	private String customerName;
	private String monthlyCost;
	private double tax;
	private double subTotal;
	private double grandTotal;

	/** Creates LeaseAgreements Constructor with specified attributes */
	public LeaseAgreements(String productCode, String type, DateTime startDate, DateTime endDate, Address address,
			String customerName, String monthlyCost) {
		super(productCode, type);
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
		this.customerName = customerName;
		this.monthlyCost = monthlyCost;
	}

	/** Getter and Setter Methods for LeaseAgreements Class */

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

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMonthlyCost() {
		return monthlyCost;
	}

	public void setMonthlyCost(String monthlyCost) {
		this.monthlyCost = monthlyCost;
	}

	// Will need to figure out with date class
	public double getSubTotal() {
		return subTotal;
	}
	
	public double getTax() {
		tax = 1.06;
		return tax;
	}
}