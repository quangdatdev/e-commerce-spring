package com.ecomm.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

	private Long payment_id;
	private Date payment_date;
	private String payment_method;
	private double amount;
	private Customer customer;
}
