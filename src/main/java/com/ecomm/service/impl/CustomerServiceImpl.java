package com.ecomm.service.impl;

import java.util.List;
import java.util.Optional;

import com.ecomm.entity.Customer;
import com.ecomm.repositories.CustomerRepository;
import com.ecomm.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	private final CustomerRepository repository;
	
	public CustomerServiceImpl(CustomerRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Customer> getAll() {
		return repository.findAll();
	}

	@Override
	public Customer findById(Long id) {
		Optional<Customer> customer = repository.findById(id);
		if (customer.isEmpty()) {
			return null;
		}
		return customer.get();
	}

	@Override
	public Customer save(Customer customer) {
		return repository.save(customer);
	}

	@Override
	public Long deleteId(Long id) {
		Optional<Customer> customer = repository.findById(id);
		if (customer.isEmpty()) {
			return null;
		}
		repository.delete(customer.get());
		return id;
	}

}
