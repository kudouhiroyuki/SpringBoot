package com.example.demo.users;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.users.dto.request.UsersCreateRequestDto;


@Controller
@RequestMapping("/users")
public class UsersController {
  @Autowired
  private JdbcTemplate jdbcTemplate;
	
  @GetMapping
  public String index(Model model) {
    String sql = "SELECT * FROM users";
    List<Map<String, Object>> users = jdbcTemplate.queryForList(sql);
    model.addAttribute("users", users);
    return "users/index";
  }
  
  @GetMapping("/create")
  public String create(@ModelAttribute UsersCreateRequestDto usersCreateRequestDto) {
    return "users/create";
  }
}
