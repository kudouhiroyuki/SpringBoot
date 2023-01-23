package com.example.demo.users;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.users.repository.UserRepository;

@Service
public class UsersService {
  @Autowired
  private UserRepository userRepository;
  
  public List<?> findUsers() {
    return userRepository.findAll();
  }
  
  public List<Map<String, Object>> findUserById(int id) {
	String sql = "SELECT * FROM users WHERE id =" + id;
	return null;
  }
  
  public void createUser(Object body) {
    String sql = "INSERT INTO users(userName, password, address, age, departmentId, createdAt, updateAt) VALUES(?, ?, ?, ?, ?, ?, ?);";
//    jdbcTemplate.update(sql,  body, "password", "test@gmail.com", "20", "A0001", "2023-01-18T06:25", "2023-01-18T06:25");
  }
}
