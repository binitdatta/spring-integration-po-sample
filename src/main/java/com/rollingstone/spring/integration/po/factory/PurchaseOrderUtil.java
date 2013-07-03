package com.rollingstone.spring.integration.po.factory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rollingstone.spring.integration.po.domain.Address;
import com.rollingstone.spring.integration.po.domain.Item;
import com.rollingstone.spring.integration.po.domain.PurchaseOrderDetails;
import com.rollingstone.spring.integration.po.domain.PurchaseOrderSummary;
import com.rollingstone.spring.integration.po.domain.Vendor;
import com.rollingstone.spring.integration.po.domain.VendorPurchaseOrderLineItem;
import com.rollingstone.spring.integration.po.domain.VendorPurchaseOrderSummary;

public class PurchaseOrderUtil {

	public static PurchaseOrderSummary createLocalPO() {

		PurchaseOrderSummary poSummary = new PurchaseOrderSummary();

		poSummary.setBillingAddress(createLocalAddress());
		poSummary.setLocalPO(true);
		poSummary.setForeignPO(false);
		poSummary.setRateContract(false);
		poSummary.setLocalPoAmount(new BigDecimal(3000));
		poSummary.setPoDate(new Date());
		poSummary.setPoNumber("PO/2013-2014/local/0001");
		poSummary.setVendor(createLocalVendor());
		poSummary.setPoDeliveryLocation(createLocalShippingAddress());

		poSummary.setItems(createLocalClothesItem());

		return poSummary;

	}

	public static PurchaseOrderSummary createForeignPO() {

		PurchaseOrderSummary poSummary = new PurchaseOrderSummary();

		poSummary.setBillingAddress(createForeignAddress());
		poSummary.setLocalPO(false);
		poSummary.setForeignPO(true);
		poSummary.setRateContract(false);
		poSummary.setForeignPoAmount(new BigDecimal(4000));
		poSummary.setPoDate(new Date());
		poSummary.setPoNumber("PO/2013-2014/foreign/0001");
		poSummary.setVendor(createForeignVendor());
		poSummary.setPoDeliveryLocation(createLocalShippingAddress());

		poSummary.setItems(createForeignFurnituresItem());

		return poSummary;

	}

	public static PurchaseOrderSummary createRateContractPO() {

		PurchaseOrderSummary poSummary = new PurchaseOrderSummary();

		poSummary.setBillingAddress(createForeignAddress());
		poSummary.setLocalPO(false);
		poSummary.setForeignPO(false);
		poSummary.setRateContract(true);
		poSummary.setRateContractAmount(new BigDecimal(2000));
		poSummary.setPoDate(new Date());
		poSummary.setPoNumber("PO/2013-2014/RC/0001");
		poSummary.setVendor(createRateContractVendor());
		poSummary.setPoDeliveryLocation(createLocalShippingAddress());

		poSummary.setItems(createRateContractFoodItem());

		return poSummary;
	}

	public static PurchaseOrderSummary createLocalHighValuePO() {

		PurchaseOrderSummary poSummary = new PurchaseOrderSummary();

		poSummary.setBillingAddress(createLocalAddress());
		poSummary.setLocalPO(true);
		poSummary.setForeignPO(false);
		poSummary.setRateContract(false);
		poSummary.setLocalPoAmount(new BigDecimal(7000));
		poSummary.setPoDate(new Date());
		poSummary.setPoNumber("PO/2013-2014/local/0002");
		poSummary.setVendor(createLocalVendor());
		poSummary.setPoDeliveryLocation(createLocalShippingAddress());

		poSummary.setItems(createLocalClothesItem());

		return poSummary;

	}

	public static PurchaseOrderSummary createForeignHighValuePO() {

		PurchaseOrderSummary poSummary = new PurchaseOrderSummary();

		poSummary.setBillingAddress(createForeignAddress());
		poSummary.setLocalPO(false);
		poSummary.setForeignPO(true);
		poSummary.setRateContract(false);
		poSummary.setForeignPoAmount(new BigDecimal(8000));
		poSummary.setPoDate(new Date());
		poSummary.setPoNumber("PO/2013-2014/foreign/0002");
		poSummary.setVendor(createForeignVendor());
		poSummary.setPoDeliveryLocation(createLocalShippingAddress());

		poSummary.setItems(createForeignFurnituresItem());

		return poSummary;

	}

	public static PurchaseOrderSummary createHighValueRateContractPO() {

		PurchaseOrderSummary poSummary = new PurchaseOrderSummary();

		poSummary.setBillingAddress(createForeignAddress());
		poSummary.setLocalPO(false);
		poSummary.setForeignPO(false);
		poSummary.setRateContract(true);
		poSummary.setRateContractAmount(new BigDecimal(9000));
		poSummary.setPoDate(new Date());
		poSummary.setPoNumber("PO/2013-2014/RC/0002");
		poSummary.setVendor(createRateContractVendor());
		poSummary.setPoDeliveryLocation(createLocalShippingAddress());

		poSummary.setItems(createRateContractFoodItem());

		return poSummary;
	}
	
	public static VendorPurchaseOrderSummary createVendorLocalPO() {

		VendorPurchaseOrderSummary poSummary = new VendorPurchaseOrderSummary();

		poSummary.setBillingAddress(createLocalAddress());
		poSummary.setLocalPO(true);
		poSummary.setForeignPO(false);
		poSummary.setRateContract(false);
		poSummary.setLocalPoAmount(new BigDecimal(3000));
		poSummary.setPoDate(new Date());
		poSummary.setPoNumber("PO/2013-2014/local/0001");
		poSummary.setVendor(createLocalVendor());
		poSummary.setPoDeliveryLocation(createLocalShippingAddress());

		poSummary.setItems(createVendorLocalClothesItem());

		return poSummary;

	}

	public static VendorPurchaseOrderSummary createVendorForeignPO() {

		VendorPurchaseOrderSummary poSummary = new VendorPurchaseOrderSummary();

		poSummary.setBillingAddress(createForeignAddress());
		poSummary.setLocalPO(false);
		poSummary.setForeignPO(true);
		poSummary.setRateContract(false);
		poSummary.setForeignPoAmount(new BigDecimal(4000));
		poSummary.setPoDate(new Date());
		poSummary.setPoNumber("PO/2013-2014/foreign/0001");
		poSummary.setVendor(createForeignVendor());
		poSummary.setPoDeliveryLocation(createLocalShippingAddress());

		poSummary.setItems(createVendorForeignFurnituresItem());

		return poSummary;

	}

	public static VendorPurchaseOrderSummary createVendorRateContractPO(
			PurchaseOrderSummary po) {

		VendorPurchaseOrderSummary poSummary = new VendorPurchaseOrderSummary();

		poSummary.setBillingAddress(createForeignAddress());
		poSummary.setLocalPO(false);
		poSummary.setForeignPO(false);
		poSummary.setRateContract(true);
		poSummary.setRateContractAmount(new BigDecimal(2000));
		poSummary.setPoDate(new Date());
		poSummary.setPoNumber("PO/2013-2014/RC/0001");
		poSummary.setVendor(createRateContractVendor());
		poSummary.setPoDeliveryLocation(createLocalShippingAddress());

		poSummary.setItems(createVendorRateContractFoodItem());

		return poSummary;
	}

	public static VendorPurchaseOrderSummary createVendorLocalHighValuePO(
			PurchaseOrderSummary po) {

		VendorPurchaseOrderSummary poSummary = new VendorPurchaseOrderSummary();

		poSummary.setBillingAddress(createLocalAddress());
		poSummary.setLocalPO(true);
		poSummary.setForeignPO(false);
		poSummary.setRateContract(false);
		poSummary.setLocalPoAmount(new BigDecimal(7000));
		poSummary.setPoDate(new Date());
		poSummary.setPoNumber("PO/2013-2014/local/0002");
		poSummary.setVendor(createLocalVendor());
		poSummary.setPoDeliveryLocation(createLocalShippingAddress());

		poSummary.setItems(createVendorLocalClothesItem());

		return poSummary;

	}

	public static VendorPurchaseOrderSummary createVendorForeignHighValuePO(
			PurchaseOrderSummary po) {

		VendorPurchaseOrderSummary poSummary = new VendorPurchaseOrderSummary();

		poSummary.setBillingAddress(createForeignAddress());
		poSummary.setLocalPO(false);
		poSummary.setForeignPO(true);
		poSummary.setRateContract(false);
		poSummary.setForeignPoAmount(new BigDecimal(8000));
		poSummary.setPoDate(new Date());
		poSummary.setPoNumber("PO/2013-2014/foreign/0002");
		poSummary.setVendor(createForeignVendor());
		poSummary.setPoDeliveryLocation(createLocalShippingAddress());

		poSummary.setItems(createVendorForeignFurnituresItem());

		return poSummary;

	}

	public static VendorPurchaseOrderSummary createVendorHighValueRateContractPO(
			PurchaseOrderSummary po) {

		VendorPurchaseOrderSummary poSummary = new VendorPurchaseOrderSummary();

		poSummary.setBillingAddress(createForeignAddress());
		poSummary.setLocalPO(false);
		poSummary.setForeignPO(false);
		poSummary.setRateContract(true);
		poSummary.setRateContractAmount(new BigDecimal(9000));
		poSummary.setPoDate(new Date());
		poSummary.setPoNumber("PO/2013-2014/RC/0002");
		poSummary.setVendor(createRateContractVendor());
		poSummary.setPoDeliveryLocation(createLocalShippingAddress());

		poSummary.setItems(createVendorRateContractFoodItem());

		return poSummary;
	}
	
	public static List<PurchaseOrderDetails> createLocalClothesItem() {

		List<PurchaseOrderDetails> lineItems = new ArrayList<PurchaseOrderDetails>();

		PurchaseOrderDetails lineItemShirt = new PurchaseOrderDetails();

		Item shirts = new Item();

		shirts.setItemId(1001);
		shirts.setItemDescription("Full Sleve Shirt");
		shirts.setItemName("Shirt");
		shirts.setItemShortName("SHRT");
		shirts.setUom("PC");

		lineItemShirt.setItem(shirts);
		lineItemShirt.setPoDetailId(1001);
		lineItemShirt.setQuantity(100);
		lineItemShirt.setUnitPrice(19.99f);
		lineItemShirt.setSalesTax(1.3f);

		lineItems.add(lineItemShirt);

		PurchaseOrderDetails lineItemTrousers = new PurchaseOrderDetails();

		Item trousers = new Item();

		shirts.setItemId(2001);
		shirts.setItemDescription("Formal Trouser");
		shirts.setItemName("Trouser");
		shirts.setItemShortName("TRS");
		shirts.setUom("PC");

		lineItemTrousers.setItem(trousers);
		lineItemTrousers.setPoDetailId(2001);
		lineItemTrousers.setQuantity(100);
		lineItemTrousers.setUnitPrice(29.99f);
		lineItemTrousers.setSalesTax(2.3f);

		lineItems.add(lineItemTrousers);

		PurchaseOrderDetails lineItemNeckTie = new PurchaseOrderDetails();

		Item neckTie = new Item();

		neckTie.setItemId(3001);
		neckTie.setItemDescription("Formal Silk NeckTie");
		neckTie.setItemName("Necktie");
		neckTie.setItemShortName("NT");
		neckTie.setUom("PC");

		lineItemTrousers.setItem(neckTie);
		lineItemTrousers.setPoDetailId(3001);
		lineItemTrousers.setQuantity(100);
		lineItemTrousers.setUnitPrice(39.99f);
		lineItemTrousers.setSalesTax(2.3f);

		lineItems.add(lineItemNeckTie);

		return lineItems;

	}

	public static List<PurchaseOrderDetails> createForeignFurnituresItem() {

		List<PurchaseOrderDetails> lineItems = new ArrayList<PurchaseOrderDetails>();

		PurchaseOrderDetails lineItemMatress = new PurchaseOrderDetails();

		Item matress = new Item();

		matress.setItemId(4001);
		matress.setItemDescription("Kingsize Matress");
		matress.setItemName("King Matress");
		matress.setItemShortName("SKMHRT");
		matress.setUom("PC");

		lineItemMatress.setItem(matress);
		lineItemMatress.setPoDetailId(4001);
		lineItemMatress.setQuantity(200);
		lineItemMatress.setUnitPrice(319.99f);
		lineItemMatress.setSalesTax(21.3f);

		lineItems.add(lineItemMatress);

		PurchaseOrderDetails lineItemComputerTable = new PurchaseOrderDetails();

		Item compTable = new Item();

		compTable.setItemId(5001);
		compTable.setItemDescription("Lrge Computer Table");
		compTable.setItemName("Computer Table");
		compTable.setItemShortName("CT");
		compTable.setUom("PC");

		lineItemComputerTable.setItem(compTable);
		lineItemComputerTable.setPoDetailId(5001);
		lineItemComputerTable.setQuantity(300);
		lineItemComputerTable.setUnitPrice(119.99f);
		lineItemComputerTable.setSalesTax(12.3f);

		lineItems.add(lineItemComputerTable);

		return lineItems;

	}

	public static List<PurchaseOrderDetails> createRateContractFoodItem() {

		List<PurchaseOrderDetails> lineItems = new ArrayList<PurchaseOrderDetails>();

		PurchaseOrderDetails lineItemRice = new PurchaseOrderDetails();

		Item longGrainRice = new Item();

		longGrainRice.setItemId(6001);
		longGrainRice.setItemDescription("Longgrain Rice from Texus");
		longGrainRice.setItemName("Longgrain");
		longGrainRice.setItemShortName("LGR");
		longGrainRice.setUom("15 lb BAGS");

		lineItemRice.setItem(longGrainRice);
		lineItemRice.setPoDetailId(6001);
		lineItemRice.setQuantity(200);
		lineItemRice.setUnitPrice(11.99f);
		lineItemRice.setSalesTax(1.3f);

		lineItems.add(lineItemRice);

		PurchaseOrderDetails lineItemChicken = new PurchaseOrderDetails();

		Item chicken = new Item();

		chicken.setItemId(7001);
		chicken.setItemDescription("Chicken Breast Packet 12 PC");
		chicken.setItemName("Chicken Breast");
		chicken.setItemShortName("CB");
		chicken.setUom("PACK");

		lineItemChicken.setItem(chicken);
		lineItemChicken.setPoDetailId(7001);
		lineItemChicken.setQuantity(500);
		lineItemChicken.setUnitPrice(8.99f);
		lineItemChicken.setSalesTax(1.3f);

		lineItems.add(lineItemChicken);

		return lineItems;

	}

	public static List<VendorPurchaseOrderLineItem> createVendorLocalClothesItem() {

		List<VendorPurchaseOrderLineItem> lineItems = new ArrayList<VendorPurchaseOrderLineItem>();

		VendorPurchaseOrderLineItem lineItemShirt = new VendorPurchaseOrderLineItem();

		Item shirts = new Item();

		shirts.setItemId(1001);
		shirts.setItemDescription("Full Sleve Shirt");
		shirts.setItemName("Shirt");
		shirts.setItemShortName("SHRT");
		shirts.setUom("PC");

		lineItemShirt.setItem(shirts);
		lineItemShirt.setPoDetailId(1001);
		lineItemShirt.setQuantity(100);
		lineItemShirt.setUnitPrice(19.99f);
		lineItemShirt.setSalesTax(1.3f);

		lineItems.add(lineItemShirt);

		VendorPurchaseOrderLineItem lineItemTrousers = new VendorPurchaseOrderLineItem();

		Item trousers = new Item();

		shirts.setItemId(2001);
		shirts.setItemDescription("Formal Trouser");
		shirts.setItemName("Trouser");
		shirts.setItemShortName("TRS");
		shirts.setUom("PC");

		lineItemTrousers.setItem(trousers);
		lineItemTrousers.setPoDetailId(2001);
		lineItemTrousers.setQuantity(100);
		lineItemTrousers.setUnitPrice(29.99f);
		lineItemTrousers.setSalesTax(2.3f);

		lineItems.add(lineItemTrousers);

		VendorPurchaseOrderLineItem lineItemNeckTie = new VendorPurchaseOrderLineItem();

		Item neckTie = new Item();

		neckTie.setItemId(3001);
		neckTie.setItemDescription("Formal Silk NeckTie");
		neckTie.setItemName("Necktie");
		neckTie.setItemShortName("NT");
		neckTie.setUom("PC");

		lineItemTrousers.setItem(neckTie);
		lineItemTrousers.setPoDetailId(3001);
		lineItemTrousers.setQuantity(100);
		lineItemTrousers.setUnitPrice(39.99f);
		lineItemTrousers.setSalesTax(2.3f);

		lineItems.add(lineItemNeckTie);

		return lineItems;

	}

	public static List<VendorPurchaseOrderLineItem> createVendorForeignFurnituresItem() {

		List<VendorPurchaseOrderLineItem> lineItems = new ArrayList<VendorPurchaseOrderLineItem>();

		VendorPurchaseOrderLineItem lineItemMatress = new VendorPurchaseOrderLineItem();

		Item matress = new Item();

		matress.setItemId(4001);
		matress.setItemDescription("Kingsize Matress");
		matress.setItemName("King Matress");
		matress.setItemShortName("SKMHRT");
		matress.setUom("PC");

		lineItemMatress.setItem(matress);
		lineItemMatress.setPoDetailId(4001);
		lineItemMatress.setQuantity(200);
		lineItemMatress.setUnitPrice(319.99f);
		lineItemMatress.setSalesTax(21.3f);

		lineItems.add(lineItemMatress);

		VendorPurchaseOrderLineItem lineItemComputerTable = new VendorPurchaseOrderLineItem();

		Item compTable = new Item();

		compTable.setItemId(5001);
		compTable.setItemDescription("Lrge Computer Table");
		compTable.setItemName("Computer Table");
		compTable.setItemShortName("CT");
		compTable.setUom("PC");

		lineItemComputerTable.setItem(compTable);
		lineItemComputerTable.setPoDetailId(5001);
		lineItemComputerTable.setQuantity(300);
		lineItemComputerTable.setUnitPrice(119.99f);
		lineItemComputerTable.setSalesTax(12.3f);

		lineItems.add(lineItemComputerTable);

		return lineItems;

	}

	public static List<VendorPurchaseOrderLineItem> createVendorRateContractFoodItem() {

		List<VendorPurchaseOrderLineItem> lineItems = new ArrayList<VendorPurchaseOrderLineItem>();

		VendorPurchaseOrderLineItem lineItemRice = new VendorPurchaseOrderLineItem();

		Item longGrainRice = new Item();

		longGrainRice.setItemId(6001);
		longGrainRice.setItemDescription("Longgrain Rice from Texus");
		longGrainRice.setItemName("Longgrain");
		longGrainRice.setItemShortName("LGR");
		longGrainRice.setUom("15 lb BAGS");

		lineItemRice.setItem(longGrainRice);
		lineItemRice.setPoDetailId(6001);
		lineItemRice.setQuantity(200);
		lineItemRice.setUnitPrice(11.99f);
		lineItemRice.setSalesTax(1.3f);

		lineItems.add(lineItemRice);

		VendorPurchaseOrderLineItem lineItemChicken = new VendorPurchaseOrderLineItem();

		Item chicken = new Item();

		chicken.setItemId(7001);
		chicken.setItemDescription("Chicken Breast Packet 12 PC");
		chicken.setItemName("Chicken Breast");
		chicken.setItemShortName("CB");
		chicken.setUom("PACK");

		lineItemChicken.setItem(chicken);
		lineItemChicken.setPoDetailId(7001);
		lineItemChicken.setQuantity(500);
		lineItemChicken.setUnitPrice(8.99f);
		lineItemChicken.setSalesTax(1.3f);

		lineItems.add(lineItemChicken);

		return lineItems;

	}
	
	public static Address createLocalAddress() {

		Address address = new Address();

		address.setAddressId(1);
		address.setCity("Chicago");
		address.setCountry("USA");
		address.setHouseNumber(267);
		address.setState("IL");
		address.setStreet("Main Street");
		address.setZipCode("60565");

		return address;

	}

	public static Address createForeignAddress() {

		Address address = new Address();

		address.setAddressId(1);
		address.setCity("Shanhai");
		address.setCountry("China");
		address.setHouseNumber(267);
		address.setState("Shanhai");
		address.setStreet("Main Street");
		address.setZipCode("60565");

		return address;

	}

	public static Address createLocalShippingAddress() {

		Address address = new Address();

		address.setAddressId(1);
		address.setCity("Shanhai");
		address.setCountry("China");
		address.setHouseNumber(267);
		address.setState("Shanhai");
		address.setStreet("Main Street");
		address.setZipCode("60565");

		return address;

	}

	public static Vendor createLocalVendor() {

		Vendor vendor = new Vendor();

		vendor.setVendorId(1001);
		vendor.setVendorAddress(PurchaseOrderUtil.createLocalAddress());
		vendor.setVendorName("Local Suppliers");
		vendor.setRegDate(new Date());
		vendor.setVendorStatus("Active");
		vendor.setVendorShortName("LSPL");
		vendor.setPayableAmt(10000);

		return vendor;
	}

	public static Vendor createForeignVendor() {

		Vendor vendor = new Vendor();

		vendor.setVendorId(2001);
		vendor.setVendorAddress(PurchaseOrderUtil.createForeignAddress());
		vendor.setVendorName("Foreign Suppliers");
		vendor.setRegDate(new Date());
		vendor.setVendorStatus("Active");
		vendor.setVendorShortName("FSPL");
		vendor.setPayableAmt(10000);

		return vendor;

	}

	public static Vendor createRateContractVendor() {

		Vendor vendor = new Vendor();

		vendor.setVendorId(3001);
		vendor.setVendorAddress(PurchaseOrderUtil.createLocalAddress());
		vendor.setVendorName("Rate Contract Suppliers");
		vendor.setRegDate(new Date());
		vendor.setVendorStatus("Active");
		vendor.setVendorShortName("RCSPL");
		vendor.setPayableAmt(10000);

		return vendor;
	}
}
