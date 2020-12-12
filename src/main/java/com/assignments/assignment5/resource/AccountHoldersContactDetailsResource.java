package com.assignments.assignment5.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignments.assignment5.models.AccountHolder;
import com.assignments.assignment5.models.AccountHoldersContactDetails;
import com.assignments.assignment5.repository.AccountHoldersContactDetailsRepository;

@RequestMapping("/AccountHoldersContactDetails")
@RestController
public class AccountHoldersContactDetailsResource {

	private AccountHoldersContactDetailsRepository accountHoldersContactDetailsRepository;

	public AccountHoldersContactDetailsResource(
			AccountHoldersContactDetailsRepository accountHoldersContactDetailsRepository) {
		this.accountHoldersContactDetailsRepository = accountHoldersContactDetailsRepository;
	}

	@GetMapping(value = "/all")
	public List<AccountHoldersContactDetails> getAccountHoldersContactDetailsResource(){
		return accountHoldersContactDetailsRepository.findAll();
	}

	@GetMapping(value="/update/{firstName}")
	public List<AccountHoldersContactDetails> update(@PathVariable final String firstName){
		AccountHoldersContactDetails accountHoldersContactDetails = new AccountHoldersContactDetails();
		AccountHolder accountHolder = new AccountHolder();
		accountHolder.setFirstName(firstName);
		
		accountHoldersContactDetails.setEmail("rocks@kicks.com").setPhoneNumber(12345).setAccountHolder(accountHolder);
		
		accountHoldersContactDetailsRepository.save(accountHoldersContactDetails);
		
		return accountHoldersContactDetailsRepository.findAll();
	}
}
