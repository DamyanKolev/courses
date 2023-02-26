package com.example.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
