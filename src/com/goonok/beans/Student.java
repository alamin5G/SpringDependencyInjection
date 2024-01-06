package com.goonok.beans;

public class Student {

	private int rollno;
	private String name;
	private Address address;

	//dependency injection using constructor argument;
	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	//dependency injection using getter and setter method
	
	/*
	 * public int getRollno() { return rollno; }
	 * 
	 * public void setRollno(int rollno) { this.rollno = rollno; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public Address getAddress() { return address; }
	 * 
	 * public void setAddress(Address address) { this.address = address; }
	 */
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", " + address.toString() + "]";
	}

	

}
