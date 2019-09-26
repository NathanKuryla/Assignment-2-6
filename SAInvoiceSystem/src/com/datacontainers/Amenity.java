package com.datacontainers;

public class Amenity extends Product {
	private String amenityName;
	private String cost;

	public Amenity(String productCode, String type, String amenityName, String cost) {
		super(productCode, type);
		this.amenityName = amenityName;
		this.cost = cost;
	}

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
	
}
