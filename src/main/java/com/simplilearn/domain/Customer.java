package com.simplilearn.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String fullName;
	private String email;
	private String streat;
	private String city;
	private String state;
	private String zip;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long id, String fullName, String email, String streat, String city, String state, String zip) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.streat = streat;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreat() {
		return streat;
	}
	public void setStreat(String streat) {
		this.streat = streat;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}