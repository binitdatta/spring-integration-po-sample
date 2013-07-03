package com.rollingstone.spring.integration.po.domain;


public class PurchaseOrderDetails {

	PurchaseOrderSummary po;
	long poDetailId;
	Item item;
	float quantity;
	float unitPrice;
	float salesTax;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public PurchaseOrderSummary getPo() {
		return po;
	}

	public void setPo(PurchaseOrderSummary po) {
		this.po = po;
	}

	public long getPoDetailId() {
		return poDetailId;
	}

	public void setPoDetailId(long poDetailId) {
		this.poDetailId = poDetailId;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public float getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(float salesTax) {
		this.salesTax = salesTax;
	}


}
