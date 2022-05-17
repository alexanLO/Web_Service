package com.studiesalexan.webservice.services;

import com.studiesalexan.webservice.entities.Order;
import com.studiesalexan.webservice.entities.User;
import com.studiesalexan.webservice.repositories.OrderRepository;
import com.studiesalexan.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
       Optional<Order> obj = orderRepository.findAllById(id);
       return obj.get();
    }
}
