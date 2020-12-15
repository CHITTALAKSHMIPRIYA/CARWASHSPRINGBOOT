package com.ondemandcarwash.washerService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class WasherModel {
	@Id
	private String name;
	private String emailId;
	private String phoneNumber;
	private String password;
	private String address;
	private String washServiceName;
	@Override
	public String toString() {
		return "WasherService [emailId=" + emailId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", password="
				+ password + ", address=" + address + ", washServiceName=" + washServiceName + "]";
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWashServiceName() {
		return washServiceName;
	}
	public void setWashServiceName(String washServiceName) {
		this.washServiceName = washServiceName;
	}
}
