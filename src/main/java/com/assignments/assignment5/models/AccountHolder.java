package com.assignments.assignment5.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AccountHolder {

	@NotBlank (message = "First Name is Mandatory")
	@NotNull(message = "First Name has to be present")
	String firstName;
	
	String middleName;
	
	@NotBlank (message = "Last Name is Mandatory")
	@NotNull(message = "Last Name has to be present")
	String lastName;
	
	@NotBlank (message = "SSN is Mandatory")
	@NotNull(message = "SSN has to be present")
	int ssn;

	public AccountHolder(
			@NotBlank(message = "First Name is Mandatory") @NotNull(message = "First Name has to be present") String firstName,
			String middleName,
			@NotBlank(message = "Last Name is Mandatory") @NotNull(message = "Last Name has to be present") String lastName,
			@NotBlank(message = "SSN is Mandatory") @NotNull(message = "SSN has to be present") int ssn) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
}
