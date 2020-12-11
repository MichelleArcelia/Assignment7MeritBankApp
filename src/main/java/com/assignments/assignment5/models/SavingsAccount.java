package com.assignments.assignment5.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
@Entity
@Table(name = "SavingsAccount")
public class SavingsAccount extends BankAccount{

//	long savingsAccountNumber;
//	double balance;
//	Date openedOn;
	@DecimalMin(value = "0.0", inclusive = false, message = "interest rate must be greater than zero")
	@DecimalMax(value = "1", inclusive = false, message = "interest rate must be less than one")
	double interestRate = 0.01;
//	int id;
//	static int nextSavingsAccountNumber = 1;
//	
	public SavingsAccount() {
		super();
	}

//	public long getAccountNumber() {
//		return savingsAccountNumber;
//	}
//
//	public void setAccountNumber(long accountNumber) {
//		this.savingsAccountNumber = accountNumber;
//	}
//
//	public double getBalance() {
//		return ;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//	public Date getOpenedOn () {
//		return openedOn;
//	}
//
//	public void setOpenedOn(Date openedOn) {
//		this.openedOn = openedOn;
//	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}