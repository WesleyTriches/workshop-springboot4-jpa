package com.wesley.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
