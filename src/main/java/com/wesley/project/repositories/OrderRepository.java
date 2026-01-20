package com.wesley.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
