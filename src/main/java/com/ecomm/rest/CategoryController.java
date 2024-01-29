package com.ecomm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.entity.Category;
import com.ecomm.service.CategoryService;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

	@Autowired CategoryService service;
	
	@GetMapping
	public List<Category> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Category getById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public Category save(@RequestBody Category entity) {
		return service.save(entity);
	}
	
	@PutMapping("/{id}")
	public Category update(@PathVariable Long id, @RequestBody Category entity) {
		if (service.findById(id) != null) {
			return service.save(entity);
		}
		return null;
	}
	
	@DeleteMapping("/{id}")
	public Long delte(@PathVariable Long id) {
		return service.deleteId(id);
	}
	
}
