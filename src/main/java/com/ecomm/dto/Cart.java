package com.ecomm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

	private Long cart_id;
	private int quantity;
	
	private Product product;
	
	private Customer customer;
}
