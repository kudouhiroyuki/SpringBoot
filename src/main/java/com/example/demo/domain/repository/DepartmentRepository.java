package com.example.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Integer>{
}