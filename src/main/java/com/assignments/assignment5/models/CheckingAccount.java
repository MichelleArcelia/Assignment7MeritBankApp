package com.assignments.assignment5.models;

import java.sql.Date;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;

public class CheckingAccount extends BankAccount {
//	long checkingAccountNumber;
//	@Min(value = 0, message = "Balance must be atleast zero")
//	double balance;
//	Date openedOn;
	@DecimalMin(value = "0.0", inclusive = false, message = "interest rate must be greater than zero")
	@DecimalMax(value = "1", inclusive = false, message = "interest rate must be less than one")
	double interestRate = 0.0001;
//	int id;
//	static int nextCheckingAccountNumber = 1;
//	
//	public CheckingAccount() {
//		super();
//		//this.interestRate = 0.0001;
//	}

	public CheckingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	public long getAccountNumber() {
//		return checkingAccountNumber;
//	}

//	public void setAccountNumber(long checkingAccountNumber) {
//		this.checkingAccountNumber = checkingAccountNumber;
//	}

//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}

//	public Date getOpenedOn() {
//		return openedOn;
//	}

//	public void setOpenedOn(Date openedOn) {
//		this.openedOn = openedOn;
//	}
//
	public double getInterestRate() {
		return interestRate;
	}


	public void setInterest(double interestRate) {
		this.interestRate = interestRate;
	}

}