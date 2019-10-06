package com.datacontainers;

import java.util.List;

import org.joda.time.DateTime;

public class Invoice {
private String InvoiceCode;
private DateTime InvoiceDate;
private Customer customer;
private Person realtor;
private List<Product> productList;

public Invoice(String invoiceCode, DateTime invoiceDate, Customer customer, Person realtor, List<Product> productList) {
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

public List<Product> getProductList() {
	return productList;
}

public void setProductList(List<Product> productList) {
	this.productList = productList;
}

}
