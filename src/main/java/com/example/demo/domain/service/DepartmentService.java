package com.example.demo.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.repository.DepartmentRepository;
import com.example.demo.domain.entity.DepartmentEntity;

@Service
public class DepartmentService {
  @Autowired
  private DepartmentRepository departmentRepository;
  
  public List<DepartmentEntity> findDepartmentAll() {
    return departmentRepository.findAll();
  }
}
