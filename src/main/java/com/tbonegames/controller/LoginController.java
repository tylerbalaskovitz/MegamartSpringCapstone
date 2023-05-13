package com.tbonegames.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tbonegames.entity.Accounts;
import com.tbonegames.respositories.AccountRepositoryImpl;

@RestController
@RequestMapping("/api/login")
public class LoginController {

	private AccountRepositoryImpl accountRepository;
	
	public LoginController(AccountRepositoryImpl accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@PostMapping
	public Accounts loginUser(@RequestParam String username, @RequestParam String password) {
		//This is used to bind Request parameters to method parameters. It is used to extract the values of individual
		//request paramteres from the URL or form data. 
		Accounts account = accountRepository.findByUsername(username);
		
		if (account == null) {
			
		}
	}
	
	
}
