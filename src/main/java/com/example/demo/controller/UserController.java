package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.UsersEntity;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/users") 
public class UserController {
	
  @Autowired
  private UserService userService;
	
  @GetMapping
  public String index(Model model) {
    List<UsersEntity> users = userService.findUserAll();
    model.addAttribute("users", users);
    return "users/index";
  }
  
  @GetMapping("/create")
  public String create() {
    return "users/create";
  }
  
  @GetMapping("/{id}")
  public String edit(@PathVariable int id, Model model) {
    Optional<UsersEntity> users = userService.findUserById(id);
	model.addAttribute("users", users);
    return "users/edit";
  }
  
  @PostMapping
  public String store(Object body) {
    userService.createUser(body);
    return "redirect:/users";
  }
}
