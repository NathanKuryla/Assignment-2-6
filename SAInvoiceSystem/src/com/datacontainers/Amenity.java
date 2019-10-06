package com.datacontainers;

public class Amenity extends Product {
	private String amenityName;
	private String cost;

	/** Creates Amenity Constructor with specified attributes */
	public Amenity(String productCode, String type, String amenityName, String cost) {
		super(productCode, type);
		this.amenityName = amenityName;
		this.cost = cost;
	}

	/** Getter and Setter Methods for Amenity Class */

	public String getName() {
		return amenityName;
	}

	public void setName(String name) {
		this.amenityName = name;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public double getTax() {
		
	}
	
	public double computeGrandTotal() {
		
	}
}
