package com.tbonegames.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products_table")
public class Products {

	@Id
	@Column(length = 5)
	private String product_id;
	
	@Column(length = 50)
	private String product_name;
	
	@Column(length = 200)
	private String description;
	
	@Column
	private double price;
	
	@Column
	private double discount;
	
	@Column
	private double deliver_charges;
	
	@Column
	private int avg_rating;
	
	@Column(length = 15)
	private String seller_name;
}
