package com.ecomm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecomm.entity.Product;
import com.ecomm.repositories.ProductRepository;
import com.ecomm.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	private final ProductRepository repository;
	
	public ProductServiceImpl(ProductRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Product> getAll() {
		return repository.findAll();
	}

	@Override
	public Product findById(Long id) {
		Optional<Product> Product = repository.findById(id);
		if (Product.isEmpty()) {
			return null;
		}
		return Product.get();
	}

	@Override
	public Product save(Product Product) {
		return repository.save(Product);
	}

	@Override
	public Long deleteId(Long id) {
		Optional<Product> Product = repository.findById(id);
		if (Product.isEmpty()) {
			return null;
		}
		repository.delete(Product.get());
		return id;
	}

}
