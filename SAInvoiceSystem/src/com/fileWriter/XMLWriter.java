package com.fileWriter;

import java.util.ArrayList;

import com.products.Amenity;
import com.customers.Customer;
import com.products.LeaseAgreements;
import com.datacontainers.Person;
import com.products.Product;
import com.products.SaleAgreements;
import com.products.ParkingPass;
import com.thoughtworks.xstream.XStream;

public class XMLWriter {

	/** Writes Person objects in XML format*/
	public String toXmlStringPerson(ArrayList<Person> xmlPersonArray) {
		XStream xstream = new XStream();
		xstream.alias("person", Person.class);
		String xmlString = xstream.toXML(xmlPersonArray);
	
	return xmlString;
	}
	
	/** Writes Customer objects in XML format*/
	public String toXmlStringCustomer(ArrayList<Customer> xmlCustomerArray) {
		XStream xstream = new XStream();
		xstream.alias("customer", Customer.class);
		String xmlString = xstream.toXML(xmlCustomerArray);
	
	return xmlString;
	}
	
	/** Writes Product objects in XML format*/
	public String toXmlStringProduct(ArrayList<Product> xmlProductArray) {
		XStream xstream = new XStream();
		xstream.alias("product", Product.class);
		xstream.alias("lease agreements", LeaseAgreements.class);
		xstream.alias("sale agreements", SaleAgreements.class);
		xstream.alias("parking pass", ParkingPass.class);
		xstream.alias("amenity", Amenity.class);
		String xmlString = xstream.toXML(xmlProductArray);
	
	return xmlString;
	}
	
}
