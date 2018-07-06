package com.au.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="user")
public class User {
	
	private static final long serialVersionUID = -2054386655979281969L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="UserId")
	private static int userId;

	@Column(name="UserName")
	private String userName;

	@Column(name="UserPass")
	private String userPass;

	@Column(name="UsermailId")
	private String usermailId;

	@Column(name="UserContact")
	private String userContact;

	@Column(name="EstBudget")
	private double estBudget;
	

	@Column(name="City")
	private String city;

	@Column(name="NoOfGuest")
	private int noOfGuest;

	@Column(name="WeddingDate")
	private Date weddingDate;

	@Column(name="weddingDays")
	private double weddingDays;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User( String userName, String userPass, String usermailId, String userContact, double estBudget, String city,
			int noOfGuest, Date weddingDate, double weddingDays) {
		super();
		
		this.userName = userName;
		this.userPass = userPass;
		this.usermailId = usermailId;
		this.userContact = userContact;
		this.estBudget = estBudget;
		this.city = city;
		this.noOfGuest = noOfGuest;
		this.weddingDate = weddingDate;
		this.weddingDays = weddingDays;
	}

	public User() {
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUsermailId() {
		return usermailId;
	}

	public void setUsermailId(String usermailId) {
		usermailId = usermailId;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public double getEstBudget() {
		return estBudget;
	}

	public void setEstBudget(double estBudget) {
		this.estBudget = estBudget;
	}

	public int getNoOfGuest() {
		return noOfGuest;
	}

	public void setNoOfGuest(int noOfGuest) {
		this.noOfGuest = noOfGuest;
	}

	public Date getWeddingDate() {
		return weddingDate;
	}

	public void setWeddingDate(Date weddingDate) {
		this.weddingDate = weddingDate;
	}
	

	public double getWeddingDays() {
		return weddingDays;
	}

	public void setWeddingDays(double weddingDays) {
		this.weddingDays = weddingDays;
	}
	
//	@OneToOne(fetch = FetchType.EAGER ,mappedBy="user")
//	@Cascade(value=org.hibernate.annotations.CascadeType.ALL)
//	private Cart cart;
//	
//	@OneToOne(fetch = FetchType.EAGER ,mappedBy="user")
//	@Cascade(value=org.hibernate.annotations.CascadeType.ALL)
//	private Culture culture;
}
