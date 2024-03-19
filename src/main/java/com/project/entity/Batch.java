package com.project.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="batch")
public class Batch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="mrp")
	private Integer mrp;
	@Column(name = "sp")
	private Integer sp;
	@Column(name="purchasePrice")
	private Integer purchasePrice;
	@Column(name="availableQuantity")
	private Integer availableQuantity;
	@Column(name="inwardedOn")
	private Date inwardedOn;
	
	
	public Batch() {
		super();
	}
	public Batch(Integer id, Integer mrp, Integer sp, Integer purchasePrice, Integer availableQuantity, Date inwardedOn,
			Integer productId) {
		super();
		this.id = id;
		this.mrp = mrp;
		this.sp = sp;
		this.purchasePrice = purchasePrice;
		this.availableQuantity = availableQuantity;
		this.inwardedOn = inwardedOn;
		this.productId = productId;
	}
	@Column(name="product_Id")
	private Integer productId;
	
	
	
	
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
	
	
	
	

}
