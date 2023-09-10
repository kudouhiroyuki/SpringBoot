package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AbbreviationsEntity;

@Repository
public interface AbbreviationRepository extends JpaRepository<AbbreviationsEntity,Integer>{
  AbbreviationsEntity findById(Long id);

  Optional<AbbreviationsEntity> findByDepartmentCode(String departmentCode);
  
  Optional<AbbreviationsEntity> findByDepartmentGroupCode(String departmentGroupCode);
}