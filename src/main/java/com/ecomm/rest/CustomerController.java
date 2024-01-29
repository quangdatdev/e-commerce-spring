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

import com.ecomm.entity.Customer;
import com.ecomm.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

	@Autowired CustomerService service;
	
	@GetMapping
	public List<Customer> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Customer getById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public Customer save(@RequestBody Customer entity) {
		return service.save(entity);
	}
	
	@PutMapping("/{id}")
	public Customer update(@PathVariable Long id, @RequestBody Customer entity) {
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
