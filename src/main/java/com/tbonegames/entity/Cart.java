package com.tbonegames.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
	
}
