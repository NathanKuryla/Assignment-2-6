package com.datacontainers;

import java.util.ArrayList;

import org.joda.time.DateTime;

import com.customers.Customer;
import com.products.Product;

public class Invoice {
private String invoiceCode;
private DateTime invoiceDate;
private Customer customer;
private Person realtor;
private ArrayList<Product> productList;

public Invoice(String invoiceCode, Customer customer, Person realtor,  DateTime invoiceDate, ArrayList<Product> productList) {
	super();
	this.invoiceCode = invoiceCode;
	this.invoiceDate = invoiceDate;
	this.customer = customer;
	this.realtor = realtor;
	this.productList = productList;
}

public String getCode() {
	return InvoiceCode;
}

public void setCode(String invoiceCode) {
	InvoiceCode = invoiceCode;
}

public DateTime getDate() {
	return InvoiceDate;
}

public void setDate(DateTime invoiceDate) {
	InvoiceDate = invoiceDate;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public Person getRealtor() {
	return realtor;
}

public void setRealtor(Person realtor) {
	this.realtor = realtor;
}

public ArrayList<Product> getProductList() {
	return productList;
}

public void setProductList(ArrayList<Product> productList) {
	this.productList = productList;
}

}
