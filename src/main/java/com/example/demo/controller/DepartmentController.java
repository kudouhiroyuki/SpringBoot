package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.DepartmentEntity;
import com.example.demo.service.DepartmentService;

@Controller
@RequestMapping("/departments") 
public class DepartmentController {
  
  @Autowired
  private DepartmentService departmentService;

  @GetMapping
  public String index(Model model) {	
    List<DepartmentEntity> departments = departmentService.findDepartmentAll();
    model.addAttribute("departments", departments);
    return "departments/index";
  }
  
  @GetMapping("/create")
  public String create(Model model) {
    model.addAttribute("departmentEntity", new DepartmentEntity());
    return "departments/create";
  }
  
  @PostMapping
  public String store(@Validated @ModelAttribute DepartmentEntity department, BindingResult bindingResult, Model model) {
    if (bindingResult.hasErrors()) {
      return "departments/create";
    }
    departmentService.createDepartment(department);
    return "redirect:/departments";
  }
}
