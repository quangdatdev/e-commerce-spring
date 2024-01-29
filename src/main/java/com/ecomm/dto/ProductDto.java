package com.ecomm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
	private Long product_id;
	private String name;
	private String desscription;
	private double price;
	private int stock;
	
	private CategoryDto category;
}
