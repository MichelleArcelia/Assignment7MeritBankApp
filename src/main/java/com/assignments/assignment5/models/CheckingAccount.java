package com.assignments.assignment5.models;

public class CheckingAccount {
	long checkingAccountNumber;
	double balance;
	String dateOpened;
	double interestRate = 0.0001;
	int id;
	static int nextCheckingAccountNumber = 1;
	
	public CheckingAccount() {
		this.balance = 0;
		this.dateOpened = "11111111";
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

	public String getDate() {
		return dateOpened;
	}

	public void setDate(String date) {
		this.dateOpened = date;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterest(double interestRate) {
		this.interestRate = interestRate;
	}


}