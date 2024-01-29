package com.ecomm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

	private Long customer_id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private String address;
	private String phone_number;
	
	
}
