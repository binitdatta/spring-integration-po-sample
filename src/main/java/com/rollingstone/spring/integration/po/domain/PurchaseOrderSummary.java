package com.rollingstone.spring.integration.po.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PurchaseOrderSummary {

	long poId;
	String poNumber;
	Date poDate;
	Vendor vendor;
	Address poDeliveryLocation;
	Address billingAddress;
	boolean localPO;
	boolean rateContract;
	boolean foreignPO;
	BigDecimal localPoAmount;
	BigDecimal foreignPoAmount;
	BigDecimal rateContractAmount;

	public static final String PURCHASEORDER_LOCAL = "'local";
	public static final String PURCHASEORDER_FOREIGN = "foreign";
	public static final String PURCHASEORDER_RATECONTRACT = "ratecontract";

	public BigDecimal getLocalPoAmount() {
		return localPoAmount;
	}

	public void setLocalPoAmount(BigDecimal localPoAmount) {
		this.localPoAmount = localPoAmount;
	}

	public BigDecimal getForeignPoAmount() {
		return foreignPoAmount;
	}

	public void setForeignPoAmount(BigDecimal foreignPoAmount) {
		this.foreignPoAmount = foreignPoAmount;
	}

	public BigDecimal getRateContractAmount() {
		return rateContractAmount;
	}

	public void setRateContractAmount(BigDecimal rateContractAmount) {
		this.rateContractAmount = rateContractAmount;
	}

	public boolean isLocalPO() {
		return localPO;
	}

	public void setLocalPO(boolean localPO) {
		this.localPO = localPO;
	}

	public boolean isRateContract() {
		return rateContract;
	}

	public void setRateContract(boolean rateContract) {
		this.rateContract = rateContract;
	}

	public boolean isForeignPO() {
		return foreignPO;
	}

	public void setForeignPO(boolean foreignPO) {
		this.foreignPO = foreignPO;
	}

	List<PurchaseOrderDetails> items;

	public List<PurchaseOrderDetails> getItems() {
		return items;
	}

	public void setItems(List<PurchaseOrderDetails> items) {
		this.items = items;
	}

	public PurchaseOrderSummary() {

	}

	public long getPoId() {
		return poId;
	}

	public void setPoId(long poId) {
		this.poId = poId;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public Date getPoDate() {
		return poDate;
	}

	public void setPoDate(Date poDate) {
		this.poDate = poDate;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public Address getPoDeliveryLocation() {
		return poDeliveryLocation;
	}

	public void setPoDeliveryLocation(Address poDeliveryLocation) {
		this.poDeliveryLocation = poDeliveryLocation;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}


}
