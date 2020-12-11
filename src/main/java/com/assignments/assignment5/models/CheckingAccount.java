package com.assignments.assignment5.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;

@Entity
@Table(name = "CheckingAccount")
public class CheckingAccount extends BankAccount {

	@DecimalMin(value = "0.0", inclusive = false, message = "interest rate must be greater than zero")
	@DecimalMax(value = "1", inclusive = false, message = "interest rate must be less than one")
	double interestRate = 0.0001;

	public CheckingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getInterestRate() {
		return interestRate;
	}


	public void setInterest(double interestRate) {
		this.interestRate = interestRate;
	}

}