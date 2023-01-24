package com.example.demo.user;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user.repository.UserRepository;
import com.example.demo.user.entity.UserEntity;

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
