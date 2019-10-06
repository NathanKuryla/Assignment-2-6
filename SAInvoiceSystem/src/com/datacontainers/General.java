package com.datacontainers;

public class General extends Customer {

	public General(String customerCode, String customerType, Person contact, String name, Address address) {
		super(customerCode, customerType, contact, name, address);
	}
	
	public double getTax() {
	}
	
	public double getDiscount() {
		
	}
	
	public double getAdditionalFee() {
		
	}
	
}
