package com.datacontainers;

public class Product {
	private String productCode;
	private String type;

	/** Creates Product Constructor with specified attributes */
	public Product(String productCode, String type) {
		super();
		this.productCode = productCode;
		this.type = type;
	}
	
	/** Getter and Setter Methods for Product Class */
	
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", type=" + type + "]";
	}

	
}
