package com.tbonegames.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts_table")
public class Accounts {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword_confirm() {
		return password_confirm;
	}

	public void setPassword_confirm(String password_confirm) {
		this.password_confirm = password_confirm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Id
	@Column(length = 15)
	private String name;
	
	@Column(length = 15)
	private String password;
	
	@Column(length = 15)
	private String password_confirm;
	
	@Column(length = 15)
	private String email;
	
	
	//@ManyToMany and the @JoinAnnotation are combined together to allow tables to be joined together
	//You can have different types of fetches, and you can cascade all the tables. 
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "wishlist_table",
			joinColumns = {@JoinColumn(name = "wish_id", referencedColumnName="ID")},
			inverseJoinColumns= {@JoinColumn(name="name", referencedColumnName="ID")})
	private List<Accounts> accounts = new ArrayList<>();
	
	
	

	
}
