package com.datacontainers;

public class ParkingPass extends Product {
	private double parkingFee;

	public ParkingPass(String productCode, String type, double parkingFee) {
		super(productCode, type);
		this.parkingFee = parkingFee;
	}

	public double getParkingFee() {
		return parkingFee;
	}

	public void setParkingFee(double parkingFee) {
		this.parkingFee = parkingFee;
	}

}
