package com.ecomm.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdersDto {

	private Long order_id;
	
	private Date order_date;
	private double total_price;
	
	private CustomerDto customer;
	
	private PaymentDto payment; 
	
}
