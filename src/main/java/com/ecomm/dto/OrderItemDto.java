package com.ecomm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {
	private Long order_item_id;
	
	private int quantity;
	private double price;
	
	private ProductDto product;
	
	private OrdersDto order;
}
