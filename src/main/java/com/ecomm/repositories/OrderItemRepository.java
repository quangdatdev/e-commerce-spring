package com.ecomm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomm.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
