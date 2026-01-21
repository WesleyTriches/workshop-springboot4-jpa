package com.wesley.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.project.entities.OrderItem;
import com.wesley.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}