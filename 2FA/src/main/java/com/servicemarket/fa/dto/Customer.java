package com.servicemarket.fa.dto;



public class Customer {
	Integer customerId;
	String name;
	String password;
	String email;
	
	
	public Customer(Integer customerId, String name, String password, String email) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	
	public Customer() {
		
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
