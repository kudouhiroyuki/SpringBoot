package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.DepartmentEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import com.example.demo.service.DepartmentService;

@Controller
@RequestMapping("/users") 
public class UserController {
	
  @Autowired
  private UserService userService;
  @Autowired
  private DepartmentService departmentService;
	
  @GetMapping
  public String index(Model model) {
    List<UserEntity> users = userService.findUserAll();
    model.addAttribute("users", users);
    return "users/index";
  }
  
  @GetMapping("/create")
  public String create(Model model) {  
    List<DepartmentEntity> departments = departmentService.findUserAll();
    model.addAttribute("departments", departments);
    return "users/create";
  }
  
  @GetMapping("/{id}")
  public String edit(@PathVariable int id, Model model) {
    Optional<UserEntity> users = userService.findUserById(id);
    List<DepartmentEntity> departments = departmentService.findUserAll();
	model.addAttribute("users", users);
	model.addAttribute("departments", departments);
    return "users/edit";
  }
  
  @PostMapping
  public String store(UserEntity user) {
    userService.createUser(user);
    return "redirect:/users";
  }
  
  @PutMapping("/{id}")
  public String update(UserEntity user) {
    userService.updateUser(user);
    return "redirect:/users";
  }
  
  @DeleteMapping("/{id}")
  public String destroy(@PathVariable int id) {
    userService.destroyUser(id);
    return "redirect:/users";
  }
}
