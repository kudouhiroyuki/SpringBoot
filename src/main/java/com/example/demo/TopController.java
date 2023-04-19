package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {	
	
  @Autowired
  private JdbcTemplate jdbcTemplate;
  
  @GetMapping("/")
  public String demo(Model model) {
    model.addAttribute("message", "index");
  
    String sql = "SELECT * FROM department";
    List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
  
    System.out.println("test");
    System.out.println(list);
    
    return "index";
  }
}
