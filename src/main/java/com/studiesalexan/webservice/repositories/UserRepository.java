package com.studiesalexan.webservice.repositories;

import com.studiesalexan.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
