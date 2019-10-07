package com.datacontainers;

import java.util.ArrayList;

import org.joda.time.DateTime;

import com.customers.Customer;
import com.products.Product;

public class Invoice {
private String InvoiceCode;
private DateTime InvoiceDate;
private Customer customer;
private Person realtor;
private ArrayList<Product> productList;

public Invoice(String invoiceCode, Customer customer, Person realtor,  DateTime invoiceDate, ArrayList<Product> productList) {
	super();
	InvoiceCode = invoiceCode;
	InvoiceDate = invoiceDate;
	this.customer = customer;
	this.realtor = realtor;
	this.productList = productList;
}

public String getInvoiceCode() {
	return InvoiceCode;
}

public void setInvoiceCode(String invoiceCode) {
	InvoiceCode = invoiceCode;
}

public DateTime getInvoiceDate() {
	return InvoiceDate;
}

public void setInvoiceDate(DateTime invoiceDate) {
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
