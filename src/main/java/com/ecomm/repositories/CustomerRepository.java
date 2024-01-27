package com.ecomm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomm.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
