package com.reports;


import com.fileReader.FlatFileReader;
import com.fileWriter.JsonWriter;
import com.fileWriter.XMLWriter;


import java.io.File;
import java.io.IOException;


public class DataConverter {

	public static void main(String[] args) throws IOException {
		
		FlatFileReader fr = new FlatFileReader();
		File personInvoice = new File("C:\\Users\\Public\\Documents\\Example.txt");
		File customerInvoice = new File("C:\\Users\\Public\\Documents\\Example2.txt");
		File productInvoice = new File("C:\\Users\\Public\\Documents\\Example3.txt");
		System.out.println(fr.getPersonArray(personInvoice));
		System.out.println(fr.getCustomerArray(customerInvoice));
	//	System.out.println(fr.getProductArray(productInvoice));
	
	//	JsonWriter jw = new JsonWriter();
	//	System.out.println(jw.toJsonStringPerson(fr.getPersonArray(personInvoice)));
	//	System.out.println(jw.toJsonStringCustomer(fr.getCustomerArray(customerInvoice)));
	//	System.out.println(jw.toJsonStringProduct(fr.getProductArray(productInvoice)));
		
	//	XMLWriter xw = new XMLWriter();
	//	System.out.println(xw.toXmlStringPerson(fr.getPersonArray(personInvoice)));
	//	System.out.println(xw.toXmlStringCustomer(fr.getCustomerArray(customerInvoice)));
	//	System.out.println(xw.toXmlStringProduct(fr.getProductArray(productInvoice)));
		
	}

}
