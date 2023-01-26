package com.example.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{
}