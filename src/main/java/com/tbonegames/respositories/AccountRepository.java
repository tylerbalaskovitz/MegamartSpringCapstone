package com.tbonegames.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tbonegames.entity.Accounts;

public interface AccountRepository extends JpaRepository<Accounts, String>{

	String findByUsername(String username);
	
	
}
