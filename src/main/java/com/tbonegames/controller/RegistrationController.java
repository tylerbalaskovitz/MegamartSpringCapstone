package com.tbonegames.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tbonegames.entity.Accounts;
import com.tbonegames.respositories.AccountRepository;

@RestController
@RequestMapping("/api/register")
public class RegistrationController {

	private AccountRepository accountRepository;
	
	public RegistrationController(AccountRepository accountRepository ) {
		this.accountRepository = accountRepository;
		
	}
	
	@PostMapping
	public Accounts registerUser(@RequestBody Accounts account) {
		if (accountRepository.findByUsername(account.getName() != null){

		}
		
	}
	
}
