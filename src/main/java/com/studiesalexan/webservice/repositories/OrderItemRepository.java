package com.studiesalexan.webservice.repositories;

import com.studiesalexan.webservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    Optional<OrderItem> findAllById(Long id);
}
