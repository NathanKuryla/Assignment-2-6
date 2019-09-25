package com.fileReader;

import java.util.Scanner;

import com.datacontainers.Person;
import com.datacontainers.Product;
import com.datacontainers.Address;
import com.datacontainers.Customer;
import com.datacontainers.Name;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class FlatFileReader {
	private ArrayList<Person> personArray = new ArrayList<Person>();
	private ArrayList<Customer> customerArray = new ArrayList<Customer>();
	private ArrayList<Product> productArray = new ArrayList<Product>();
	// private final DateTimeFormatter DATE_FORMATTER = DateTimeFormat.forPattern("MM-dd-yyyy");

	public ArrayList<Person> getPersonReader(File invoice) throws IOException {
		try {
			Scanner fileReader = new Scanner(invoice);
			fileReader.useDelimiter(",");
			while (fileReader.hasNext()) {
				String personCode = fileReader.next();
				String lastName = fileReader.next();
				String firstName = fileReader.next();
				String street = fileReader.next();
				String city = fileReader.next();
				String state = fileReader.next();
				String zip = fileReader.next();
				String country = fileReader.next();
				ArrayList<String> emails = new ArrayList<String>();
				emails.add(fileReader.next());
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

	public ArrayList<Customer> getCustomerArray(File invoice) throws IOException {
		try {
			Scanner fileReader = new Scanner(invoice);
			fileReader.useDelimiter(",");
			while (fileReader.hasNext()) {
				String customerCode = fileReader.next();
				String type = fileReader.next();
				String name = fileReader.next();
				String street = fileReader.next();
				String city = fileReader.next();
				String state = fileReader.next();
				String zip = fileReader.next();
				String country = fileReader.next();
				Address customerAddress = new Address(street, city, state, zip, country);
				//Customer customer = new Customer(customerCode, type, name, customerAddress);
				//customerArray.add(fileReader.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return customerArray;

	}

}
