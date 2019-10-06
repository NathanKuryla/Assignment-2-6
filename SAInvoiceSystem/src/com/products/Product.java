package com.products;

import com.datacontainers.Taxable;

abstract public class Product implements Taxable {
	private String productCode;
	private String productType;

	/** Creates Product Constructor with specified attributes */
	public Product(String productCode, String productType) {
		super();
		this.productCode = productCode;
		this.productType = productType;
	}

	/** Getter and Setter Methods for Product Class */

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductType() {
		return productType;
	}

	public void setType(String productType) {
		this.productType = productType;
	}
	
	public abstract double getTax();
	public abstract double computeGrandTotal();
}
