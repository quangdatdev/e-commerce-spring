package com.ecomm.service;

import java.util.List;

import com.ecomm.entity.OrderItem;

public interface OrderItemService {

	List<OrderItem> getAll();
	
	OrderItem findById(Long id);
	
	OrderItem save(OrderItem orderItem);
	
	Long deleteId(Long id);
}
