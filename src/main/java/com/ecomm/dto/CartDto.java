package com.ecomm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {

	private Long cart_id;
	private int quantity;
	
	private ProductDto product;
	
	private CustomerDto customer;
}
