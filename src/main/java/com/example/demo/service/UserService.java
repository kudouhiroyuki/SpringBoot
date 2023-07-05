package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.UserEntity;
import com.example.demo.entity.DepartmentEntity;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.DepartmentRepository;

@Service
public class UserService {
  
  @Autowired
  private UserRepository userRepository;
  
  @Autowired
  private DepartmentRepository departmentRepository;
  
  public List<UserEntity> findUserAll() {
    return userRepository.findAll();
  }
  
  public Optional<UserEntity> findUserById(int id) {
    return userRepository.findById(id);
  }
  
  public void createUser(UserEntity user) {
    DepartmentEntity department = departmentRepository.findByDepartmentIdIs(user.getDepartmentId());
    user.setDepartment(department);
    userRepository.save(user);
  }
  
  public void updateUser(UserEntity user) {
    DepartmentEntity department = departmentRepository.findByDepartmentIdIs(user.getDepartmentId());
    user.setDepartment(department);  
    user.setId(user.getId());
    userRepository.save(user);
  }
  
  public void destroyUser(int id) {
    userRepository.deleteById(id);
  }
}
