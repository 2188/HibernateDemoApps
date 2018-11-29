package com.vendor_customer;

import java.util.Set;

public class Vendor_DTO {
	
	private int vendorID;
	private String vendorName;
	
	private Set customers;
	
	public int getVendorID() {
		return vendorID;
	}
	public void setVendorID(int vendorID) {
		this.vendorID = vendorID;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public Set getCustomers() {
		return customers;
	}
	public void setCustomers(Set customers) {
		this.customers = customers;
	}

	
	
}
