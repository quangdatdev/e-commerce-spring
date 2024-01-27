package com.ecomm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomm.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
