package com.coforge.training.producthive.model;

import jakarta.persistence.*;

/**
* Author   : Shradhey.Naudiyal
* Date     : Oct 4, 2025
* Time     : 10:08:50 AM
* Project  : pms-restapi
*/
@Entity
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String firstName;

    private String lastName;
    
    @Lob
    private byte[] passport;
    
    @Lob
    private byte[] image;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Long customerId, String firstName, String lastName, byte[] passport, byte[] image) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.passport = passport;
		this.image = image;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte[] getPassport() {
		return passport;
	}

	public void setPassport(byte[] passport) {
		this.passport = passport;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
    
    
}
