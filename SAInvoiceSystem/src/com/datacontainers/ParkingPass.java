package com.datacontainers;

public class ParkingPass extends Product {
	private String parkingFee;

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
	
	public double getTax() {
		
	}
	
	public double computeGrandTotal() {
		
	}
}
