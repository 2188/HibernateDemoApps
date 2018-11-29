package com.many2one;

public class Customer_DTO {
	
	private int c_id;
	private String c_name;
	
	private Vendor_DTO vendor;

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public Vendor_DTO getVendor() {
		return vendor;
	}

	public void setVendor(Vendor_DTO vendor) {
		this.vendor = vendor;
	}

	
	
}
