package com.ecomm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomm.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

}
