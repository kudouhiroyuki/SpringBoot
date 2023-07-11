package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.DepartmentEntity;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
  @Autowired
  private DepartmentRepository departmentRepository;
	
  public List<DepartmentEntity> findDepartmentAll() {
    return departmentRepository.findAll();
  }
  
  public void createDepartment(DepartmentEntity department) {
    departmentRepository.save(department);
  }
}
