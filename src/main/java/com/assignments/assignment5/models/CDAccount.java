package com.assignments.assignment5.models;

import java.util.Date;

public class CDAccount {
	long accountNumber;
	double balance;
	Date openedOn;
	double interestRate = 0.025;
	int term;
	static int nextCDAccountNumber = 1;
	
	public CDAccount() {
		this.accountNumber = nextCDAccountNumber++;
		this.balance = 0;
		this.openedOn = new Date(System.currentTimeMillis());
		this.interestRate = 0;
		this.term = 0;
	}
	
	
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
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