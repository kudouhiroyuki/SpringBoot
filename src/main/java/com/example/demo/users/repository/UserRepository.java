package com.example.demo.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.users.entity.Users;

public interface UserRepository extends JpaRepository<Users,Integer>{
}