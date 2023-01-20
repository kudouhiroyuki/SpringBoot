package com.example.demo.users;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
  @Autowired
  JdbcTemplate jdbcTemplate;
  
  public List<Map<String, Object>> findUsers() {
    String sql = "SELECT * FROM users";
    return jdbcTemplate.queryForList(sql);
  }
  
  public List<Map<String, Object>> findUserById(int id) {
	String sql = "SELECT * FROM users WHERE id =" + id;
	return jdbcTemplate.queryForList(sql);
  }
}
