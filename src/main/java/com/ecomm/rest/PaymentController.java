package com.ecomm.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.entity.Payment;
import com.ecomm.service.PaymentService;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {

	private final PaymentService service;
	public PaymentController(PaymentService service) {
		super();
		this.service = service;
	}
	
	@GetMapping
	public List<Payment> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Payment getById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public Payment save(@RequestBody Payment entity) {
		return service.save(entity);
	}
	
	@DeleteMapping("/{id}")
	public Long delte(@PathVariable Long id) {
		return service.deleteId(id);
	}
	
}
