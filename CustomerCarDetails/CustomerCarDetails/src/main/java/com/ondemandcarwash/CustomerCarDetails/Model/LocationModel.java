package com.ondemandcarwash.CustomerCarDetails.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LocationModel {
	
	@Id
	private String id;
	private String username;
	private String doornumber;
	private String street;
	private String landmark;
	private String city;
	private String dist;
	private String state;
	private String pincode;	

	@Override
	public String toString() {
		return "LocationModel [id=" + id + ", username=" + username + ", doornumber=" + doornumber + ", street="
				+ street + ", landmark=" + landmark + ", city=" + city + ", dist=" + dist + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDoornumber() {
		return doornumber;
	}
	public void setDoornumber(String doornumber) {
		this.doornumber = doornumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
