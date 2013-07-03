package com.rollingstone.spring.integration.po.domain;

import javax.xml.bind.annotation.XmlElement;

public class Address {

	long addressId;

	int houseNumber;

	String street;

	String city;

	String state;

	String country;

	String zipCode;

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	int addressTypeId;

	public int getAddressTypeId() {
		return addressTypeId;
	}

	public void setAddressTypeId(int addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	@XmlElement
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	@XmlElement
	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	@XmlElement
	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	@XmlElement
	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {
		return this.getHouseNumber() + " " + this.getStreet() + " "
				+ this.getCity() + " " + this.getState() + " "
				+ this.getCountry();
	}


}
