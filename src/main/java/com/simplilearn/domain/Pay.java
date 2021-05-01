package com.simplilearn.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Pay {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nameInCard;
	private String cardNumber;
	private String expMonth;
	private String expYear;
	private String cvv;
	public Pay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pay(long id, String nameInCard, String cardNumber, String expMonth, String expYear, String cvv) {
		super();
		this.id = id;
		this.nameInCard = nameInCard;
		this.cardNumber = cardNumber;
		this.expMonth = expMonth;
		this.expYear = expYear;
		this.cvv = cvv;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNameInCard() {
		return nameInCard;
	}
	public void setNameInCard(String nameInCard) {
		this.nameInCard = nameInCard;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpMonth() {
		return expMonth;
	}
	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}
	public String getExpYear() {
		return expYear;
	}
	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	
	
}
