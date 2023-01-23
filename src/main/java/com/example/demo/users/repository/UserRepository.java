package com.example.demo.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.users.entity.UsersEntity;

public interface UserRepository extends JpaRepository<UsersEntity,Integer>{
}