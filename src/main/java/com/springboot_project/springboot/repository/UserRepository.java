package com.springboot_project.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot_project.springboot.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
}