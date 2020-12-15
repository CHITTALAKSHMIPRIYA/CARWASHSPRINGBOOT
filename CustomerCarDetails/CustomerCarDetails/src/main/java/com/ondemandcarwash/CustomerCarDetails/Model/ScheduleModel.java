package com.ondemandcarwash.CustomerCarDetails.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ScheduleModel {

	
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
	public String getWashername() {
		return washername;
	}
	public void setWashername(String washername) {
		this.washername = washername;
	}
	
	
	public CarModel getCardetails() {
		return cardetails;
	}
	public void setCardetails(CarModel cardetails) {
		this.cardetails = cardetails;
	}
	public LocationModel getLocationdetails() {
		return locationdetails;
	}
	public void setLocationdetails(LocationModel locationdetails) {
		this.locationdetails = locationdetails;
	}
	public PaymentModel getPaymentdetails() {
		return paymentdetails;
	}
	public void setPaymentdetails(PaymentModel paymentdetails) {
		this.paymentdetails = paymentdetails;
	}
	public String getBookeddate() {
		return bookeddate;
	}
	public void setBookeddate(String bookeddate) {
		this.bookeddate = bookeddate;
	}
	public String getSheduledate() {
		return sheduledate;
	}
	public void setSheduledate(String sheduledate) {
		this.sheduledate = sheduledate;
	}
	public String getSheduletime() {
		return sheduletime;
	}
	public void setSheduletime(String sheduletime) {
		this.sheduletime = sheduletime;
	}
	public String getWasheraccepteddate() {
		return washeraccepteddate;
	}
	public void setWasheraccepteddate(String washeraccepteddate) {
		this.washeraccepteddate = washeraccepteddate;
	}
	public Integer getServicetax() {
		return servicetax;
	}
	public void setServicetax(Integer servicetax) {
		this.servicetax = servicetax;
	}
	public Integer getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(Integer totalamount) {
		this.totalamount = totalamount;
	}
	public long getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(long transactionid) {
		this.transactionid = transactionid;
	}
	public long getBookingid() {
		return bookingid;
	}
	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Id
	private String id;
	private String username;
    private String washername;
   
    private CarModel cardetails;
    private LocationModel locationdetails;
    private PaymentModel paymentdetails;
    private String bookeddate;
    private String sheduledate;
    private String sheduletime;
    private String washeraccepteddate;
    private Integer servicetax;
    private Integer totalamount;
    private long transactionid;
    private long bookingid;
    private String status;
    private Integer rating;
    private String review;

}
