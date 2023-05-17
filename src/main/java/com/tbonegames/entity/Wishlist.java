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

	//@ManyToMany and the @JoinAnnotation are combined together to allow tables to be joined together
	//You can have different types of fetches, and you can cascade all the tables. 
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "accounts_table",
			joinColumns = {@JoinColumn(name = "wish_id", referencedColumnName="ID")},
			inverseJoinColumns= {@JoinColumn(name="name", referencedColumnName="ID")})
	private List<Accounts> accounts = new ArrayList<>();
	
	
}
