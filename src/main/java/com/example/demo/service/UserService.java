package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
  @Autowired
  private UserRepository userRepository;
	
  public List<?> findUserAll() {
    return userRepository.findAll();
  }
}
