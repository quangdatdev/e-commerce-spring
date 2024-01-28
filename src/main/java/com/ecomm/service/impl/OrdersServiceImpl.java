package com.ecomm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecomm.entity.Orders;
import com.ecomm.repositories.OrderRepository;
import com.ecomm.service.OrderService;

@Service
public class OrdersServiceImpl implements OrderService{

	private final OrderRepository repository;
	
	public OrdersServiceImpl(OrderRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Orders> getAll() {
		return repository.findAll();
	}

	@Override
	public Orders findById(Long id) {
		Optional<Orders> Orders = repository.findById(id);
		if (Orders.isEmpty()) {
			return null;
		}
		return Orders.get();
	}

	@Override
	public Orders save(Orders Orders) {
		return repository.save(Orders);
	}

	@Override
	public Long deleteId(Long id) {
		Optional<Orders> Orders = repository.findById(id);
		if (Orders.isEmpty()) {
			return null;
		}
		repository.delete(Orders.get());
		return id;
	}

}
