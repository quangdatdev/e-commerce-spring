package com.ecomm.service;

import java.util.List;

import com.ecomm.entity.Customer;

public interface CustomerService {

	List<Customer> getAll();
	
	Customer findById(Long id);
	
	Customer save(Customer customer);
	
	Long deleteId(Long id);
}
