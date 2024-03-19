package com.project.dto_binding;

import java.util.Date;

public class BatchForm {

	private Integer id;

	private Integer mrp;

	private Integer sp;

	private Integer purchasePrice;

	private Integer availableQuantity;

	private Date inwardedOn;

	private Integer productId;
	

	public BatchForm() {
		super();
	}

	public BatchForm(Integer id, Integer mrp, Integer sp, Integer purchasePrice, Integer availableQuantity,
			Date inwardedOn, Integer productId) {
		super();
		this.id = id;
		this.mrp = mrp;
		this.sp = sp;
		this.purchasePrice = purchasePrice;
		this.availableQuantity = availableQuantity;
		this.inwardedOn = inwardedOn;
		this.productId = productId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMrp() {
		return mrp;
	}

	public void setMrp(Integer mrp) {
		this.mrp = mrp;
	}

	public Integer getSp() {
		return sp;
	}

	public void setSp(Integer sp) {
		this.sp = sp;
	}

	public Integer getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Integer purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Date getInwardedOn() {
		return inwardedOn;
	}

	public void setInwardedOn(Date inwardedOn) {
		this.inwardedOn = inwardedOn;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	

}
