package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.DepartmentEntity;
import com.example.demo.service.DepartmentService;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/departments") 
public class DepartmentController {
	
  @Autowired
  private DepartmentService departmentService;

  @GetMapping
  public String index(Model model) {
    List<DepartmentEntity> departments = departmentService.findUserAll();
    model.addAttribute("departments", departments);
    return "departments/index";
  }
}
