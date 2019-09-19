package com.datacontainers;

public class Amenity extends Product {
	private String name;
	private String cost;

	public Amenity(String productCode, String type, String name, String cost) {
		super(productCode, type);
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}
	
}
