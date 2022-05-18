package com.studiesalexan.webservice.repositories;

import com.studiesalexan.webservice.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findAllById(Long id);
}
