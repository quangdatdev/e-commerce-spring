package com.ecomm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecomm.entity.OrderItem;
import com.ecomm.repositories.OrderItemRepository;
import com.ecomm.service.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService{

	private final OrderItemRepository repository;
	
	public OrderItemServiceImpl(OrderItemRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<OrderItem> getAll() {
		return repository.findAll();
	}

	@Override
	public OrderItem findById(Long id) {
		Optional<OrderItem> OrderItem = repository.findById(id);
		if (OrderItem.isEmpty()) {
			return null;
		}
		return OrderItem.get();
	}

	@Override
	public OrderItem save(OrderItem OrderItem) {
		return repository.save(OrderItem);
	}

	@Override
	public Long deleteId(Long id) {
		Optional<OrderItem> OrderItem = repository.findById(id);
		if (OrderItem.isEmpty()) {
			return null;
		}
		repository.delete(OrderItem.get());
		return id;
	}

}
