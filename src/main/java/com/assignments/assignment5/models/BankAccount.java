package com.assignments.assignment5.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity(name = "BankAccount")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BankAccount {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ba_id")
    protected Integer id;
//	static int nextId = 1;
	
	@Min(value = 0, message = "Balance must be atleast zero")
	double balance;
	Date openedOn;
	
	@Column(name = "ah_id")
	private Integer ahid;
//	@DecimalMin(value = "0.0", inclusive = true, message = "interest rate must be greater than zero")
//	@DecimalMax(value = "1", inclusive = false, message = "interest rate must be less than one")
//	double interestRate;
	

//	@ManyToOne(fetch = FetchType.LAZY)
//    private AccountHolder accountHolder;
//	
//	public AccountHolder getAccountHolder() {
//		return accountHolder;
//	}
//
//	public void setAccountHolder(AccountHolder accountHolder) {
//		this.accountHolder = accountHolder;
//	}
	
	public BankAccount() {
//		this.balance = 0;
		this.openedOn = new Date(System.currentTimeMillis());
//		this.interestRate = 0.1;
//		this.id = nextId++;
	}

	public Integer getAhid() {
		return ahid;
	}

	public void setAhid(Integer ahid) {
		this.ahid = ahid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getOpenedOn() {
		return openedOn;
	}

	public void setOpenedOn(Date openedOn) {
		this.openedOn = openedOn;
	}

//	public double getInterestRate() {
//		return interestRate;
//	}
//
//	public void setInterestRate(double interestRate) {
//		this.interestRate = interestRate;
//	}
	
}
