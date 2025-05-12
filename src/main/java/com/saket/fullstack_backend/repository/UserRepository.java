package com.saket.fullstack_backend.repository;

import com.saket.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> { // < model class name , primary key data type >



}

