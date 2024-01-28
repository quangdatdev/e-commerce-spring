package com.ecomm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecomm.entity.Category;
import com.ecomm.repositories.CategoryRepository;
import com.ecomm.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	private final CategoryRepository repository;
	
	public CategoryServiceImpl(CategoryRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Category> getAll() {
		return repository.findAll();
	}

	@Override
	public Category findById(Long id) {
		Optional<Category> Category = repository.findById(id);
		if (Category.isEmpty()) {
			return null;
		}
		return Category.get();
	}

	@Override
	public Category save(Category Category) {
		return repository.save(Category);
	}

	@Override
	public Long deleteId(Long id) {
		Optional<Category> Category = repository.findById(id);
		if (Category.isEmpty()) {
			return null;
		}
		repository.delete(Category.get());
		return id;
	}

}
