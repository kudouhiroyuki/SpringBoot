package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AbbreviationsEntity;

@Repository
public interface AbbreviationRepository extends JpaRepository<AbbreviationsEntity,Integer>{
  AbbreviationsEntity findById(Long id);
}