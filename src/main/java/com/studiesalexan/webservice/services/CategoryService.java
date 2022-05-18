package com.studiesalexan.webservice.services;

import com.studiesalexan.webservice.entities.Category;
import com.studiesalexan.webservice.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
       Optional<Category> obj = categoryRepository.findAllById(id);
       return obj.get();
    }
}
