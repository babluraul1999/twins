package com.project.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;






@Entity
@Table(name="product_table")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="product_id")
	private Integer productId;
	@Column(name="product_name")
	private String productName;
	@Column(name = "createon")
	private LocalDate createOn;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
	private List<Batch> batch;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
	private Gtin gtin;
	
	
	public Product() {
	}
	
	public Product(Integer productId, String productName, LocalDate createOn, List<Batch> batch, Gtin gtin) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.createOn = createOn;
		this.batch = batch;
		this.gtin = gtin;
	}
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public LocalDate getCreateOnDate() {
		return createOn;
	}
	public void setCreateOnDate(LocalDate createOnDate) {
		this.createOn = createOnDate;
	}

	public LocalDate getCreateOn() {
		return createOn;
	}

	public void setCreateOn(LocalDate createOn) {
		this.createOn = createOn;
	}

	public List<Batch> getBatch() {
		return batch;
	}

	public void setBatch(List<Batch> batch) {
		this.batch = batch;
	}

	public Gtin getGtin() {
		return gtin;
	}

	public void setGtin(Gtin gtin) {
		this.gtin = gtin;
	}
	
	
	
}
