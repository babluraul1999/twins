package com.project.dto_binding;

import java.time.LocalDate;
import java.util.List;

public class ProductForm {

	private Integer productId;
	private String productName;
	private LocalDate createOnDate;
	private List<BatchForm> batch;
	private GtinForm gtin;
	
	
	
	public ProductForm() {
		super();
	}


	public ProductForm(Integer productId, String productName, LocalDate createOnDate, List<BatchForm> batch,
			GtinForm gtin) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.createOnDate = createOnDate;
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
		return createOnDate;
	}
	public void setCreateOnDate(LocalDate createOnDate) {
		this.createOnDate = createOnDate;
	}
	public List<BatchForm> getBatch() {
		return batch;
	}
	public void setBatch(List<BatchForm> batch) {
		this.batch = batch;
	}
	public GtinForm getGtin() {
		return gtin;
	}
	public void setGtin(GtinForm gtin) {
		this.gtin = gtin;
	}
	

	
}
