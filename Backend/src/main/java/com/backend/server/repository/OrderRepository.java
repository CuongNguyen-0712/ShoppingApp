package com.backend.server.repository;

import com.backend.server.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository <Order, String> {
    List<Order> findOrdersByUser_Id(String id);
    Optional<Order> findOrderByIdAndUserId(String orderId, String userId);
}
