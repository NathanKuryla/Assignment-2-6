package com.customers;

import com.datacontainers.Address;
import com.datacontainers.Person;

public class LowIncome extends Customer {
	
	private double tax;
	private double fee;

	public LowIncome(String customerCode, String customerType, Person contact, String name, Address address) {
		super(customerCode, customerType, contact, name, address);
	}
	
	public double getSub() {
		
	}
	
	public double getTax() {
		tax = 0.00;
		return tax;
	}
	
	public double getDiscount() {
		
	}
	
	public double getAdditionalFee() {
		fee = 50.75;
		return fee;
	}
	
	
}
