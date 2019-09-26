package com.fileWriter;

import com.datacontainers.Customer;
import com.datacontainers.Person;
import com.datacontainers.Product;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;

public class JsonWriter {
	
	/** Writes Person objects in JSON format */
	public String toJsonStringPerson(ArrayList<Person> jsonPersonArray) {
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	String jsonString = gson.toJson(jsonPersonArray);
	
	return jsonString;
	}
	
	/** Writes Customer objects in JSON format */
	public String toJsonStringCustomer(ArrayList<Customer> jsonCustomerArray) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonString = gson.toJson(jsonCustomerArray);
		
		return jsonString;
		}
	
	/** Writes Product objects in JSON format */
	public String toJsonStringProduct(ArrayList<Product> jsonProductArray) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonString = gson.toJson(jsonProductArray);
		
		return jsonString;
		}
}
