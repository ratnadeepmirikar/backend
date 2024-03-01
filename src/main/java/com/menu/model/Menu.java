package com.menu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="surbhi")
public class Menu {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int menuId;
	
	private String menuName;
	
	private int price;
	
	private int quantity;
	
	private int totalbill;
}
