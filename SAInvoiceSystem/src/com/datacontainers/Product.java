package com.datacontainers;

public class Product {
	private String productCode;
	private String type;

	public Product(String productCode, String type) {
		super();
		this.productCode = productCode;
		this.type = type;
	}

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

}
