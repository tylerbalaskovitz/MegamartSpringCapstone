package com.tbonegames.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order {
	
	@Id
	@Column (length = 5)
	private String order_id;
	
	@Column(length = 50)
	private String display_name;

	@Column(length = 20)
	private String category;
	
	@Column(length = 15)
	private String seller_name;
	
	@Column
	private double price;
	
	@Column
	private int quantity;
	
	@Column
	private double total_price;
	
	@Column
	private Date ordered_date; //may need to be sql date??
	
	@Column(length = 10)
	private String order_status;
	
}
