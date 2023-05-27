package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/departments") 
public class DepartmentController {

  @GetMapping
  public String index(Model model) {
    model.addAttribute("message", "DepartmentController index");   
    return "index";
  }
}
