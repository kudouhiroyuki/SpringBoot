package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.entity.DepartmentEntity;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.DepartmentRepository;

@Service
public class EmployeeService {
  
  @Autowired
  private EmployeeRepository employeeRepository;
  
  @Autowired
  private DepartmentRepository departmentRepository;
  
  public List<EmployeeEntity> findEmployeeAll() {
    return employeeRepository.findAll();
  }
  
  public Optional<EmployeeEntity> findEmployeeById(int id) {
    return employeeRepository.findById(id);
  }
  
  public void createEmployee(EmployeeEntity employee) {
    DepartmentEntity department = departmentRepository.findByDepartmentIdIs(employee.getDepartmentId());
    employee.setDepartment(department);
    employeeRepository.save(employee);
  }
  
  public void updateEmployee(EmployeeEntity employee) {
    DepartmentEntity department = departmentRepository.findByDepartmentIdIs(employee.getDepartmentId());
    employee.setDepartment(department);  
    employee.setId(employee.getId());
    employeeRepository.save(employee);
  }
  
  public void destroyEmployee(int id) {
    employeeRepository.deleteById(id);
  }
}
