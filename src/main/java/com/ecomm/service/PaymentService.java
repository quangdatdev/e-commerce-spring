package com.ecomm.service;

import java.util.List;

import com.ecomm.entity.Payment;

public interface PaymentService {

	List<Payment> getAll();
	
	Payment findById(Long id);
	
	Payment save(Payment payment);
	
	Long deleteId(Long id);
}
