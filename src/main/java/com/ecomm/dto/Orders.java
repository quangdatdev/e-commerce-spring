package com.ecomm.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

	private Long order_id;
	
	private Date order_date;
	private double total_price;
	
	private Customer customer;
	
	private Payment payment; 
	
}
