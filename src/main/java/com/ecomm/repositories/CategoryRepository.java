package com.ecomm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomm.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
