package com.ecomm.service;

import java.util.List;

import com.ecomm.entity.Product;

public interface ProductService {

	List<Product> getAll();
	
	Product findById(Long id);
	
	Product save(Product product);
	
	Long deleteId(Long id);
}
