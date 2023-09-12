package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ParksEntity;

@Repository
public interface ParkRepository extends JpaRepository<ParksEntity,Integer>{
  List<ParksEntity> findAllByIdIn(List<Integer> ids);
}