package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ParksEntity;

@Repository
public interface ParkRepository extends JpaRepository<ParksEntity,Integer>{
}