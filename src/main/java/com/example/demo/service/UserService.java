package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
  @Autowired
  private UserRepository userRepository;
	
  public List<UserEntity> findUserAll() {
    return userRepository.findAll();
  }
  
  public Optional<UserEntity> findUserById(int id) {
    return userRepository.findById(id);
  }
  
  public void createUser(UserEntity body) {
    userRepository.save(body);
  }
}
