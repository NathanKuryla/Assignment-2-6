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
	private final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormat.forPattern("yyy-MM-dd kk:mm");

	/**
	 * Reads through person invoice files token by token using Scanner and stores
	 * each token into strings. The strings are then used as attributes to create
	 * Objects that then help construct the Person Object. Once the Person Object is
	 * constructed, the the Person objects are added to the personArray that stores
	 * all the Person Objects read from the file. The method then returns the
	 * personArray of all the Person objects.
	 */
	public ArrayList<Person> getPersonArray(File personInvoice) throws IOException {
		try {
			Scanner fileReader = new Scanner(personInvoice);
			ArrayList<String> emails = new ArrayList<String>();
			while (fileReader.hasNext()) {
				String line = fileReader.nextLine();
				String tokens[] = line.split(";");
				String personCode = tokens[0];
				String nameTokens[] = tokens[1].split(",");
				String lastName = nameTokens[0];
				String firstName = nameTokens[1];
				String addressTokens[] = tokens[2].split(",");
				String street = addressTokens[0];
				String city = addressTokens[1];
				String state = addressTokens[2];
				String zip = addressTokens[3];
				String country = addressTokens[4];
				String emailTokens[] = tokens[3].split(",");
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

	/**
	 * The method of type Person gets a Person object from the personArray with the
	 * person code as an argument. If the person code in the argument equals a
	 * person code from the personArray, that Person object is returned. If they are
	 * not equal, the method returns null.
	 */
	public Person getPersonFromCode(String personCode) {
		for (Person p : personArray) {
			if (p.getPersonCode().equals(personCode)) {
				return p;
			}
		}
		return null;
	}

	/**
	 * Reads through customer invoice files token by token using Scanner and stores
	 * each token into strings. The strings are then used as attributes to create
	 * Objects that then help construct the Customer Object. Once the Customer
	 * Object is constructed, the Customer objects are added to the customerArray
	 * that stores all the Customer Objects read from the file. The method then
	 * returns the customerArray of all the Customer objects.
	 */
	public ArrayList<Customer> getCustomerArray(File customerInvoice) throws IOException {
		try {
			Scanner fileReader = new Scanner(customerInvoice);
			while (fileReader.hasNext()) {
				String line = fileReader.nextLine();
				String tokens[] = line.split(";");
				String customerCode = tokens[0];
				String type = tokens[1];
				String contact = tokens[2];
				String customerName = tokens[3];
				String addressTokens[] = tokens[4].split(",");
				String street = addressTokens[0];
				String city = addressTokens[1];
				String state = addressTokens[2];
				String zip = addressTokens[3];
				String country = addressTokens[4];
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

	/**
	 * Reads through product invoice files token by token using Scanner and stores
	 * each token into strings. The strings are then used as attributes to create
	 * Objects that then help construct the specified Product Object based on the
	 * type of Product. Once the Product Object is constructed, the Product objects
	 * are added to the productArray that stores all the Product Objects read from
	 * the file. The method then returns the productArray of all the Product
	 * objects.
	 */
	public ArrayList<Product> getProductArray(File productInvoice) throws IOException {
		try {
			Scanner fileReader = new Scanner(productInvoice);
			while (fileReader.hasNext()) {
				String line = fileReader.nextLine();
				String tokens[] = line.split(";");
				String productCode = tokens[0];
				String type = tokens[1];
				if (type.equals("L")) {
					String startDate = tokens[2];
					DateTime startDateTime = DATE_FORMATTER.parseDateTime(startDate);
					String endDate = tokens[3];
					DateTime endDateTime = DATE_FORMATTER.parseDateTime(endDate);
					String addressTokens[]  = tokens[4].split(",");
					String street = addressTokens[0];
					String city = addressTokens[1];
					String state = addressTokens[2];
					String zip = addressTokens[3];
					String country = addressTokens[4];
					String productName = tokens[4];
					String pricePerAppt = tokens[5];
					Address productAddress = new Address(street, city, state, zip, country);
					LeaseAgreements la = new LeaseAgreements(productCode, type, startDateTime, endDateTime,
							productAddress, productName, pricePerAppt);
					productArray.add(la);
				}
				if (type.equals("S")) {
					String date = tokens[2];
					DateTime dateTime = DATE_TIME_FORMATTER.parseDateTime(date);
					String addressTokens[]  = tokens[3].split(",");
					String street = addressTokens[0];
					String city = addressTokens[1];
					String state = addressTokens[2];
					String zip = addressTokens[3];
					String country = addressTokens[4];
					String cost = tokens[4];
					Address productAddress = new Address(street, city, state, zip, country);
					SaleAgreements sa = new SaleAgreements(productCode, type, dateTime, productAddress, cost);
					productArray.add(sa);
				}
				if (type.equals("A")) {
					String amenityName = tokens[2];
					String cost = tokens[3];
					Amenity a = new Amenity(productCode, type, amenityName, cost);
					productArray.add(a);
				}
				if (type.equals("P")) {
					String parkingFee = tokens[2];
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