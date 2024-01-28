package com.ecomm.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.entity.Orders;
import com.ecomm.service.OrderService;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

	private final OrderService service;
	public OrderController(OrderService service) {
		super();
		this.service = service;
	}
	
	@GetMapping
	public List<Orders> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Orders getById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public Orders save(@RequestBody Orders entity) {
		return service.save(entity);
	}
	
	@DeleteMapping("/{id}")
	public Long delte(@PathVariable Long id) {
		return service.deleteId(id);
	}
	
}
