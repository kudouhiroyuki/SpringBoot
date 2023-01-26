package com.example.demo.user;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import com.example.demo.domain.entity.UserEntity;
import com.example.demo.domain.service.DepartmentService;
import com.example.demo.domain.service.UserService;
import com.example.demo.domain.entity.DepartmentEntity;
import com.example.demo.user.dto.request.UserIndexGetRequestDto;

@Controller
@RequestMapping("/user")
public class UserController {
  private final UserService userService;
  private final DepartmentService departmentService;
	
  @Autowired
  public UserController(UserService userService, DepartmentService departmentService) {
    this.userService = userService;
	this.departmentService = departmentService;
  }

  @GetMapping
  public String index(Model model) {
    List<UserEntity> users = userService.findUserAll();
    model.addAttribute("users", users);
    return "user/index";
  }

  @GetMapping("/create")
  public String create(Model model) {
    List<DepartmentEntity> departments = departmentService.findDepartmentAll();
    model.addAttribute("departments", departments);
    return "user/create";
  }
  
  @GetMapping("/{id}")
  public String edit(@PathVariable int id, Model model) {
    Optional<UserEntity> user = userService.findUserById(id);
	model.addAttribute("user", user.get());
    return "user/edit";
  }
  
  @PostMapping
  public String store(UserEntity body) {
    userService.createUser(body);
    return "redirect:/user";
  }
}
