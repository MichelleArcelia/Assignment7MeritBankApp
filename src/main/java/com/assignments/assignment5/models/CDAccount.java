package com.assignments.assignment5.models;

import java.util.Date;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

public class CDAccount extends BankAccount{
//	long accountNumber;
//	double balance;
//	Date openedOn;
	@DecimalMin(value = "0.0", inclusive = false, message = "interest rate must be greater than zero")
	@DecimalMax(value = "1.0", inclusive = false, message = "interest rate must be less than one")
	double interestRate = 0.025;
//	
//	@DecimalMin(value = "1.0", inclusive = true, message = "interest rate must be greater than one")
	int term;
//	static int nextCDAccountNumber = 1;
//	
	public CDAccount() {
//		this.accountNumber = nextCDAccountNumber++;
//		this.balance = 0;
//		this.openedOn = new Date(System.currentTimeMillis());
//		this.interestRate = 0;
		super();
		this.term = 0;
	}
	
//	
//	public long getAccountNumber() {
//		return accountNumber;
//	}
//
//	public void setAccountNumber(long accountNumber) {
//		this.accountNumber = accountNumber;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//	public Date getOpenedOn() {
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

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

}