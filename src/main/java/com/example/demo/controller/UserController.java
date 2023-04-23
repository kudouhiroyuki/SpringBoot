package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.UserService;

@Controller
@RequestMapping("/users") 
public class UserController {
	
  @Autowired
  private UserService userService;
	
  @GetMapping
  public String index(Model model) {
    List<?> users = userService.findUserAll();
    model.addAttribute("users", users);
    return "users/index";
  }
}
