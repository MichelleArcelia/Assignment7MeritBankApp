package com.assignments.assignment5.models;

import java.sql.Date;

public class CheckingAccount {
	long checkingAccountNumber;
	double balance;
	Date openedOn;
	double interestRate = 0.0001;
	int id;
	static int nextCheckingAccountNumber = 1;
	
	public CheckingAccount() {
		this.balance = 0;
		this.openedOn = new Date(System.currentTimeMillis());
		this.interestRate = .000001;
		this.checkingAccountNumber = nextCheckingAccountNumber++;
	}
	
	
	public long getAccountNumber() {
		return checkingAccountNumber;
	}

	public void setAccountNumber(long checkingAccountNumber) {
		this.checkingAccountNumber = checkingAccountNumber;
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

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterest(double interestRate) {
		this.interestRate = interestRate;
	}

}