package com.example.demo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.user.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{
}