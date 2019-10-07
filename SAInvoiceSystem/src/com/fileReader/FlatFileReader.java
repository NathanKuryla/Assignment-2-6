package com.fileReader;

import java.util.Scanner;

import com.datacontainers.Person;
import com.products.SaleAgreements;
import com.products.ParkingPass;
import com.products.Product;
import com.customers.Customer;
import com.customers.General;
import com.customers.LowIncome;
import com.datacontainers.Address;
import com.products.Amenity;
import com.datacontainers.Invoice;
import com.products.LeaseAgreements;
import com.datacontainers.Name;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class FlatFileReader {
	private ArrayList<Person> personArray = new ArrayList<Person>();
	private ArrayList<Customer> customerArray = new ArrayList<Customer>();
	private ArrayList<Product> productArray = new ArrayList<Product>();
	private ArrayList<Invoice> invoiceArray = new ArrayList<Invoice>();
	private final DateTimeFormatter DATE_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd");
	private final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd kk:mm");

	/**
	 * Uses Scanner to read through the person .dat files and stores each line in the line string.
	 * Then splits each part of the line up into tokens with the delimiter ";", and
	 * further splits up each token with specific tokens with the delimiter ",".
	 * Once the Person Object is constructed, the Person objects are added to the
	 * personArray that stores all the Person Objects read from the file. The method
	 * then returns the personArray of all the Person objects.
	 */
	public ArrayList<Person> getPersonArray(File personInvoice) {
		try {
			Scanner fileReader = new Scanner(personInvoice);
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
				/* Loop for adding e-mails **/
				ArrayList<String> emails = new ArrayList<String>();
				if (tokens.length > 3) {
					String emailTokens[] = tokens[3].split(",");
					for (int i = 0; i < tokens[3].split(",").length; i++) {
						emails.add(emailTokens[i]);
					}
				} else {
					emails.add("");
				}
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
	 * Uses Scanner to read through the customer .dat files and stores each line in the line
	 * string. Then splits each part of the line up into tokens with the delimiter
	 * ";", and further splits up each token with specific tokens with the delimiter
	 * ",". Once the Customer Object is constructed, the Customer objects are added
	 * to the customerArray that stores all the Customer Objects read from the file.
	 * The method then returns the customerArray of all the Customer objects.
	 */
	public ArrayList<Customer> getCustomerArray(File customerInvoice) {
		try {
			Scanner fileReader = new Scanner(customerInvoice);
			while (fileReader.hasNext()) {
				String line = fileReader.nextLine();
				String tokens[] = line.split(";");
				String customerCode = tokens[0];
				String type = tokens[1];
				String primaryContact = tokens[2];
				String customerName = tokens[3];
				String addressTokens[] = tokens[4].split(",");
				String street = addressTokens[0];
				String city = addressTokens[1];
				String state = addressTokens[2];
				String zip = addressTokens[3];
				String country = addressTokens[4];
				Person person = getPersonFromCode(primaryContact);
				Address customerAddress = new Address(street, city, state, zip, country);
				if (type.equals("G")) {
					General generalCustomer = new General(customerCode, type, person, customerName, customerAddress);
					customerArray.add(generalCustomer);
				}
				if (type.equals("L")) {
					LowIncome lowIncomeCustomer = new LowIncome(customerCode, type, person, customerName, customerAddress);
					customerArray.add(lowIncomeCustomer);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return customerArray;
	}

	public Customer getCustomerFromCode(String customerCode) {
		for (Customer c : customerArray) {
			if (c.getCustomerCode().equals(customerCode)) {
				return c;
			}
		}
		return null;
	}
	/**
	 * Uses Scanner to read through the product .dat files and stores each line in the line string.
	 * Then splits each part of the line up into tokens with the delimiter ";", and
	 * further splits up each token with specific tokens with the delimiter ",".
	 * There isn't just one product, so each product is identified by its type, and
	 * depending on the type, different tokens are read by the Scanner. Once the
	 * Product Object is constructed, the Product objects are added to the
	 * productArray that stores all the Product Objects read from the file. The
	 * method then returns the productArray of all the Product objects.
	 */
	public ArrayList<Product> getProductArray(File productInvoice) {
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
					String addressTokens[] = tokens[4].split(",");
					String street = addressTokens[0];
					String city = addressTokens[1];
					String state = addressTokens[2];
					String zip = addressTokens[3];
					String country = addressTokens[4];
					String customerName = tokens[4];
					String monthlyCost = tokens[5];
					Address productAddress = new Address(street, city, state, zip, country);
					LeaseAgreements la = new LeaseAgreements(productCode, type, startDateTime, endDateTime,
							productAddress, customerName, monthlyCost);
					productArray.add(la);
				}
				if (type.equals("S")) {
					String date = tokens[2];
					DateTime dateTime = DATE_TIME_FORMATTER.parseDateTime(date);
					String addressTokens[] = tokens[3].split(",");
					String street = addressTokens[0];
					String city = addressTokens[1];
					String state = addressTokens[2];
					String zip = addressTokens[3];
					String country = addressTokens[4];
					String totalCost = tokens[3];
					String downPayment = tokens[4];
					String monthlyPayment = tokens[5];
					String payableMonths = tokens[6];
					String interestRate = tokens[7];
					Address productAddress = new Address(street, city, state, zip, country);
					SaleAgreements sa = new SaleAgreements(productCode, type, dateTime, productAddress, totalCost, downPayment, monthlyPayment, payableMonths, interestRate);
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
	
	public Product getProductFromCode(String productCode) {
		for (Product p : productArray) {
			if (p.getProductCode().equals(productCode)) {
				return p;
			}
		}
		return null;
	}
	
	public ArrayList<Invoice> getInvoiceArray (File file) {
		try {
			Scanner fileReader = new Scanner(file);
			while (fileReader.hasNext()) {
				String line = fileReader.nextLine();
				String tokens[] = line.split(";");
				String invoiceCode = tokens[0];
				String customerCode = tokens[1];
				Customer customer = getCustomerFromCode(customerCode);
				String realtorCode = tokens[2];
				Person realtor = getPersonFromCode(realtorCode);
				String date = tokens[3];
				DateTime invoiceDate = DATE_FORMATTER.parseDateTime(date);
				/* Loop for adding products **/
				ArrayList<Product> productList = new ArrayList<Product>();
				//Find out how to deal with colon stuff
				if (tokens.length > 4) {
					String productTokens[] = tokens[4].split(",");
					for (int i = 0; i < tokens[4].split(",").length; i++) {
						Product product = getProductFromCode(productTokens[i]); 
						productList.add(product);
					}
				} else {
					productList.add(null);
				}
				Invoice invoice = new Invoice(invoiceCode, customer, realtor, invoiceDate, productList);
				invoiceArray.add(invoice);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return invoiceArray;
	}

}