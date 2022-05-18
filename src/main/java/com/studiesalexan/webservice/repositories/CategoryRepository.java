package com.studiesalexan.webservice.repositories;

import com.studiesalexan.webservice.entities.Category;
import com.studiesalexan.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findAllById(Long id);
}
