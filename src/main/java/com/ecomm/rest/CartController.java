package com.ecomm.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.entity.Cart;
import com.ecomm.service.CartService;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {

	private final CartService service;
	public CartController(CartService service) {
		super();
		this.service = service;
	}
	
	@GetMapping
	public List<Cart> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Cart getById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public Cart save(@RequestBody Cart entity) {
		return service.save(entity);
	}
	
	@DeleteMapping("/{id}")
	public Long delte(@PathVariable Long id) {
		return service.deleteId(id);
	}
	
}
