package com.assignments.assignment5.models;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "AccountHolder")
public class AccountHolder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	Integer id;
	// static int nextId = 1;

//	@NotNull(message = "First Name can not be null")
//	@NotBlank(message = "First Name can not be blank")
	@Column(name = "firstName")
	String firstName;

	String middleName;
//	@NotNull(message = "Last Name can not be null")
//	@NotBlank(message = "Last Name can not be blank")
	String lastName;
//	@NotNull(message = "SSN can not be null")
//	@NotBlank(message = "SSN can not be blank")
	String SSN;
	// int contactID;

//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "contactID", referencedColumnName = "id")
//	AccountHoldersContactDetails contactDetails;
//	
//	List<CheckingAccount> checkingAccounts = new ArrayList<CheckingAccount>();
//	List<SavingsAccount> savingsAccounts = new ArrayList<SavingsAccount>();
//	List<CDAccount> cdAccounts = new ArrayList<CDAccount>();
//	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ah_id", referencedColumnName = "ah_id")
	private List<CheckingAccount> checkingAccounts;

	public AccountHolder() {
//		this.firstName = "";
//		this.middleName = "";
//		this.lastName = "";
//		this.SSN = "";
		// this.id = nextId ++;
	}

//	public int getContactID() {
//		return contactID;
//	}
//
//	public AccountHolder setContactID(int contactID) {
//		this.contactID = contactID;
//		return this;
//	}

//	public AccountHoldersContactDetails getContactDetails() {
//		return contactDetails;
//	}
//
//	public void setContactDetails(AccountHoldersContactDetails contactDetails) {
//		this.contactDetails = contactDetails;
//	}

	public List<CheckingAccount> getCheckingAccounts() {
		return checkingAccounts;
	}

	public void setCheckingAccounts(List<CheckingAccount> checkingAccounts) {
		this.checkingAccounts = checkingAccounts;
	}
	
	public Integer getId() {
		return id;
	}

	public AccountHolder setId(int id) {
		this.id = id;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public AccountHolder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getMiddleName() {
		return middleName;
	}

	public AccountHolder setMiddleName(String middleName) {
		this.middleName = middleName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public AccountHolder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getSSN() {
		return SSN;
	}

	public AccountHolder setSSN(String sSN) {
		SSN = sSN;
		return this;
	}

	

//	public BankAccount addCheckingAccount(CheckingAccount checkingAccount) {
//		checkingAccounts.add(checkingAccount);
//		return checkingAccount;
//	}
//	
//	public List<CheckingAccount> getCheckingAccounts() {
//		return checkingAccounts;		
//	}
//	
//	public BankAccount addSavingsAccount(SavingsAccount savingsAccount){
//		savingsAccounts.add(savingsAccount);
//		return savingsAccount;
//	}
//	
//	public List<SavingsAccount> getSavingsAccounts(){
//		return savingsAccounts;
//	}
//	
//	public BankAccount addCDAccount(CDAccount cdAccount){
//		cdAccounts.add(cdAccount);
//		return cdAccount;
//	}
//	
//	public List<CDAccount> getCDAccounts(){
//		return cdAccounts;
//	}
//	
//	public int getNumberOfCheckingAccounts() {
//		return checkingAccounts.size();
//	}
//	
//	public double getCheckingBalance() {
//		double totalBalance = 0;
//		for (BankAccount ca : checkingAccounts) {
//			totalBalance = totalBalance + ca.getBalance();
//		}
//		return totalBalance;
//	}
//	
//	public int getNumberOfSavingsAccounts() {
//		return savingsAccounts.size();
//	}
//	
//	public double getSavingsBalance() {
//		double totalBalance = 0;
//		for (BankAccount sa : savingsAccounts) {
//			totalBalance = totalBalance + sa.getBalance();
//		}
//		return totalBalance;
//	}
//	
//	public int getNumberOfCDAccounts() {
//		return cdAccounts.size();
//	}
//	
//	public double getCdbalance() {
//		double totalBalance = 0;
//		for (BankAccount cda : cdAccounts) {
//			totalBalance = totalBalance + cda.getBalance();
//		}
//		return totalBalance;
//	}
//	
//	public double getCombinedBalance() {
//		double totalBalance = 0;
//		for (BankAccount ca : checkingAccounts) {
//			totalBalance = totalBalance + ca.getBalance();
//		}
//		for (BankAccount sa : savingsAccounts) {
//			totalBalance = totalBalance + sa.getBalance();
//		}
//		for (BankAccount cda : cdAccounts) {
//			totalBalance = totalBalance + cda.getBalance();
//		}
//		return totalBalance;
//	}

}