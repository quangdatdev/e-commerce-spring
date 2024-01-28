package com.ecomm.service;

import java.util.List;

import com.ecomm.entity.Orders;

public interface OrderService {

	List<Orders> getAll();
	
	Orders findById(Long id);
	
	Orders save(Orders order);
	
	Long deleteId(Long id);
}
