package com.tbonegames.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.tbonegames.respositories.AccountRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private AccountRepository accountRepository;
	
	
	
}
