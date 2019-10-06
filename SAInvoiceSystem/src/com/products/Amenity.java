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
		tax = subTotal * .04;
		return tax;
	}
	
	public double computeGrandTotal() {
		grandTotal = subTotal + tax;
		return grandTotal;
	}
	
	public double computeDiscountedGrandTotal() {
		grandTotal = (subTotal + tax) * .95;
		return grandTotal;
	}
}
