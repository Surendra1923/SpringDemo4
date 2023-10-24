package com.cisco.training.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@Column(name="prodcutid")
	private Long productId;
	
	@Column(name="productname")
	private String proudctName;
	
	@Column(name="brand")
	private String brand;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Long productId, String proudctName, String brand) {
		super();
		this.productId = productId;
		this.proudctName = proudctName;
		this.brand = brand;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProudctName() {
		return proudctName;
	}

	public void setProudctName(String proudctName) {
		this.proudctName = proudctName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	
	

}
