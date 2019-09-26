package com.reports;


import com.fileReader.FlatFileReader;
import com.fileWriter.JsonWriter;
import com.fileWriter.XMLWriter;


import java.io.File;
import java.io.IOException;


public class DataConverter {

	public static void main(String[] args) throws IOException {
		
		/** Creates FileReader to read files and store data from .dat invoice files into an array of objects */
		FlatFileReader fr = new FlatFileReader();
		
		/** Imports .dat invoice files in*/
		File personInvoice = new File("C:\\Users\\Public\\Downloads\\Persons.dat");
		File customerInvoice = new File("C:\\Users\\Public\\Documents\\Customers.dat");
		File productInvoice = new File("C:\\Users\\Public\\Documents\\Products.dat");
		

		//System.out.println(fr.getPersonArray(personInvoice));
		//System.out.println(fr.getCustomerArray(customerInvoice));
		System.out.println(fr.getProductArray(productInvoice));

		/** Converts objects into JSON format using JsonWriter class*/
		JsonWriter jw = new JsonWriter();
		//System.out.println(jw.toJsonStringPerson(fr.getPersonArray(personInvoice)));
		//System.out.println(jw.toJsonStringCustomer(fr.getCustomerArray(customerInvoice)));
		//System.out.println(jw.toJsonStringProduct(fr.getProductArray(productInvoice)));
		
		/** Converts objects into XML format using XML class */
		XMLWriter xw = new XMLWriter();
		//System.out.println(xw.toXmlStringPerson(fr.getPersonArray(personInvoice)));
		//System.out.println(xw.toXmlStringCustomer(fr.getCustomerArray(customerInvoice)));
		//System.out.println(xw.toXmlStringProduct(fr.getProductArray(productInvoice)));

		
	}

}
