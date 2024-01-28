package com.ecomm.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.entity.Product;
import com.ecomm.service.ProductService;

@RestController
@RequestMapping("/api/v1/Product")
public class ProductController {

	private final ProductService service;
	public ProductController(ProductService service) {
		super();
		this.service = service;
	}
	
	@GetMapping
	public List<Product> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Product getById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public Product save(@RequestBody Product entity) {
		return service.save(entity);
	}
	
	@DeleteMapping("/{id}")
	public Long delte(@PathVariable Long id) {
		return service.deleteId(id);
	}
	
}
