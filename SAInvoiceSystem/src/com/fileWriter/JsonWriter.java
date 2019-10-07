package com.fileWriter;

import com.customers.Customer;
import com.datacontainers.Person;
import com.products.Product;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

import org.joda.time.DateTime;import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class JsonWriter {
	
	/** Writes Person objects in JSON format */
	public String toJsonStringPerson(ArrayList<Person> jsonPersonArray) {
	Gson gson = new GsonBuilder().registerTypeAdapter(DateTime.class, serializer1).setPrettyPrinting().create();
	String jsonString = gson.toJson(jsonPersonArray);
	
	return jsonString;
	}
	
	/** Writes Customer objects in JSON format */
	public String toJsonStringCustomer(ArrayList<Customer> jsonCustomerArray) {
		Gson gson = new GsonBuilder().registerTypeAdapter(DateTime.class, serializer1).setPrettyPrinting().create();
		String jsonString = gson.toJson(jsonCustomerArray);
		
		return jsonString;
		}
	
	/** Writes Product objects in JSON format */
	public String toJsonStringProduct(ArrayList<Product> jsonProductArray) {
		Gson gson = new GsonBuilder().registerTypeAdapter(DateTime.class, serializer2).setPrettyPrinting().create();
		String jsonString = gson.toJson(jsonProductArray);
		
		return jsonString;
		}
	
	/** Serializes Start Date and End Date for Lease Agreements*/
	private static JsonSerializer<DateTime> serializer1 = new JsonSerializer<DateTime>() {
		  @Override
		  public JsonElement serialize(DateTime dateTime, Type typeOfSrc, JsonSerializationContext 
			             context) {
	     
			  String dtString = dateTime.toString("yyyy-MM-dd");
		      return new JsonPrimitive(dtString);
			  
		  }
		};
	
	/** Serializes Date Time for Sale Agreements*/	
	private static JsonSerializer<DateTime> serializer2 = new JsonSerializer<DateTime>() {
		  @Override
		  public JsonElement serialize(DateTime dateTime, Type typeOfSrc, JsonSerializationContext 
				             context) {
		     
			  String dtString = dateTime.toString("yyyy-MM-dd kk:mm");
			  return new JsonPrimitive(dtString);
				  
			  }
			};
	
}
