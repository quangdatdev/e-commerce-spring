package com.ecomm.service;

import java.util.List;

import com.ecomm.entity.Category;

public interface CategoryService {

	List<Category> getAll();
	
	Category findById(Long id);
	
	Category save(Category category);
	
	Long deleteId(Long id);
}
