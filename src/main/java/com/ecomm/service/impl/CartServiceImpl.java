package com.ecomm.service.impl;

import java.util.List;
import java.util.Optional;

import com.ecomm.entity.Cart;
import com.ecomm.repositories.CartRepository;
import com.ecomm.service.CartService;

public class CartServiceImpl implements CartService{

	private final CartRepository repository;
	
	public CartServiceImpl(CartRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Cart> getAll() {
		return repository.findAll();
	}

	@Override
	public Cart findById(Long id) {
		Optional<Cart> Cart = repository.findById(id);
		if (Cart.isEmpty()) {
			return null;
		}
		return Cart.get();
	}

	@Override
	public Cart save(Cart Cart) {
		return repository.save(Cart);
	}

	@Override
	public Long deleteId(Long id) {
		Optional<Cart> Cart = repository.findById(id);
		if (Cart.isEmpty()) {
			return null;
		}
		repository.delete(Cart.get());
		return id;
	}

}
