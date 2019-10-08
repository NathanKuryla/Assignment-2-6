package com.products;

public class ParkingPass extends Product {
	private String parkingFee;
	private double tax;
	private double grandTotal;
	private double subTotal = Double.parseDouble(parkingFee);

	/** Creates ParkingPass Constructor with specified attributes */
	public ParkingPass(String productCode, String type, String parkingFee) {
		super(productCode, type);
		this.parkingFee = parkingFee;
	}

	/** Getter and Setter Methods for ParkingPass Class */
	
	public String getParkingFee() {
		return parkingFee;
	}

	public void setParkingFee(String parkingFee) {
		this.parkingFee = parkingFee;
	}
	
	public double getSubTotal() {
		return subTotal;
	}
	
	
	/** Methods used to find calculated values */
	
	public double getTax() {
		tax = subTotal * .04;
		return subTotal;
	}
	
	public double computeGrandTotal() {
		grandTotal = subTotal + tax;
		return grandTotal;
	}
	
	public double computeLeaseGrandTotal() {
		grandTotal = 0.0;
		return grandTotal;
	}
}
