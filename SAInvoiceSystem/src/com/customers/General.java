package com.customers;

import com.datacontainers.Address;
import com.datacontainers.Person;

public class General extends Customer {
	
	private double tax;
	private double discount;
	private double fee;

	public General(String customerCode, String customerType, Person contact, String name, Address address) {
		super(customerCode, customerType, contact, name, address);
	}
	
	@Override
	public double getTax() {
		return tax;
	}
	
	@Override
	public double getDiscount() {
		discount = 0.00;
		return discount;
	}
	
	@Override
	public double getAdditionalFee() {
		fee = 0.00;
		return fee;
	}
}
