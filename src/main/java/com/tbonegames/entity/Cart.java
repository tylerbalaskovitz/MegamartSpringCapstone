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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cart_table")
public class Cart {
	
	@Id
	@Column(length = 5)
	private String cart_id;
	
	@Column(length = 50)
	private String product_name;

	@Column(length = 15)
	private String seller_name;
	
	@Column
	private int quantity;
	
	@Column
	private double cart_offer_price;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "accounts_table",
			joinColumns = {@JoinColumn(name = "wish_id", referencedColumnName="ID")},
			inverseJoinColumns= {@JoinColumn(name="name", referencedColumnName="ID")})
	private List<Accounts> accounts = new ArrayList<>();
	
	
}
