package com.rollingstone.spring.integration.po.domain;

import java.util.Date;

public class Vendor {

	int vendorId;

	String vendorShortName;

	String vendorName;

	Date regDate;

	String vendorStatus;

	float payableAmt;

	Address vendorAddress;

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorShortName() {
		return vendorShortName;
	}

	public void setVendorShortName(String vendorShortName) {
		this.vendorShortName = vendorShortName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getVendorStatus() {
		return vendorStatus;
	}

	public void setVendorStatus(String vendorStatus) {
		this.vendorStatus = vendorStatus;
	}

	public float getPayableAmt() {
		return payableAmt;
	}

	public void setPayableAmt(float payableAmt) {
		this.payableAmt = payableAmt;
	}

	public Address getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(Address vendorAddress) {
		this.vendorAddress = vendorAddress;
	}


}