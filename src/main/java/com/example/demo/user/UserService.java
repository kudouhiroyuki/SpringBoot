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
  
  public List<UserEntity> findUsers() {
    return userRepository.findAll();
  }
  
  public Optional<UserEntity> findById(int id) {
    return userRepository.findById(id);
  }
  
  public void createUser(Object body) {
    String sql = "INSERT INTO users(userName, password, address, age, departmentId, createdAt, updateAt) VALUES(?, ?, ?, ?, ?, ?, ?);";
//    jdbcTemplate.update(sql,  body, "password", "test@gmail.com", "20", "A0001", "2023-01-18T06:25", "2023-01-18T06:25");
  }
}
