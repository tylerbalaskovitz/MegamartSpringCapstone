package com.tbonegames.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_table")
public class Accounts {
	
	@Id
	@Column(length = 15)
	private String name;
	
	@Column(length = 15)
	private String password;
	
	@Column(length = 15)
	private String password_confirm;
	
	@Column(length = 15)
	private String email;
	
	

	
}
