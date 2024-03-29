package com.customers;

import com.datacontainers.Address;
import com.datacontainers.Person;

public class LowIncome extends Customer {
	
	private double tax;
	private double fee;
	private double discount;

	public LowIncome(String customerCode, String customerType, Person contact, Name name, Address address) {
		super(customerCode, customerType, contact, name, address);
	}
	
	@Override
	public double getTax(Product product) {
		tax = 0.00;
		return tax;
	}
	
	@Override
	public double getDiscount(Product product) {
		discount = 0.10 * product.getSubTotal();
		return discount;
	}
	
	@Override
	public double getFee() {
		fee = 50.75;
		return fee;
	}
	
}
