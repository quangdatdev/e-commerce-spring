package com.ecomm.service;

import java.util.List;

import com.ecomm.entity.Cart;

public interface CartService {

	List<Cart> getAll();
	
	Cart findById(Long id);
	
	Cart save(Cart cart);
	
	Long deleteId(Long id);
}
