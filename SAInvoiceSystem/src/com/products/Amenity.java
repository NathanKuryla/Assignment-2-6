package com.products;

public class Amenity extends Product {
	private String amenityName;
	private String cost;
	private double tax;
	private double grandTotal;
	private double subTotal = Double.parseDouble(cost);

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
	
	public double getSubTotal() {
		return subTotal;
	}
	
	public double getTax() {
		tax = 0.04;
		return tax;
	}
}
