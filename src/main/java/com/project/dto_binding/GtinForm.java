package com.project.dto_binding;


public class GtinForm {

	private Integer id;
	private String Gtin;
	private Integer productId;
	
	
	
	public GtinForm() {
		super();
	}
	public GtinForm(Integer id, String gtin, Integer productId) {
		super();
		this.id = id;
		Gtin = gtin;
		this.productId = productId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGtin() {
		return Gtin;
	}
	public void setGtin(String gtin) {
		Gtin = gtin;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
}
