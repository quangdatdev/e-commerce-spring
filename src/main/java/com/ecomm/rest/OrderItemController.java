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

import com.ecomm.entity.OrderItem;
import com.ecomm.service.OrderItemService;

@RestController
@RequestMapping("/api/v1/orderitem")
public class OrderItemController {

	@Autowired OrderItemService service;
	
	@GetMapping
	public List<OrderItem> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public OrderItem getById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public OrderItem save(@RequestBody OrderItem entity) {
		return service.save(entity);
	}
	
	@PutMapping("/{id}")
	public OrderItem update(@PathVariable Long id, @RequestBody OrderItem entity) {
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
