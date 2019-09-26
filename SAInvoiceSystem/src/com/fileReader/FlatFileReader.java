package com.fileReader;

import java.util.Scanner;

import com.datacontainers.Person;
import com.datacontainers.Product;
import com.datacontainers.SaleAgreements;
import com.datacontainers.Address;
import com.datacontainers.Amenity;
import com.datacontainers.Customer;
import com.datacontainers.LeaseAgreements;
import com.datacontainers.Name;
import com.datacontainers.ParkingPass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class FlatFileReader {
	private ArrayList<Person> personArray = new ArrayList<Person>();
	private ArrayList<Customer> customerArray = new ArrayList<Customer>();
	private ArrayList<Product> productArray = new ArrayList<Product>();
	private final DateTimeFormatter DATE_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd");

	public ArrayList<Person> getPersonArray(File personInvoice) throws IOException {
		try {
			Scanner fileReader = new Scanner(personInvoice);
			//USING COMMA DELIMITER
			fileReader.useDelimiter(";|\\r");
			// ArrayList<String> emails = new ArrayList<String>();
			while (fileReader.hasNext()) {
				String personCode = fileReader.next();
				String lastName = fileReader.next();
				String firstName = fileReader.next();
				String street = fileReader.next();
				String city = fileReader.next();
				String state = fileReader.next();
				String zip = fileReader.next();
				String country = fileReader.next();
				//GET EMAIL METHOD TO WORK
				// emails.add(fileReader.next());
				String emails = fileReader.next();
				Name personName = new Name(lastName, firstName);
				Address personAddress = new Address(street, city, state, zip, country);
				Person person = new Person(personCode, personName, personAddress, emails);
				personArray.add(person);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return personArray;

	}

	public Person getPersonFromCode(String personCode) {
		for (Person p : personArray) {
			if (p.getPersonCode().equals(personCode)) {
				return p;
			}
		}
		return null;
	}

	public ArrayList<Customer> getCustomerArray(File customerInvoice) throws IOException {
		try {
			Scanner fileReader = new Scanner(customerInvoice);
			fileReader.useDelimiter(";|\\r");
			while (fileReader.hasNext()) {
				String customerCode = fileReader.next();
				String type = fileReader.next();
				String contact = fileReader.next();
				String customerName = fileReader.next();
				String street = fileReader.next();
				String city = fileReader.next();
				String state = fileReader.next();
				String zip = fileReader.next();
				String country = fileReader.next();
				//Method not working properly?
				Person person = getPersonFromCode(contact);
				Address customerAddress = new Address(street, city, state, zip, country);
				Customer customer = new Customer(customerCode, type, person, customerName, customerAddress);
				customerArray.add(customer);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return customerArray;

	}

	public ArrayList<Product> getProductArray(File productInvoice) throws IOException {
		try {
			Scanner fileReader = new Scanner(productInvoice);
			fileReader.useDelimiter(";|\\r");
			while (fileReader.hasNext()) {
				String productCode = fileReader.next();
				String type = fileReader.next();
				if (type.equals("L")) {
					String startDate = fileReader.next();
					DateTime startDateTime = DATE_FORMATTER.parseDateTime(startDate);
					String endDate = fileReader.next();
					DateTime endDateTime = DATE_FORMATTER.parseDateTime(endDate);
					String street = fileReader.next();
					String city = fileReader.next();
					String state = fileReader.next();
					String zip = fileReader.next();
					String country = fileReader.next();
					String productName = fileReader.next();
					String pricePerAppt = fileReader.next();
					Address productAddress = new Address(street, city, state, zip, country);
					LeaseAgreements la = new LeaseAgreements(productCode, type, startDateTime, endDateTime,
							productAddress, productName, pricePerAppt);
					productArray.add(la);
				}
				if (type.equals("S")) {
					String date = fileReader.next();
					DateTime dateTime = DATE_FORMATTER.parseDateTime(date);
					String street = fileReader.next();
					String city = fileReader.next();
					String state = fileReader.next();
					String zip = fileReader.next();
					String country = fileReader.next();
					String cost = fileReader.next();
					Address productAddress = new Address(street, city, state, zip, country);
					SaleAgreements sa = new SaleAgreements(productCode, type, dateTime, productAddress, cost);
					productArray.add(sa);
				}
				if (type.equals("A")) {
					String amenityName = fileReader.next();
					String cost = fileReader.next();
					Amenity a = new Amenity(productCode, type, amenityName, cost);
					productArray.add(a);
				}
				if (type.equals("P")) {
					String parkingFee = fileReader.next();
					ParkingPass pp = new ParkingPass(productCode, type, parkingFee);
					productArray.add(pp);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return productArray;
	}

}