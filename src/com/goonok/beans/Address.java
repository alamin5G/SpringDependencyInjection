package com.goonok.beans;

public class Address {

	private int houseno;
	private String city;
	private int postcode;

	//dependency injection using constructor argument
	
	public Address(int houseno, String city, int postcode) {
		super();
		this.houseno = houseno;
		this.city = city;
		this.postcode = postcode;
	}
	
	
	//dependency injection using getter and setter method
	
	/*
	 * public int getHouseno() { return houseno; }
	 * 
	 * public void setHouseno(int houseno) { this.houseno = houseno; }
	 * 
	 * public String getCity() { return city; }
	 * 
	 * public void setCity(String city) { this.city = city; }
	 * 
	 * public int getPostcode() { return postcode; }
	 * 
	 * public void setPostcode(int postcode) { this.postcode = postcode; }
	 */
	@Override
	public String toString() {
		return "Address [hosueno=" + houseno + ", city=" + city + ", postcode=" + postcode + "]";
	}

	

}
