package com.org;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"customerid","customername","age"})


public class Customer {
	private int customerId;
	private String Customername;
	private int age;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customername, int age) {
		super();
		this.customerId = customerId;
		Customername = customername;
		this.age = age;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
