package com.ecomm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomm.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
