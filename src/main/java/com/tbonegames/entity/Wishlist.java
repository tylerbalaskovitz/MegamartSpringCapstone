package com.tbonegames.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "wishlist_table")
public class Wishlist {
	
	@Id
	@Column(length = 5)
	private String wish_id;
	
	@Column(length = 50)
	private String diplay_name;
	
	@Column(length = 50)
	private String short_desc;
	
	@Column(length = 20)
	private String category;

}
