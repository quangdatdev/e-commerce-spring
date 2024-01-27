package com.ecomm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomm.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>{

}
