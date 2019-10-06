package com.datacontainers;
import org.joda.time.DateTime;

public class SaleAgreements extends Product {
	private DateTime dateTime;
	private Address address;
	private String totalCost;
	private String downPayment;
	private String monthlyPayment;
	private String payableMonths;
	private String interestRate;
	
	
	/** Creates SaleAgreements Constructor with specified attributes */
	public SaleAgreements(String productCode, String productType, DateTime dateTime, Address address, String totalCost,
			String downPayment, String monthlyPayment, String payableMonths, String interestRate) {
		super(productCode, productType);
		this.dateTime = dateTime;
		this.address = address;
		this.totalCost = totalCost;
		this.downPayment = downPayment;
		this.monthlyPayment = monthlyPayment;
		this.payableMonths = payableMonths;
		this.interestRate = interestRate;
	}
	
	/** Getter and Setter Methods for SaleAgreements Class */
	
	public DateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(DateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}

	public String getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(String downPayment) {
		this.downPayment = downPayment;
	}

	public String getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(String monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public String getPayableMonths() {
		return payableMonths;
	}

	public void setPayableMonths(String payableMonths) {
		this.payableMonths = payableMonths;
	}

	public String getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	
	public double getTax() {
		
	}
	
	public double computeGrandTotal() {
		
	}

}
	