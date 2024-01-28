package com.ecomm.service.impl;

import java.util.List;
import java.util.Optional;

import com.ecomm.entity.Payment;
import com.ecomm.repositories.PaymentRepository;
import com.ecomm.service.PaymentService;

public class PaymentServiceImpl implements PaymentService{

	private final PaymentRepository repository;
	
	public PaymentServiceImpl(PaymentRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Payment> getAll() {
		return repository.findAll();
	}

	@Override
	public Payment findById(Long id) {
		Optional<Payment> Payment = repository.findById(id);
		if (Payment.isEmpty()) {
			return null;
		}
		return Payment.get();
	}

	@Override
	public Payment save(Payment Payment) {
		return repository.save(Payment);
	}

	@Override
	public Long deleteId(Long id) {
		Optional<Payment> Payment = repository.findById(id);
		if (Payment.isEmpty()) {
			return null;
		}
		repository.delete(Payment.get());
		return id;
	}

}
